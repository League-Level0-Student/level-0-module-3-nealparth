
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 9th";
		String dadsBirthday = "December 15";
		String myBirthday = "October 10";

		// 2. Find out which birthday the user wants and and store their response in a variable
			String Birthday= JOptionPane.showInputDialog(null, "Which birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(Birthday);
		// 4. if user asked for "mom"
		if(Birthday.equals("mom")) {
			System.out.println(momsBirthday);
		}
		
			
			//print mom's birthday
		// 5. if user asked for "dad"
		else if(Birthday.equals("dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if(Birthday.equals("neal the seal")) {
			System.out.println(myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
		JOptionPane.showMessageDialog(null,"Sorry, i don't remember that person's birthday!");
	} 
	
}
}
