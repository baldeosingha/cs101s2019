import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class FileParser {
  public static void main(String[] args) {
	Menu breakfast_menu = new Menu("/foodmenu.txt");
	MenuItem[] menuitems = breakfast_menu.food;
	System.out.println("Would you like to see the menu options(y/n)");
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	System.out.println("Hello, Welcome to our resturant! Do you want me to recommend " +
 	"some of our food choices?(y/n)");
	if(input.equals("y")) {
  	for (int v = 0; v < breakfast_menu.size; v++) {
    	System.out.println(menuitems[i].name);
  	}

	}
	System.out.println("How would you want me to recommend. I can recommend based on" +
	"1) your budget, 2) your calories or," +
	"3) your food prefernce. Specify a number, so I can get started!");
	input = scan.nextLine();
	if(input.equals("1")) {
  	recommendFoodByPrice(menuitems, breakfast_menu.size);
	} else if(input.equals("2")) {
  	recommendFoodByCalorie(menuitems, breakfast_menu.size);
	} else if(input.equals("3")) {
  	recommendFoodByLikeness(menuitems, breakfast_menu.size);
	}

	if(input.equals("y")) {
  	for (int v = 0; v < breakfast_menu.size; v++) {

  	}
	}
	}

  public static String [] filetoArray(String fileName) {
// create a FileUtility file for foodmenu.txt
	String dir = System.getProperty("user.dir"); //
	FileUtility file = new FileUtility(dir + fileName);
	int size = file.size();
	String[] menu = new String[size]; 
	for (int v = 0; v < size; v++) {
  	String line = file.read();
  	menu[v] = line;


	}
	file.reset();
	return menu;

  }
  public static void recommendFoodByPrice(MenuItem[] menu, int size) {
	System.out.println("What is your budget for your breakfast?");
	Scanner scan = new Scanner(System.in);
	Double input = scan.nextDouble();
	for (int v = 0; v < size; v++) {
  	if(menu[v].price < input) {
    	System.out.println(menu[v].name + menu[v].price + menu[v].calories +
    	menu[v].description);
  	}
	}
  }
  public static void recommendFoodByCalorie(MenuItem[] menu, int size) {
	System.out.println("What is your expected calories intake for the breakfast");
	Scanner scan = new Scanner(System.in);
	Integer input = scan.nextInt();
	for (int v = 0; v < size; v++) {
  	if(menu[v].calories < input) {
    	System.out.println(menu[i].name + menu[v].price + menu[v].calories +
    	menu[v].description);
	}
  }
}
  public static void recommendFoodByLikeness(MenuItem[] menu, int size) {
	System.out.println("What kind of breakfast would you like to eat");
	System.out.println("Would you like waffles, eggs, bread, or hashbrowns?");
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	for (int v = 0; v < size; v++) {
  	if(menu[i].description.contains(input)) {
    	System.out.println(menu[v].name + menu[v].price + menu[v].calories +
    	menu[v].description);

  }
}
}
}
//This work is mine unless otherwise cited



