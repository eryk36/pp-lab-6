import java.util.ArrayList;
import java.util.List;
import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
  public static void main(String[] args) {
    Worker worker1 = new Worker("Austin", 3000.0, 1, "2024-01-01");
    Worker worker2 = new Worker("Rob", 3500.0, 2, "2024-01-02");
    Worker worker3 = new Worker("Anna", 3000.0, 3, "2024-01-03");
    Worker worker4 = new Worker("Dave", 4500.0, 4, "2024-01-04");
    Manager manager = new Manager("Caroline", 4000.0, 5, "2024-01-05");

    List<Employee> employees = new ArrayList<>();
    employees.add(worker1);
    employees.add(worker2);
    employees.add(worker3);
    employees.add(worker4);
    employees.add(manager);

    for (Employee employee : employees) {
      System.out.println(employee.getName() + " (ID: " + employee.getId() + "), Position: " + employee.getPosition()
          + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary());
      employee.work();
    }

    Worker worker5 = new Worker("Austin2", 3000.0, 1, "2024-01-01");

    Worker worker6 = new Worker("Rob2", 3500.0, 9, "2024-01-02");
    Worker worker7 = new Worker("Dave2", 4500.0, 9, "2024-01-03");
    Manager manager2 = new Manager("Caroline2", 4000.0, 8, "2024-01-05");

    List<Employee> employees2 = new ArrayList<>();
    employees2.add(worker5);
    employees2.add(worker6);
    employees2.add(worker7);
    employees2.add(manager2);

    for (Employee employee : employees2) {
      System.out.println(employee.getName() + " has code: " + employee.hashCode());
    }

    System.out.println("is worker6 id to worker7 id: " + worker6.equals(worker7));
    System.out.println("is worker6 id to worker5 id: " + worker6.equals(worker5));
    System.out.println("is worker6 id to manager2 id: " + worker6.equals(manager2));

    employees.add(worker5);
    employees.add(worker6);
    employees.add(worker7);
    employees.add(manager2);

    Worker worker8 = new Worker("Austin3", 3000.0, 9, "2024-01-01");
    Manager manager3 = new Manager("Caroline3", 4000.0, 11, "2024-01-05");

    employees.add(worker8);
    employees.add(manager3);
    Double totalSalary = 0.0;
    Double totalManagerSalary = 0.0;
    Double totalWorkerSalary = 0.0;

    for (Employee employee : employees) {
      totalSalary += employee.getSalary();
      if (employee instanceof Manager) {
        totalManagerSalary += employee.getSalary();
      } else if (employee instanceof Worker) {
        totalWorkerSalary += employee.getSalary();
      }
    }

    System.out.println("Total salary: " + totalSalary);
    System.out.println("Total manager salary: " + totalManagerSalary);
    System.out.println("Total worker salary: " + totalWorkerSalary);

    for (Employee employee : employees) {
      for (Employee employee2 : employees) {
        if (employee.equals(employee2) && employee != employee2) {
          System.out.println(
              "Duplicated id: " + employee.getId() + " for " + employee.getName() + " same as " + employee2.getName());
        }
      }
    }

  }
}
  

  
