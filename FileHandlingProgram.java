import java.io.*;

public class FileHandlingProgram {
    public static void main(String[] args) {
        // Check if the filename is provided as a command line argument
        if (args.length == 0) {
            System.out.println("Please provide the filename as a command line argument.");
            return;
        }

        String filename = args[0];
        File file = new File(filename);

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {

            // Display the contents of the file if it exists
            if (file.exists()) {
                System.out.println("Contents of the file:");
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } else {
                System.out.println("File does not exist. Creating a new file.");
            }

            // Ask the user if they want to add data to the end of the file
            System.out.print("Do you want to add data at the end of the file? (Yes/No): ");
            try (BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in))) {
                String userResponse = userInputReader.readLine();

                // If the user wants to add data, accept input and append to the file
                if ("Yes".equalsIgnoreCase(userResponse.trim())) {
                    System.out.println("Type your data below. Type 'exit' on a new line to stop.");

                    String input;
                    while (!(input = userInputReader.readLine()).equalsIgnoreCase("exit")) {
                        writer.write(input);
                        writer.newLine();
                    }
                    System.out.println("Data added to the file.");
                } else {
                    System.out.println("Program terminated.");
                }
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
