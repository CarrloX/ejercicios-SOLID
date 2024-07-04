public class PayrollService {
    public void calculatePay(Employee employee) {
        double salary = employee.getSalary();
        double netSalary = salary * 0.8;
        System.out.println("Calculando el pago para " + employee.getName() + ": " + netSalary);
    }
}
