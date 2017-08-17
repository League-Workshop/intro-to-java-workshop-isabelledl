package day3;
//Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

import sun.applet.Main;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using " "
int r = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(r);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Give the 8 ball a question");
	// 5. If the random number is 0
if (r==0){
	JOptionPane.showMessageDialog(null, "yes");
}
	// -- tell the user "Yes"
   
	// 6. If the random number is 1
    if (r==1){
    	 JOptionPane.showMessageDialog(null, "no");
    }
	// -- tell the user "No"
   
	// 7. If the random number is 2
 if (r==2){
	 JOptionPane.showMessageDialog(null, "ask google");
    }
	// -- tell the user " JOptionPane.showInternalMessageDialog(null, "yes");"

	// 8. If the random number is 3
 if (r==3){
 	JOptionPane.showMessageDialog(null,"why did you ask this question");
 }
	// -- write your own answer
 
}
}
