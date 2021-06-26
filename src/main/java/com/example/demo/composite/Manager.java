package com.example.demo.composite;

public class Manager {
  private final String empName;

  public Manager(String empName) {
    this.empName = empName;
  }

  @Override
  public String toString() {
    return "ManagerEmployee{" + "empName='" + empName + '\'' + '}';
  }
}
