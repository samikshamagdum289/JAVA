import java.io.*;

public class FileManupulation {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileManipulation <filename>");
            return;
        }

        String filename = args[0];
        BufferedReader reader = null;
        BufferedWriter writer = null;
        boolean fileExists = false;

        try {
            File file = new File(filename);
            fileExists = file.exists();

            reader = new BufferedReader(new FileReader(filename));

            System.out.println("File contents:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            if (fileExists) {
                System.out.print("Do you want to add data at the end of the file? (Yes/No): ");
                BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
                String response = userInputReader.readLine().trim();

                if (response.equalsIgnoreCase("Yes")) {
                    writer = new BufferedWriter(new FileWriter(filename, true));
                    System.out.println("Enter data to append (type 'exit' on a new line to stop):");

                    while (!(line = userInputReader.readLine()).equalsIgnoreCase("exit")) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            } else {
                writer = new BufferedWriter(new FileWriter(filename));
                System.out.println("File created. Enter data (type 'exit' on a new line to stop):");

                while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            System.out.println("Data appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

