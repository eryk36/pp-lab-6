package company.models;

import company.abstracts.Employee;

public class Manager extends Employee {

  public Manager(String name, Double salary, Integer id, String hireDate) {
    super(name, salary, id, hireDate, "Manager");
  }

  @Override
 
  public void work() {
    System.out.println("Manager " + this.getName() + " is managing.");
  }
}