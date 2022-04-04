package verificarIdade;

import javax.swing.JOptionPane;

public class VerificaIdade {

	public static void main(String[] args) {
		
		int age;
		
		try {
		age = Integer.parseInt(JOptionPane.showInputDialog("HOW OLD YOU ARE?"));
		
		if(age > 0 && age <= 12) {
			System.out.println("CHILD");
		}
		
		else if(age >= 13 && age < 18 ) {
			System.out.println("TEENAGER");
		}
		
		else if(age >= 18 && age < 60 ) {
			System.out.println("ADULT");
		}
		
		else if(age >= 60 && age < 130 ) {
			System.out.println("OLD");
		}
		
		else {
			System.out.println("INVALID AGE");
		}
	}
	catch (NumberFormatException age1){
		System.out.println("incorrect input type");
	}

	}
}