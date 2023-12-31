package com.ynov.oop.building;

import com.ynov.oop.globalparameter.HaveGlobalParameter;
import com.ynov.oop.ressource.Cost;
//the class containing the characteristics of a nuclear plant
public class NuclearPlant extends Building {

  public NuclearPlant() {
    super("springfield");
  }
  public static Cost constructionCost = new Cost(4, 2, 0);
  
  //add 1 temperature in the total of temperature
  public void effect(HaveGlobalParameter haveGlobalParameter) {
    haveGlobalParameter.getTemperature().increaseTemperature(1);
  }
}