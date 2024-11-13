import java.io.*;
public class StudentInfoFileHandling 
{
        public static void main(String[] args) 
        {
        String name, city, phone;
        int age;
        double weight, height;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) 
        {
            System.out.println("Enter student information:");

            System.out.print("Name: ");
            name = reader.readLine();

            System.out.print("Age: ");
            age = Integer.parseInt(reader.readLine());

            System.out.print("Weight: ");
            weight = Double.parseDouble(reader.readLine());

            System.out.print("Height: ");
            height = Double.parseDouble(reader.readLine());

            System.out.print("City: ");
            city = reader.readLine();

            System.out.print("Phone: ");
            phone = reader.readLine();
        } catch (IOException | NumberFormatException e) 
        {
            System.err.println("Error reading input");
            return;
        }
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("student_info.data"))) 
        {
            dataOutputStream.writeUTF(name);
            dataOutputStream.writeInt(age);
            dataOutputStream.writeDouble(weight);
            dataOutputStream.writeDouble(height);
            dataOutputStream.writeUTF(city);
            dataOutputStream.writeUTF(phone);

            System.out.println("Student information written to file successfully.");
        } catch (IOException e) 
        {
            System.err.println("Error writing to file.");
            return;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("student_info.dat"))) 
        {
            System.out.println("\nReading student information from file:");

            String retrievedName = dataInputStream.readUTF();
            int retrievedAge = dataInputStream.readInt();
            double retrievedWeight = dataInputStream.readDouble();
            double retrievedHeight = dataInputStream.readDouble();
            String retrievedCity = dataInputStream.readUTF();
            String retrievedPhone = dataInputStream.readUTF();

            System.out.println("Name: " + retrievedName);
            System.out.println("Age: " + retrievedAge);
            System.out.println("Weight: " + retrievedWeight);
            System.out.println("Height: " + retrievedHeight);
            System.out.println("City: " + retrievedCity);
            System.out.println("Phone: " + retrievedPhone);
        } catch (IOException e) 
        {
            System.err.println("Error reading from file.");
        }
    }
}
