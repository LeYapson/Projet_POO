package com.ynov.oop.ressource;

import com.ynov.oop.EndTurnAction;

public class Ressource implements EndTurnAction {
    
    private int value;
    private int production;

    //constructor
    protected Ressource(int newValue,int newProduction){
        this.value = newValue;
        this.production = newProduction;
    }

    // this is used at the end of each turn to increase the current value of this ressource
    @Override
    public void endTurnAction() {
        this.value = this.value + this.production;
    }

    //this method will be used by a building (city, forest, ...) to construct itself
    public void use(int ressourceUsed) { 
        this.value = this.value - ressourceUsed; 
    }

    //this method increase the production of this ressource every turn
    public void increaseProduction(int productionIncrease) { 
        this.production += productionIncrease;
    }

    public int getValue(){
        return this.value;
    }
    
    public int getProduction(){
        return this.production;
    }
}
