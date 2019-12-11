/* 
* App java para receber um valor n, e imprimir a contagem
* regressiva a partir deste valor. 
* Por exemplo, se o usuário digitar 5, 
* o programa irá imprimir 5, 4, 3, 2, 1, 0.
* 
* Progamadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando classe
public class exercicio5 {

  //metodo para receber o valor do usuario e mostrar o resultado
  public static void main(String[] args) {

    // imprime no console
    System.out.print("Digite um número: ");

    // armazena na variavel
    int contagem = new Scanner(System.in).nextInt();

    // imprime o resultado no console
    System.out.println("\n Iniciando a contagem...");
    regressiva(contagem);

    }

    //metodo para efetuar a contagem
    static void regressiva(int a) {

      //abrindo condicional
      //enquanto A for maior que -1, ele diminui 1 do numero inserido
      if ( a == -1) {

        System.out.println("Fim");

      } else {

        System.out.println(a);
        regressiva(a - 1);
      }

  }

}