package br.com.codenation.calculadora;

public class Main {

    public static void main(String[] args) {

        CalculadoraSalario calc = new CalculadoraSalario();

        System.out.println("teste 1  3000 = "+ calc.calcularSalarioLiquido(3000.00));
        System.out.println("teste 2  3000.01 = "+ calc.calcularSalarioLiquido(3000.01));
        System.out.println("teste 3  6000 = "+ calc.calcularSalarioLiquido(6000.00));
        System.out.println("teste 4  6000,01 = "+ calc.calcularSalarioLiquido(6000.01));
        System.out.println("teste 5  7000 = "+ calc.calcularSalarioLiquido(7000.00));
        System.out.println("teste 6  10000 = "+ calc.calcularSalarioLiquido(10000.00));




    }
}
