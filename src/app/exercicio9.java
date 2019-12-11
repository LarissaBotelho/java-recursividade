/* 
* App java para fazer uma função recursiva que dado um número 
* decimal imprima a sua representação binária corretamente.
* 
* Programadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando classe
public class exercicio9 {

  //metodo para receber numero do usuario e informar resultado
  public static void main(String[] args) {

    //imprime no console
    System.out.print("Digite um numero para ser convertido: ");

    //armazena na variavel
    int a = new Scanner(System.in).nextInt();

    decimalBinario(a);
    
  }

  //metodo para efetuar a conversao
  static void decimalBinario(int n) {

    //abrindo condicional
    if ( n > 0 ) {

      decimalBinario(n / 2);

      System.out.println(n % 2);
    }
  }
}