/*
* App java para fazer uma função recursiva que realize a multiplicação 
* entre dois valores int, sem utilizar o operador *.
*
* Programadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando classe
public class exercicio7 {

  // metodo para inserir os valores e mostrar resultado
  public static void main(String[] args) throws Exception {

    // imprime no console
    System.out.print("Digite um numero: ");

    //armazena na variavel
    int a = new Scanner(System.in).nextInt();

    //imprime no console
    System.out.print("Digite outro numero: ");

    //armazena na variavel
    int b = new Scanner(System.in).nextInt();

    //armazena resultado do outro metodo na variavel
    int resultado = mult(a, b);

    //imprime resultado no console
    System.out.println("Resultado da operação: " + resultado);

  }

  //metodo para efetuar mu
  public static int mult(int a, int b) {

    if (a == 0 || b == 0) {

      return 0;
    }

    return a + mult(a, b - 1);
  }

}