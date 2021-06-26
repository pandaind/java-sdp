package com.example.demo.decorator.design;

import com.example.demo.decorator.cake.Cake;

public class CandyDesign extends Design {
  private Cake baseCake;

  public CandyDesign(Cake cake) {
    baseCake = cake;
  }

  @Override
  public double getCost() {
    return baseCake.getCost() + .12;
  }

  @Override
  public String getIngredients() {
    return "decoration using candies";
  }
}
