package com.example.demo.decorator.cake;

public class VanillaCake extends Cake {
  @Override
  public String getIngredients() {
    return " Vanilla ";
  }

  @Override
  public double getCost() {
    return 2;
  }
}
