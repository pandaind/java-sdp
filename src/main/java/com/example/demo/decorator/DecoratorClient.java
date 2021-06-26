package com.example.demo.decorator;

import com.example.demo.decorator.cake.Cake;
import com.example.demo.decorator.cake.VanillaCake;
import com.example.demo.decorator.design.CandyDesign;
import com.example.demo.decorator.design.CartoonDesign;

public class DecoratorClient {
  public static void run() {
    // Plain Object
    Cake cake = new VanillaCake();
    System.out.println("Plain cake price without decorations - " + cake.getCost());

    // Decorated Object with addons
    cake = new CandyDesign(cake);
    System.out.println("Cake price with Candy decoration - " + cake.getCost());

    // Decorated Object with addons
    // Fun side, price of Cartoon decoration is more then cake itself :-)
    cake = new CartoonDesign(cake);
    cake = new CartoonDesign(cake);
    System.out.println("Cake price with double Cartoon decoration - " + cake.getCost());
  }
}
