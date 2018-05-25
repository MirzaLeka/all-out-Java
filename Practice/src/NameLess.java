import java.util.*;
public class NameLess {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	
    String intro;
	
do {
    System.out.println("1. NEW GAME\n"
			+ "2. INSTRUCTIONS\n" //Opens a notepad: Controls, description, how it works
			+ "3. QUIT");
	intro = in.nextLine();
	
	switch (intro){
	
	case "1":
	newGame();
	break;
	
	case "2":
	instructions();
	break;
	
	case "3":
	quit();
	break;
	}
}while(!intro.equals("1") && !intro.equals("2") && !intro.equals("3"));	

}
	
static void newGame() {
	Scanner in = new Scanner(System.in);
	
	String x; //Name of player
	String grenade;
	

	
	System.out.println("Create new player"); /// create player, load player (collections)
	x = in.nextLine();
	
	
	
	System.out.println("Commander: Now come over and pick up the hand grenades.");
	System.out.println("Comrade Ali: These aren't grenades. These are potateos sir.\n"
			+ "Why are we using potatoes instead of real grenades?");
	System.out.println("Commander: Because real grenades are more valuable than you are.");
	
	System.out.println(x + " throw each grenade into windows three, four and five.");
	
	System.out.println("\n|4|\t|5|\t|6|");
	
do {
	System.out.println("Press G to throw a grenade into a window #4");
	grenade = in.nextLine();

}while(!grenade.equals("g") && !grenade.equals("G"));
	
	
System.out.println("Now the next window.");
grenade = in.nextLine();

///

System.out.println("That's enough " + x + ". Come over here and pick up a a pistol from the table.");
String use;

do {
System.out.println("NOTE: Press E to pick up TT-38.");
use = in.nextLine();

if (use.equals("e") || use.equals("E")) {
	System.out.println("Note: You picked up a pistol.");
}
}while(!use.equals("e") & !use.equals("E"));

System.out.println("Now switch to your rifle.");
String swit;
System.out.println("NOTE: Press 1 or 2 to switch weapons.");
swit = in.nextLine();
System.out.println("Ok, now switch back.");
swit = in.nextLine();



try {
System.out.print("_");
Thread.sleep(150);
System.out.print("_");
Thread.sleep(150);
System.out.print("_");
Thread.sleep(150);
System.out.print("_");
Thread.sleep(150);
System.out.print("_");
Thread.sleep(150);
System.out.print("_");
Thread.sleep(150);
System.out.print("_");
Thread.sleep(150); 
System.out.print("_\n");

System.out.println("|\t|");
Thread.sleep(250);
System.out.println("|\t|");
Thread.sleep(250);
System.out.println("|\t|");
Thread.sleep(250);
System.out.println("|\t|");
Thread.sleep(250);
System.out.println("|\t| \t\t Ammo:  Health: ");

System.out.print("¨");
Thread.sleep(150);
System.out.print("¨");
Thread.sleep(150);
System.out.print("¨");
Thread.sleep(150);
System.out.print("¨");
Thread.sleep(150);
System.out.print("¨");
Thread.sleep(150);
System.out.print("¨");
Thread.sleep(150);
System.out.print("¨");
Thread.sleep(150);
System.out.print("¨");
	
}catch(Exception e) {}

System.out.println("This your map. Arrow sign represents an enemy soldier.\n"
		+ "Don't forget to always look the direction of the arrow. That way you'll know if enemy is facing you or not.");

//CONTROLS
//Shoot
//Aim down sight
//Crouch
//Jump
//Use
//Reload
//Grenade
//Switch Weapons
//Melee
//W A S D
//View MAP
//ENEMIES: < > ^ 
//YOU: @
//OBJECTIVE: *
//Box [x] 
//Fence ---
//Wall |, _, ½
//Stairs/Ladders #


}

static void instructions() {
	System.out.println("OPEN INSTRUCTIONS NOTEPAD");

}

static void quit() {
//TODO Random Quit qoutes, like in Doom2
	System.exit(0);

}

}
