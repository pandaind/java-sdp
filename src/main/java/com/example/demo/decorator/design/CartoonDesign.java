package com.example.demo.decorator.design;

import com.example.demo.decorator.cake.Cake;

public class CartoonDesign extends Design {
  private Cake baseCake;

  public CartoonDesign(Cake cake) {
    baseCake = cake;
  }

  @Override
  public double getCost() {
    return baseCake.getCost() + 2.32;
  }

  @Override
  public String getIngredients() {
    return "decoration using candies";
  }
}
