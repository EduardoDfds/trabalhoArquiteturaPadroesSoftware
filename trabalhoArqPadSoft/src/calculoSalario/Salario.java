package calculoSalario;

public class Salario {
	private Double quantidadeHoras;
	private Double valorHoras;
	
	public Double getSalarioBruto() {
		return quantidadeHoras*valorHoras;
	}
	
	public Double getValorSindicato(){
		return (getSalarioBruto()*1.03)-getSalarioBruto();
		}
	
	public Double getValorImpostoRenda() {
		if(getSalarioBruto() <= 900) {
			return 0.;
		} 
		else if(getSalarioBruto() <= 1500) {
			return (getSalarioBruto()*1.05)-getSalarioBruto();
		}
		else if(getSalarioBruto() <= 2500) {
			return (getSalarioBruto()*1.1)-getSalarioBruto();
		}
		else {
			return (getSalarioBruto()*1.2)-getSalarioBruto();
		}
	}
	
	public Double getValorFgts(){
		return (getSalarioBruto()*1.11)-getSalarioBruto();
		}
	
	public Double getValorInss(){
		return (getSalarioBruto()*1.1)-getSalarioBruto();
		}

	public Double getTotalDesconto(){
		return ( getValorInss()+getValorImpostoRenda()+getValorSindicato());
		}
	
	public Double getSalarioLiquido() {
		return(getSalarioBruto()-getTotalDesconto());
	}
	
	
	
	public Double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public Double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(Double valorHoras) {
		this.valorHoras = valorHoras;
	}

	@Override
	public String toString() {
		return "Salario Bruto: " + getSalarioBruto() + "\n"+ "Salario Liquido: " + getSalarioLiquido();
	}
	
}

