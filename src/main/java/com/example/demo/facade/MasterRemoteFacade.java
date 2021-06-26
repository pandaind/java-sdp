package com.example.demo.facade;

public class MasterRemoteFacade {
  // sub system is de coupled from client
  private TVRemote tvRemote;
  private SoundSystemRemote soundSystemRemote;
  private SetTopBoxRemote setTopBoxRemote;

  public MasterRemoteFacade() {
    tvRemote = new TVRemote();
    soundSystemRemote = new SoundSystemRemote();
    setTopBoxRemote = new SetTopBoxRemote();
  }

  // Master turn on takes care of all sub systems
  public void turnOn() {
    System.out.println();
    System.out.println("Turning ON all sub systems");
    tvRemote.turnOn();
    soundSystemRemote.turnOn();
    setTopBoxRemote.turnOn();
  }

  // Master turn off takes care of all sub systems
  public void turnOFF() {
    System.out.println();
    System.out.println("Turning OFF all sub systems");
    tvRemote.turnOff();
    soundSystemRemote.turnOff();
    setTopBoxRemote.turnOff();
  }
}
