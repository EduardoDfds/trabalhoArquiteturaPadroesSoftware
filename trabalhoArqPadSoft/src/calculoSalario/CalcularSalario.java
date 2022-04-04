package calculoSalario;

import javax.swing.JOptionPane;

public class CalcularSalario {

	public static void main(String[] args) {
		
		Double horas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
		Double valorHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das horas trabalhadas: "));
		
		Salario salarioEduardo = new Salario();
		salarioEduardo.setQuantidadeHoras(horas);
		salarioEduardo.setValorHoras(valorHoras);
		
		System.out.println(salarioEduardo);
	}

}
