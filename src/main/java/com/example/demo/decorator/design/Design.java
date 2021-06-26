package com.example.demo.decorator.design;

import com.example.demo.decorator.cake.Cake;

public abstract class Design extends Cake {
  private Cake cake;

  @Override
  public String getIngredients() {
    return "decoration using different addon items";
  }
}
