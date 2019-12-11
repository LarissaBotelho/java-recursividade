/*
* App java para fazer uma função recursiva que calcule o M.D.C. 
* pelo algoritmo de Euclides.
* Por exemplo, divide-se a por b e obtém-se o quociente q e o resto r. 
* Se r for zero, b é o m.d.c.; se não for, divide-se b por r 
* e assim sucessivamente até encontra r um resto zero. 
* O último divisor é o M.D.C.
* 
* Progamadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando classe
public class exercicio4 {

  // abrindo metodo para calcular mdc pelo algoritmo de euclides
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
    /* Verifica se B é igual a 0
    * Se sim, retorna a
    * Se nao, retorna o mdc
    */

    if ((b == 0)) {

      return a;

    } else {

      return mdc(b, a % b);

    }
  }

}
