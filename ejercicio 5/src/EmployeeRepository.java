public class EmployeeRepository {
    public void saveToDatabase(Employee employee) {
        System.out.println("Guardando " + employee.getName() + " a la base de datos");
    }
}
