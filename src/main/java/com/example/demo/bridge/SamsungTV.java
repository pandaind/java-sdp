package com.example.demo.bridge;

public class SamsungTV implements TV {
  @Override
  public void on() {
    System.out.println("Samsung is turned on.");
  }

  @Override
  public void off() {
    System.out.println("Samsung is turned off.");
  }

  @Override
  public void switchProgram(int channel) {
    System.out.println("Samsung: channel - " + channel);
  }
}
