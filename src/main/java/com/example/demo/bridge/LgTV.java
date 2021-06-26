package com.example.demo.bridge;

public class LgTV implements TV {
  @Override
  public void on() {
    System.out.println("LG is turned on.");
  }

  @Override
  public void off() {
    System.out.println("LG is turned off.");
  }

  @Override
  public void switchProgram(int channel) {
    System.out.println("LG: channel - " + channel);
  }
}
