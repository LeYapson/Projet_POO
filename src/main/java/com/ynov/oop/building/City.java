package com.ynov.oop.building;

import com.ynov.oop.ressource.Cost;
import com.ynov.oop.ressource.ResourceStockpile;
//the class containing the characteristics of a city
public class City extends Building {

  public City() {
    super("Maison");
  }

  public static Cost constructionCost = new Cost(1, 0, 0);
  
  //add 1 credits in the total of credits every turn
  public void effect(ResourceStockpile resourceStockpile) {
    resourceStockpile.getCredits().increaseProduction(1);
  }
}