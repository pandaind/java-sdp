package com.example.demo.flyweight;

public class FlyweightClient {
  public static void run() {
    // Create Landscape object which is responsible to display stars
    Landscape landscape = new Landscape();

    // Factory will provide star based on param
    // Note: Factory will cache objects for reuse
    // and will create new object only when it does not exist in cache.
    Star star = StarFactory.getStar("dull");

    landscape.displayStar(star, 65, 87);

    // No new object needs to be created, Factory provides reusable object
    // from cache which landscape displays
    landscape.displayStar(StarFactory.getStar("bright"), 34, 43);
    landscape.displayStar(StarFactory.getStar("bright"), 36, 47);
    landscape.displayStar(StarFactory.getStar("dull"), 34, 43);
    landscape.displayStar(StarFactory.getStar("dim"), 34, 43);
    landscape.displayStar(StarFactory.getStar("dim"), 34, 43);
  }
}
