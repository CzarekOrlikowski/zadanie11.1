public class Statistics {

    public static double getAverageSalary(Employee[] employees) {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumSalary += employees[i].getSalary();
        }
        return sumSalary / employees.length;
    }

    public static double getHighestSalary(Employee[] employees) {
        double highestSalary = 0;

        if (employees.length != 0) {
            highestSalary = employees[0].getSalary();
        } else {
            throw new NullPointerException("Brak danych!");
        }

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > highestSalary) {
                highestSalary = employees[i].getSalary();
            }
        }
        return highestSalary;
    }

    public static double getLowestSalary(Employee[] employees) {
        double lowestSalary = 0;

        if (employees.length != 0) {
            lowestSalary = employees[0].getSalary();
        } else {
            throw new NullPointerException("Brak danych!");
        }

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < lowestSalary) {
                lowestSalary = employees[i].getSalary();
            }
        }
        return lowestSalary;
    }

    public static int getEmployeesNumber(Employee[] employees) {
        int employeesNumber = 0;

        for (Employee employee : employees) {
            if (employees.length != 0) {
                employeesNumber++;
            } else {
                throw new NullPointerException("Brak danych");
            }
        }
        return employeesNumber;
    }

    public static int getDepartmentEmployeesNumber(Employee[] employees, String department) {
        int employeesNumber = 0;

        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                employeesNumber++;
            }
        }
        return employeesNumber;
    }
}