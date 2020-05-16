import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        int employeeNumber = EmployeeUtils.countLines();
        Employee[] employees = EmployeeUtils.createEmployees(employeeNumber);

        Double averageSalary = Statistics.getAverageSalary(employees);
        Double highestSalary = Statistics.getHighestSalary(employees);
        Double lowestSalary = Statistics.getLowestSalary(employees);
        int employeesNumber = Statistics.getEmployeesNumber(employees);
        int employeesNumberIt = Statistics.getDepartmentEmployeesNumber(employees, "It");
        int employeesNumberManagement = Statistics.getDepartmentEmployeesNumber(employees, "Management");
        int employessNumberSupport = Statistics.getDepartmentEmployeesNumber(employees, "Support");

        try {
            String fileName = "daneFirmy.txt";
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter dane = new BufferedWriter(fileWriter);
            dane.write("średnia wypłata: " + averageSalary);
            dane.newLine();
            dane.write("Najwyższa wypłata: " + highestSalary);
            dane.newLine();
            dane.write("Najniższa wypłata: " + lowestSalary);
            dane.newLine();
            dane.write("Liczba pracowników: " + employeeNumber);
            dane.newLine();
            dane.write("Liczba pracowników w dziale It: " + employeesNumberIt);
            dane.newLine();
            dane.write("Liczba pracowników w dziale Management: " + employeesNumberManagement);
            dane.newLine();
            dane.write("Liczba pracowników w dziale Support: " + employessNumberSupport);
            dane.newLine();
            dane.close();
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku!");
        }
    }
}
