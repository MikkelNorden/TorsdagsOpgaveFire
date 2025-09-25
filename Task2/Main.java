import java.util.Scanner;

class Main{
	
	public static void main(String[] args){

        System.out.println("Please type your name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello " + input);

        System.out.println("Please type your age");
        int age = scanner.nextInt();
	    System.out.println("You are " + age + " years old");

	    int yearsLeft = 67 - age;
	    System.out.println("You have " + yearsLeft + " years until retirement");
	}
}