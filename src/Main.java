import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		/*
		 *Uncomment this to switch out dataset via console,
		 * assuming more data files exist in the same directory
		Scanner s = new Scanner("Please Enter File Name");
		new brainNet(s.nextLine());
		*/
		new brainNet("src\\Autism-Adolescent-Data.arff");
	}
}
