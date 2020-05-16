import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        int employeeNumber = EmployeeUtils.lineCalculator();
        Employee[] employees = EmployeeUtils.tableCreator(employeeNumber);

        Double averageSalary = Statistics.averageSalary(employees);
        Double highestSalary = Statistics.highestSalary(employees);
        Double lowestSalary = Statistics.lowestSalary(employees);
        int employeesNumber = Statistics.employeesNumber(employees);
        int employeesNumberIt = Statistics.departmentEmployeesNumber(employees, "It");
        int employeesNumberManagement = Statistics.departmentEmployeesNumber(employees, "Management");
        int employessNumberSupport = Statistics.departmentEmployeesNumber(employees, "Support");

        try {
            String fileName = "daneFirmy.txt";
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter dane = new BufferedWriter(fileWriter);
            dane.write("średnia wypłata: " + averageSalary);
            dane.newLine();
            dane.write("Najwyższa wypłata: " + highestSalary);
            dane.newLine();
            dane.write("Najniższa wypłata: " + averageSalary);
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
