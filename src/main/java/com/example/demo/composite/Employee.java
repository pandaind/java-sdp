package com.example.demo.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private final String empName;
  private final Integer empId;

  // Composition of same object type
  private final List<Employee> subordinateEmployee = new ArrayList<>();

  public Employee(String empName, Integer empId) {
    this.empName = empName;
    this.empId = empId;
  }

  public void addSubordinate(Employee emp) {
    subordinateEmployee.add(emp);
  }

  public void removeSubordinate(Employee emp) {
    subordinateEmployee.remove(emp);
  }

  public void showEmployeeDetails() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    String node =
        subordinateEmployee.size() == 0 ? "No subordinates" : subordinateEmployee.toString();
    String level = subordinateEmployee.size() == 0 ? "Non Manger" : "Manager ";

    return "\n" + level + " {" + "empName='" + empName + '\'' + ",    subordinates =" + node + "}";
  }
}
