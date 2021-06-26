package com.example.demo.bridge;

public class BridgeClient {
  public static void run() {
    TV tv = new SamsungTV();

    UniversalRemote remote = new UniversalRemote(tv);
    remote.turnOn();
    remote.turnOff();
    remote.setChannelKeyboard(23);

    tv = new LgTV();

    remote = new UniversalRemote(tv);
    remote.turnOn();
    remote.turnOff();
    remote.setChannelKeyboard(1101);
  }
}
