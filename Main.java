import company.abstracts.Employee;
import company.interfaces.Employable;
import company.models.Manager;
import company.models.Worker;

public class Main {
  public static void main(String[] args) {
    Worker worker1 = new Worker("Austin", 3000.0, 1);
    Worker worker2 = new Worker("Rob", 3500.0, 2);
    Worker worker3 = new Worker("Anna", 3000.0, 3);
    Worker worker4 = new Worker("Dave", 4500.0, 4);
    Manager manager = new Manager("Caroline", 4000.0, 5);

    Object[] workers = { worker1, worker2, worker3, worker4, manager };

    for (Object worker : workers) {
      System.out.println("Salary: " + ((Employee) worker).getSalary());
      ((Employable) worker).work();
    }
  }
}