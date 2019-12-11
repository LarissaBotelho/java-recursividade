/*
* App java para fazer uma função recursiva que calcule o M.D.C. 
* (Máximo divisor comum) entre dois valores fornecidos pelo usuário. 
* Por exemplo: m.d.c. de 12 e 20 é 4.
* 
* Programadores: Larissa e Hudson
*/

package app;

//importando biblioteca

import java.util.Scanner;

//criando classe

public class exercicio3 {

  // abrindo metodo para calcular mdc com valores inseridos pelo usuario

  public static void main(String[] args) {

    // imprime no console
    System.out.println("Digite um número: ");

    // armazena na variavel
    int a = new Scanner(System.in).nextInt();

    // imprime no console
    System.out.println("Digite outro número: ");

    // armazena na variavel
    int b = new Scanner(System.in).nextInt();

    // armazena os dois valores na variavel resposta que chama outro metodo
    int resposta = mdc(a, b);

    // imprime o resultado no console
    System.out.println("\n\n\n O MDC de " + a + " e " + b + " é: " + resposta);

  }

  // metodo para calcular mdc
  public static int mdc(int a, int b) {

    // abrindo condicional
    // Verifica se o resto de A é igual a 0
    // Se nao, retorna o mdc

    if ((a % b == 0)) {

      return b;

    } else {

      return mdc(b, (a % b));
      
    }
  }

}