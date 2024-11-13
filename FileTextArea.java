import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileTextArea extends JFrame {
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public FileTextArea() {
        super("Simple Text Editor");

        // Create TextArea
        textArea = new JTextArea(20, 50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create a file chooser
        fileChooser = new JFileChooser();

        // Create menu bar and "File" menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");

        // Add components
        fileMenu.add(openItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Add scrollPane to the content pane
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Set up the frame
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add action listener to menu item
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });
    }

    private void openFile() {
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            readFile(selectedFile);
        }
    }

    private void readFile(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            textArea.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to read file","Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileTextArea().setVisible(true);
            }
        });
    }
}
 
    

