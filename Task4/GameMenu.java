import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	private ArrayList<String> actions = new ArrayList<>();
    
    public GameMenu(ArrayList actions){
    	this.actions = actions;
    }

    public void displayMenu(){
    	for(String e : actions){
    	    System.out.println(e);
        }
    }

    public String promptUser(){
    	System.out.println("Type a number to choose an action");
    	displayMenu();
    	Scanner scanner = new Scanner(System.in);
    	String choice = scanner.nextLine();
    	return choice;
    }
}