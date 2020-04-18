package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {

		if(salarioBase <= 1039) return Math.round(0.0);

		double salarioLiquido= calcularInss(salarioBase);

		salarioLiquido = calcularIRRF(salarioLiquido);


		return Math.round(salarioLiquido);
	}


	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private double calcularInss(double salarioBase) {

			if(salarioBase <=1500){
				return salarioBase * 0.92;
			}else if(salarioBase <= 4000){
				return salarioBase * 0.91;
			}else {
				return salarioBase * 0.89;
			}

	}

	private double calcularIRRF (double salario){

		if( salario <= 3000){
			return salario;
		}else if (salario <= 6000){
			return salario * 0.925;
		}else {
			return salario * 0.85;
		}
	}


}
