package day3;

import javax.swing.JOptionPane;

public class snuper {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("How are you today?");
	String phone =JOptionPane.showInputDialog("What is your phone number?");
	String pet= JOptionPane.showInputDialog("Do you have pets ?");
	JOptionPane.showMessageDialog(null,"Hi "+name);
}
}
