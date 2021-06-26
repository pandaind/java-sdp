package com.example.demo.decorator.cake;

public class ChocolateCake extends Cake {
  @Override
  public String getIngredients() {
    return " Chocolate ";
  }

  @Override
  public double getCost() {
    return 3;
  }
}
