package br.com.darlan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
// o especificador de formato para caractere (%c)
// mostra o i-ésimo caractere da tabela ASCII
        System.out.printf("Caracteres numéricos:\n");
        for (i = 48; i <= 57; i++) {
            System.out.printf("%c", i);
        }

        System.out.printf("\n\nCaracteres alfabéticos maiúsculos:\n");
        for (i = 65; i <= 90; i++) {
            System.out.printf("%c", i);
        }

        System.out.printf("\n\nCaracteres alfabéticos minúsculos:\n");
        for (i = 97; i <= 122; i++) {
            System.out.printf("%c", i);
        }
        System.out.printf("\n");

        char c;
        int n;
// os caracteres são tipos ordinais, portanto, podem
// ser usados no controle de instruções de repetição
        for (c = '0'; c <= '9'; c++) {
// converte o caractere numérico no respectivo valor inteiro
            n = c - 48;
            System.out.printf("%d X 10 = %d\n", n, (n * 10));
        }

        Scanner ler = new Scanner(System.in);

        String s;
        int cta = 0;

        System.out.printf("Informe uma string:\n");
        s = ler.nextLine();

        System.out.println();

        n = s.length(); // tamanho da string
        for (i=0; i<n; i++) {
// verifica se o i-ésimo caractere é a vogal 'a'
            if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a')) {
                cta = cta + 1;
                System.out.printf("%c ---> %do. caractere 'a'\n", s.charAt(i), cta);
            }
            else System.out.printf("%c\n", s.charAt(i));
        }



    }

}
