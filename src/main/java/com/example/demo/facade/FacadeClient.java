package com.example.demo.facade;

public class FacadeClient {
  public static void run() {
    // decoupled systems from client and moved to facade
    MasterRemoteFacade masterRemoteFacade = new MasterRemoteFacade();

    // Facade simplified code and reduced complexity
    masterRemoteFacade.turnOn();
    masterRemoteFacade.turnOFF();
  }
}
