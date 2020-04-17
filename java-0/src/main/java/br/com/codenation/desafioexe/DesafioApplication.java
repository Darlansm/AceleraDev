package br.com.codenation.desafioexe;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> fibonaccis = new ArrayList<>();

		fibonaccis.add(0,0);
		fibonaccis.add(1,1);

		int i =2;

		while (i < 350){

			int valorFibonacci = (fibonaccis.get(fibonaccis.size()-2)) +
					(fibonaccis.get(fibonaccis.size()-1));
			fibonaccis.add(valorFibonacci);
			i = valorFibonacci;

		}


		return fibonaccis;
	}

	public static Boolean isFibonacci(Integer a) {

		return  fibonacci().contains(a);
	}

	public static void main(String[] args) {

		List<Integer> fib = fibonacci();
		System.out.println(fib);
		System.out.println(isFibonacci(375));
		System.out.println(fib.size());

	}

}