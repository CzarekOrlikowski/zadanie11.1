import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeUtils {

    public static int countLines() throws FileNotFoundException {
        String fileName = "C:\\Pliki Czarek\\JAVASTART\\zadanie11.1\\src\\dane.txt";
        File file = new File(fileName);
        int lineNumber = 0;

        try (Scanner scan = new Scanner(file)) {

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                lineNumber++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku!");
        }
        return lineNumber;
    }

    public static Employee[] createEmployees(int lineNumber) throws FileNotFoundException {
        String fileName = "C:\\Pliki Czarek\\JAVASTART\\zadanie11.1\\src\\dane.txt";
        File file = new File(fileName);
        Employee[] employees = new Employee[lineNumber];
        int i = 0;

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(";");
                String firstName = data[0];
                String lastName = data[1];
                String pesel = data[2];
                String department = data[3];
                double salary = Double.valueOf(data[4]);
                employees[i] = new Employee(firstName, lastName, pesel, department, salary);
                i++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku!");
        }
        return employees;
    }

}
