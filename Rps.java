package a1;
import java.util.*;
public class Rps {
public static void main(String[] args) {
	
	System.out.println("Rock Paper Seaser game");
	System.out.println("0-Rock");
	System.out.println("1-paper");
	System.out.println("2-scissors");
	System.out.println("enter your choice");


	Scanner sc = new Scanner(System.in);
	int my = sc.nextInt();
	
	Random rand = new Random();
	int comp = rand.nextInt(3);
	System.out.println("computer's choice is: " + comp);
	if(my==0 && comp==1) {
		System.out.println("you loose");
	}
	else if(my==0 && comp==2) {
		System.out.println("you won");
	}
	else if(my==0 && comp==0) {
		System.out.println("draw");
	}
	else if(my==1 && comp==1) {
		System.out.println("draw");
	}
	else if(my==1 && comp==0) {
		System.out.println("you won");
	}
	else if(my==1 && comp==2) {
		System.out.println("you loose");
	}
	else if(my==2 && comp==2) {
		System.out.println("draw");
	}
	else if(my==2 && comp==1) {
		System.out.println("you won");
	}
	else if(my==2 && comp==0) {
		System.out.println("you loose");
	}
	
	}
}
