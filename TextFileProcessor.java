import java.io.*;

public class TextFileProcessor {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java TextFileProcessor <smpl.txt>");
            System.exit(1);
        }

        String filename = args[0];
        File file = new File(filename);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("Do you want to add data at the end of the file? (Yes/No)");
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            String response = inputReader.readLine();

            if (response.equalsIgnoreCase("Yes")) {
                System.out.println("Enter data to append to the file (type 'exit' to stop):");
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                while (!(line = inputReader.readLine()).equalsIgnoreCase("exit")) {
                    writer.write(line);
                    writer.newLine();
                }
                writer.close();
                System.out.println("Data appended to the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist. Creating a new file...");
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                System.out.println("Enter data to store in the file (type 'exit' to stop):");
                BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
                String line;
                while (!(line = inputReader.readLine()).equalsIgnoreCase("exit")) {
                    writer.write(line);
                    writer.newLine();
                }
                writer.close();
                System.out.println("Data stored in the file.");
            } catch (IOException ex) {
                System.err.println("Error creating new file: " + ex.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
