import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.*;

public class Quiiz implements ActionListener {

    public static void main(String[] args) {
        new Quiiz();
    }

    private int index = 0;
    private int correctGuesses = 0;
    private int totalQuestions;
    private int result;
    private int seconds = 20;

    private JFrame frame = new JFrame();
    private JTextField textfield = new JTextField();
    private JTextArea textarea = new JTextArea();
    private JButton buttonA = new JButton();
    private JButton buttonB = new JButton();
    private JButton buttonC = new JButton();
    private JButton buttonD = new JButton();
    private JLabel answerLabelA = new JLabel();
    private JLabel answerLabelB = new JLabel();
    private JLabel answerLabelC = new JLabel();
    private JLabel answerLabelD = new JLabel();
    private JLabel timeLabel = new JLabel();
    private JLabel secondsLeft = new JLabel();
    private JTextField numberRight = new JTextField();
    private JTextField percentage = new JTextField();
    private Timer timer;

    private String[] questions;
    private String[][] options;
    private char[] answers;

    private Connection connection;
    private String host = "localhost";
    private String root = "root";
    private String pass = "";
    private String database = "sy";

    public Quiiz() {
        initializeDatabaseConnection();
        initializeDatabaseData();

        totalQuestions = questions.length;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(null);
        frame.setResizable(false);

        textfield.setBounds(0, 0, 650, 50);
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);

        textarea.setBounds(0, 50, 650, 50);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25, 25, 25));
        textarea.setForeground(new Color(25, 255, 0));
        textarea.setFont(new Font("MV Boli", Font.BOLD, 25));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);

        buttonA.setBounds(0, 100, 100, 100);
        buttonA.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0, 200, 100, 100);
        buttonB.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonB.setFocusable(false);
        buttonB.setText("B");
        buttonB.addActionListener(this);

        buttonC.setBounds(0, 300, 100, 100);
        buttonC.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonC.setFocusable(false);
        buttonC.setText("C");
        buttonC.addActionListener(this);

        buttonD.setBounds(0, 400, 100, 100);
        buttonD.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonD.setText("D");
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);

        answerLabelA.setBounds(125, 100, 500, 100);
        answerLabelA.setBackground(new Color(50, 50, 50));
        answerLabelA.setForeground(new Color(25, 255, 0));
        answerLabelA.setFont(new Font("Times New Roman", Font.PLAIN, 35));

        answerLabelB.setBounds(125, 200, 500, 100);
        answerLabelB.setBackground(new Color(50, 50, 50));
        answerLabelB.setForeground(new Color(25, 255, 0));
        answerLabelB.setFont(new Font("MV Boli", Font.PLAIN, 35));

        answerLabelC.setBounds(125, 300, 500, 100);
        answerLabelC.setBackground(new Color(50, 50, 50));
        answerLabelC.setForeground(new Color(25, 255, 0));
        answerLabelC.setFont(new Font("MV Boli", Font.PLAIN, 35));

        answerLabelD.setBounds(125, 400, 500, 100);
        answerLabelD.setBackground(new Color(50, 50, 50));
        answerLabelD.setForeground(new Color(25, 255, 0));
        answerLabelD.setFont(new Font("MV Boli", Font.PLAIN, 35));

        secondsLeft.setBounds(535, 510, 100, 100);
        secondsLeft.setBackground(new Color(25, 25, 25));
        secondsLeft.setForeground(new Color(255, 0, 0));
        secondsLeft.setFont(new Font("Ink Free", Font.BOLD, 60));
        secondsLeft.setBorder(BorderFactory.createBevelBorder(1));
        secondsLeft.setOpaque(true);
        secondsLeft.setHorizontalAlignment(JTextField.CENTER);
        secondsLeft.setText(String.valueOf(seconds));

        timeLabel.setBounds(535, 475, 100, 25);
        timeLabel.setBackground(new Color(50, 50, 50));
        timeLabel.setForeground(new Color(255, 0, 0));
        timeLabel.setFont(new Font("MV Boli", Font.PLAIN, 16));
        timeLabel.setHorizontalAlignment(JTextField.CENTER);
        timeLabel.setText("timer");

        numberRight.setBounds(225, 225, 200, 100);
        numberRight.setBackground(new Color(25, 25, 25));
        numberRight.setForeground(new Color(25, 255, 0));
        numberRight.setFont(new Font("Ink Free", Font.BOLD, 50));
        numberRight.setBorder(BorderFactory.createBevelBorder(1));
        numberRight.setHorizontalAlignment(JTextField.CENTER);
        numberRight.setEditable(false);

        percentage.setBounds(225, 325, 200, 100);
        percentage.setBackground(new Color(25, 25, 25));
        percentage.setForeground(new Color(25, 255, 0));
        percentage.setFont(new Font("Ink Free", Font.BOLD, 50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.add(timeLabel);
        frame.add(secondsLeft);
        frame.add(answerLabelA);
        frame.add(answerLabelB);
        frame.add(answerLabelC);
        frame.add(answerLabelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textarea);
        frame.add(textfield);
        frame.setVisible(true);

        randomQuestion();
        nextQuestion();
    }

    private void initializeDatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, root, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void initializeDatabaseData() {
        try {
            String query = "SELECT * FROM mcq where level=1";
            PreparedStatement preparedStatement = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("No data found in the database.");
                System.exit(1);
            }

            resultSet.last();
            int rowCount = resultSet.getRow();
            resultSet.beforeFirst();

            questions = new String[rowCount];
            options = new String[rowCount][4];
            answers = new char[rowCount];

            int i = 0;
            while (resultSet.next()) {
                questions[i] = resultSet.getString("question");
                options[i][0] = resultSet.getString("optiona");
                options[i][1] = resultSet.getString("optionb");
                options[i][2] = resultSet.getString("optionc");
                options[i][3] = resultSet.getString("optiond");
                options[i][3] = resultSet.getString("optiond");
                answers[i] = resultSet.getString("answer").charAt(0);
                System.out.println(questions[i]);
                System.out.println(options[i][0]);
                System.out.println(options[i][1]);
                System.out.println(options[i][2]);
                System.out.println(options[i][3]);
                System.out.println(answers[i]);
                i++;
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void randomQuestion() {
        int i;
        Random r = new Random();
        for (i = questions.length - 1; i > 0; i--) {
            int index = r.nextInt(i + 1);

            String tempQuestion = questions[i];
            questions[i] = questions[index];
            questions[index] = tempQuestion;

            String[] tempOptions = options[i];
            options[i] = options[index];
            options[index] = tempOptions;

            char tempAnswer = answers[i];
            answers[i] = answers[index];
            answers[index] = tempAnswer;
        }
    }

    private void nextQuestion() {
        if (index >= totalQuestions) {
            showResults();
        } else {
            textfield.setText("Question " + (index + 1));
            textarea.setText(questions[index]);
            answerLabelA.setText(options[index][0]);
            answerLabelB.setText(options[index][1]);
            answerLabelC.setText(options[index][2]);
            answerLabelD.setText(options[index][3]);
            timer = new Timer(1000, e -> {
                seconds--;
                secondsLeft.setText(String.valueOf(seconds));
                if (seconds <= 0) {
                    displayAnswer();
                }
            });
            timer.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        disableButtons();

        if (e.getSource() == buttonA && answers[index] == 'a' ||
                e.getSource() == buttonB && answers[index] == 'b' ||
                e.getSource() == buttonC && answers[index] == 'c' ||
                e.getSource() == buttonD && answers[index] == 'd') {
            correctGuesses++;
        }

        displayAnswer();
    }

    private void disableButtons() {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
    }

    private void displayAnswer() {
        timer.stop();
        disableButtons();

        if (answers[index] != 'a')
            answerLabelA.setForeground(new Color(255, 0, 0));
        if (answers[index] != 'b')
            answerLabelB.setForeground(new Color(255, 0, 0));
        if (answers[index] != 'c')
            answerLabelC.setForeground(new Color(255, 0, 0));
        if (answers[index] != 'd')
            answerLabelD.setForeground(new Color(255, 0, 0));

        Timer pause = new Timer(3000, e -> {
            resetAnswerLabels();
            seconds = 20;
            secondsLeft.setText(String.valueOf(seconds));
            enableButtons();
            index++;
            nextQuestion();
        });
        pause.setRepeats(false);
        pause.start();
    }

    private void resetAnswerLabels() {
        answerLabelA.setForeground(new Color(25, 255, 0));
        answerLabelB.setForeground(new Color(25, 255, 0));
        answerLabelC.setForeground(new Color(25, 255, 0));
        answerLabelD.setForeground(new Color(25, 255, 0));
    }

    private void enableButtons() {
        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);
    }

    private void showResults() {
        disableButtons();

        result = (int) ((correctGuesses / (double) totalQuestions) * 100);

        textfield.setText("RESULTS!");
        textarea.setText("");
        answerLabelA.setText("");
        answerLabelB.setText("");
        answerLabelC.setText("");
        answerLabelD.setText("");
        numberRight.setText("(" + correctGuesses + "/" + totalQuestions + ")");
        percentage.setText(result + "%");
        frame.add(numberRight);
        frame.add(percentage);
    }
}
