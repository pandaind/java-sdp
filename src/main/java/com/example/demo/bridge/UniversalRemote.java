package com.example.demo.bridge;

public class UniversalRemote extends BridgeRemoteControl {
  public UniversalRemote(TV tv) {
    super(tv);
  }

  public void setChannelKeyboard(int channel) {
    setChannel(channel);
    System.out.println("IndependentRemoteControl use keyword to set channel.");
  }
}
