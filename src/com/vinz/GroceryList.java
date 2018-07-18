package com.vinz;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>(); //ArrayList is a class so it calls empty constructor()
    public void addGroceryItem(String item){
        groceryList.add(item); //automatically adds item into the arrayList,space allocated, everything else is abstracted

    }
    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in you Arraylist");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+" element is "+ groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery Item "+(position+1)+" has been modified");

    }
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    public String getItem(String itemToBeSearched){
       // boolean exists = groceryList.contains(itemToBeSearched);
        int position = groceryList.indexOf(itemToBeSearched);
        if(position>=0){
            return groceryList.get(position);
        }
        return  null;
    }
}
