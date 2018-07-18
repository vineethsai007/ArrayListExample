package com.vinz;

import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList= new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice :");
            choice= scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;


            }
        }



    }
    private static void printInstructions(){
        System.out.println("\n Press");
        System.out.println("\t 0: To Print options/choices available");
        System.out.println("\t 1: To Print List of Grocery Items");
        System.out.println("\t 2: To add an item to the list");
        System.out.println("\t 3: To modify an item in the list");
        System.out.println("\t 4: To remove an item from the list");
        System.out.println("\t 5: To search for an item in the list");
        System.out.println("\t 6: To Quit this ");


    }
    private static void addItem(){
        System.out.println("Please enter the grocery item:");
        groceryList.addGroceryItem(scanner.nextLine());// whatever is typed in line is accepted and added as output;

    }
    private static void modifyItem(){
        System.out.println("enter item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem); //itemNo-1 because numbering starts from 0 to n-1 for n elements
    }
    private static void removeItem(){
        System.out.println("enter item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }
    private static void searchForItem(){
        System.out.println("Enter the item name that needs to be searched");
        String searchItem = scanner.nextLine();
        if(groceryList.getItem(searchItem)!=null) {
            System.out.println("Found " + searchItem + " in our GroceryList");
        }
            else {
            System.out.println("Item " + searchItem + "is not in your GroceryList ");
        }

            }
        }

