package com.java;

import java.util.*;

/*
For a grocery shop's delivery service, where maintaining
a list of products for a particular customer is hectic due to all
the things done manually till this point. The owner wants to release
the load of his or her employees by automating the whole process
of adding or removing the items or products from the list
and sorting the final list in the desired order.

GOAL: Write code that will run when any item is added
      or deleted from a list of products.

Business case: We wish to present a uniform, consist list of products
               when quoting customers. This is currently manually done
               meaning it as subject to human error and is time-consuming.

User Story: As a sales person I dread having to add one or several
            products to the list and then having to switch to manually rearrange the sort
            order of the products. It would be much easier if the products automatically
            sorted themselves for me in a consistent manner.

Specifications:
  * Must sort the products utilizing product name, type, family, unit and any other
    relevant fields.
  * Initial sort order must be: All eatables, all Household products and
    all bathing products.
    Within these categories they can be further sorted first alphanumerically
    and then by unit.
  * Must have a fallback to handle products that do not explicitly fall into a
    predefined category. The fallback should use a clear logic that would make sense
    to a casual observer.
  * Must fail gracefully. If the sort fails other actions should continue and add
    or delete should continue unabated.

 Example expected output
 Biscuits
 Fruit Cake
 Cooling Oil
 Detergent
 Washing powder
 Bath towel
 Body Wash
 Hand sanitizer
 Shampoo
*/
public class GroceryShop {
    List<String> eatable=new ArrayList<>();
    List<String> household=new ArrayList<>();
    List<String> bath=new ArrayList<>();
    public void insert(String type, String name){
        switch (type) {
            case "eatable" -> {
                eatable.add(name.toLowerCase());
            Collections.sort(eatable);
            }
            case "household" -> {
                household.add(name.toLowerCase());
            Collections.sort(household);
            }
            case "bath" -> {
                bath.add(name.toLowerCase());
            Collections.sort(bath);
            }
        }
    }
    public void remove(String type,String name){
        switch (type){
            case "eatable"->eatable.remove(name.toLowerCase());
            case "household"->household.remove(name.toLowerCase());
            case "bath"->bath.remove(name.toLowerCase());
        }
    }
    public void printList(){
        for (String s : eatable) System.out.println(s);
        for (String s : household) System.out.println(s);
        for (String s : bath) System.out.println(s);
    }

    public static void main(String[] args) {
        GroceryShop shop=new GroceryShop();
        shop.eatable.add("biscuits");
        shop.eatable.add("fruit cake");
        shop.household.add("cooking oil");
        shop.household.add("detergent");
        shop.household.add("washing powder");
        shop.bath.add("bath towel");
        shop.bath.add("body wash");
        shop.bath.add("hand sanitizer");
        shop.bath.add("shampoo");
        shop.printList();
        String s;
        do{
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Add\n2.Remove");
        String add=scan.nextLine();
        System.out.println("Enter type of product: (eatable,household,bath)");
        String type=scan.nextLine();
        System.out.println("Enter product name: ");
        String name=scan.nextLine();
        if(add.equals("1"))shop.insert(type,name);
        else if(add.equals("2")) shop.remove(type,name);
        shop.printList();
            System.out.println("Do you want to continue? (y/n)");
            s=scan.nextLine();
        }while (s.equals("y"));
    }
}
