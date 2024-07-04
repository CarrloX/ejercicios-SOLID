public class EmployeeReport {
    public void generateReport(Employee employee) {
        System.out.println("Generando reporte para " + employee.getName());
        System.out.println("Nombre de Empleado: " + employee.getName());
        System.out.println("Salario de Empleado: " + employee.getSalary());
    }
}
