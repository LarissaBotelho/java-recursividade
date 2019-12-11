/* 
* App java para calcular fatorial de qualquer numero.
*
* Programadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando classe
public class exercicio11 {

  //metodo para receber um numero e informar resultado
  public static void main(String[] args) {

    //imprime no console
    System.out.print("Insira um numero: ");

    //armazena na variavel
    int a = new Scanner(System.in).nextInt();

    //imprime resultado no console
    System.out.println("\n " + fatorial(a));
  }

  //metodo para fazer o fatorial
  public static int fatorial(int n) {

    //abrindo condicional
    if ( n == 0) {

      return 1;

    } else {

      return n * fatorial(n - 1);
    }
  }
}