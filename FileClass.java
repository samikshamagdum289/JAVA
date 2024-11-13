import java.io.*;
public class FileClass {
    public static void main(String[] args) {
        String fileName = args[0];
        File file = new File(fileName);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

            // Check if file exists
            if (file.exists()) {
                String line;
                System.out.println("File content:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                // Ask user if they want to add data to the file
                System.out.print("Do you want to add ? (Y/N): ");
                BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
                String response = userInputReader.readLine().trim().toLowerCase();

                if (response.equals("y")) {
                    System.out.println("Enter data:");
                    String newData;
                    while (!(newData = userInputReader.readLine()).equalsIgnoreCase("exit")) {
                        writer.write(newData);
                        writer.newLine();
                    }
                    System.out.println("Data added successfully.");
                }
            } else {
                // If file doesn't exist, create a new one
                System.out.println("File doesn't exist.");

                System.out.println("Enter data to write to the file (type 'exit' on a new line to stop):");
                String newData;
                while (!(newData = reader.readLine()).equalsIgnoreCase("exit")) {
                    writer.write(newData);
                    writer.newLine();
                }
                System.out.println("Data written to the file successfully.");
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
O/P:
File content:
samiksha magdum
sarika magdumravi magdum
Do you want to add ? (Y/N): Y
Enter data:
Samruddhi mithari
exit
Data added successfully.