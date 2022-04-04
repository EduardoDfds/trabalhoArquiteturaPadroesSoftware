package inverterValores;

import javax.swing.JOptionPane;

public class InverterValores {

	public static void main(String[] args) {
		 String entrada = JOptionPane.showInputDialog("Digite numeros separados por ,");
		 String valores[] = InverterValores.separaStringVirgula(entrada);
		 String saida= "";
		 for(int x = valores.length-1; x >= 0; x--) {
			 if(saida.length() == 0) {
				 saida = valores[x];
			 }
			 else {
				 saida += "," + valores[x];
			 }
		 }
		 System.out.println(saida);
		 

	}
	private static String[] separaStringVirgula(String entrada) {
		return entrada.split(",");
	}
}
