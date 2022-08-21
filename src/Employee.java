public class Employee {
    private int id;
    private String fullName;
    private  int department;
    private double salary;
    private static int counter;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++ counter;
    }

    @Override
    public String toString() {
        return "Employee" +
                "id=" + id +
                ", fullName = '" + fullName + '\'' +
                ", department = " + department +
                ", salary = " + salary +
                '}';
    }

    public static void  printAllEmployee(){


}





    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }
}
