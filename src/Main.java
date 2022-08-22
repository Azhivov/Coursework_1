public class Main {

    static Employee[] employees = new Employee[10];
    private static Object sum;

    public static void main(String[] args) {
        employees[0] = new Employee("Ivan Ivanovich", 1, 5000.0);
        employees[1] = new Employee("Ivan Ivanovich", 1, 6000.0);
        employees[2] = new Employee("Ivan Ivanovich", 1, 7000.0);
        employees[3] = new Employee("Ivan Ivanovich", 1, 8000.0);
        employees[4] = new Employee("Ivan Ivanovich", 1, 51340.0);
        employees[6] = new Employee("Ivan Ivanovich", 1, 500.0);
        employees[7] = new Employee("Ivan Ivanovich", 1, 1000.0);

        System.out.println(getEmploeeMinSalary());
    }
public static void printAllEmployee() {
    for (int i = 0; i < employees.length; i++) {
        System.out.println(employees[i]);
    }
    }
    public static double getAndCalculateSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
    return sum;
    }
public static Employee getEmploeeMinSalary() {
    double minSalary = -1;
    Employee minSalaryEmpl = null;
    int index = -1;
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null) {
            minSalary = employees[0].getSalary();
            minSalaryEmpl = employees[i];
            index = i;
            break;
        }
    }

    for (int i = index; i < employees.length; i++) {
        if (employees[i] != null) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                minSalaryEmpl = employees [i];

            }
        }
    }
return minSalaryEmpl;
}
}
