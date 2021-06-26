package com.example.demo.flyweight;

public interface Star {
  void displayBrightness();
}

class BrightStar implements Star {

  private String brightness;

  public BrightStar() {
    this.brightness = "bright";
  }

  @Override
  public void displayBrightness() {
    System.out.println("Star with brightness :" + brightness);
  }

  @Override
  public String toString() {
    return "Star with brightness :" + brightness;
  }
}

class DimStar implements Star {

  private String brightness;

  public DimStar() {
    this.brightness = "dim";
  }

  @Override
  public void displayBrightness() {
    System.out.println("Star with brightness :" + brightness);
  }

  @Override
  public String toString() {
    return "Star with brightness :" + brightness;
  }
}

class DullStar implements Star {

  private String brightness;

  public DullStar() {
    this.brightness = "dull";
  }

  @Override
  public void displayBrightness() {
    System.out.println("Star with brightness :" + brightness);
  }

  @Override
  public String toString() {
    return "Star with brightness :" + brightness;
  }
}
