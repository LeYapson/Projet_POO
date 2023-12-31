package com.ynov.oop.building;

import com.ynov.oop.globalparameter.HaveGlobalParameter;
import com.ynov.oop.ressource.Cost;
//the class containing the characteristics of a forest
public class Forest extends Building {

  public Forest() {
    super("foret");
  }

  public static Cost constructionCost = new Cost(0, 0, 3);
  
  //add 1 oxygen in the total of oxygen
  public void effect(HaveGlobalParameter haveGlobalParameter) {
    haveGlobalParameter.getOxygen().increaseOxygen(1);
  }
}