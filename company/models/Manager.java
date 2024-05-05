package company.models;

import company.abstracts.Employee;

public class Manager extends Employee {

  public Manager(String name, Double salary, Integer id) {
    super(name, salary, id);
  }

  @Override
 
  public void work() {
    System.out.println("Manager " + this.getName() + " is managing.");
  }
}