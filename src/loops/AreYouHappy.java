package loops;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String answer= JOptionPane.showInputDialog( "Are you Happy");
	String choice= JOptionPane.showInputDialog( "Do you want to be  Happy");
	if(answer.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing whatever you're doing"); 
		
	}
	else if(choice.equals("no")) {
		JOptionPane.showInputDialog( "Do you want to be  Happy");
	}
		if(choice.equals("yes")) {
			JOptionPane.showMessageDialog(null, "change something"); 
			
		}	
		else if(choice.equals(" no")) {
			JOptionPane.showInputDialog(  "keep doing whatever you're doing");
	}
}
}

