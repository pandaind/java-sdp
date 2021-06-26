package com.example.demo.bridge;

public class BridgeRemoteControl {
  // Introduced has a relationship
  private TV tv;

  public BridgeRemoteControl(TV tv) {
    this.tv = tv;
  }

  public void turnOn() {
    tv.on();
  }

  public void turnOff() {
    tv.off();
  }

  public void setChannel(int channel) {
    tv.switchProgram(channel);
  }

  // additional features
  public void recordProgram() {
    System.out.println("IndependentRemoteControl use keyword to set channel.");
  }
}
