package com.ynov.oop.building;

public class Building {

  private String name;

  //constructor
  protected Building(String newName) {
    this.name = newName;
  }

  public String getName() {
    return this.name;
  }
}