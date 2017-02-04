package com.cubic.oopsassignment2;
// RetailItem- abstract superclass


 //Abstract superclass for RetailItem  hierarchy

public abstract class RetailItem{
  
  protected String name;
  

 //Initializes RetailItem data (constructor) 
  public RetailItem(String name) {
    
      this.name = name;
  }

 //Returns name of RetailItem 
   
  public final String getName() {
    return name;
  }

 // Returns cost of RetailItem 
  public abstract double getCost();

}