package com.example.demo.proxy;

public class Proxy extends Weather {
  private ConcreteWeather concreteWeather;

  @Override
  public void whoAmI() {
    System.out.println("\tMethod Call from " + this.getClass().getSimpleName() + " class");
    System.out.println("\t\tWeather forecast is overcast and rain\n");
    if (concreteWeather == null) {
      concreteWeather = new ConcreteWeather();
    }
    concreteWeather.whoAmI();
  }
}
