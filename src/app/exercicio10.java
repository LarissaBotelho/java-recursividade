/*
* App java para fazer um programa recursivo 
* que calcule a sequencia de Fibonacci.
* 
* Programadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando classe
public class exercicio10 {

  //metodo para receber numero do usuario e informar resultado
  public static void main(String[] args) {

    // imprime no console
    System.out.print("Digite um número: ");

    // armazena na variavel
    int numero = new Scanner(System.in).nextInt();

    //abrindo looping
    for (int i = 1; i <= numero; i++) {

      System.out.println(fibonacci(i));
    }
    
  }

  //metodo para calcular os numeros
  static int fibonacci(int n) {

    //abrindo condicional
    if ( n == 1 || n == 2) {

      return 1;

    } else {

      return fibonacci(n - 1) + fibonacci(n - 2);
      
    }
  } 
}