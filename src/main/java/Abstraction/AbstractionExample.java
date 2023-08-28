package Abstraction;

public class AbstractionExample {

  public static void main(String[] args) {
    Contractor contractor = new Contractor("Maikel Reijneke", 30, 3);
    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Richard Reijneke", 20);

    int contractorSalary = contractor.calculateSalary();
    int fullTimeEmployeeSalary = fullTimeEmployee.calculateSalary();

    System.out.println("Contractor Salary: " + contractorSalary);
    System.out.println("Full-Time Employee Salary: " + fullTimeEmployeeSalary);
  }
}