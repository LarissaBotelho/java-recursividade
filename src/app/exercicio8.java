/*
* App java para escrever uma função recursiva, int SomaSerie 
* (int i, int j, int k), que imprime na tela a soma de 
* valores do intervalo [i ,j], com incremento k.
* 
* Programadores: Larissa e Hudson
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando classe
public class exercicio8 {

  // metodo para inserir valores e informar resultado
  public static void main(String[] args) throws Exception {

    //imprime no console
    System.out.print("Digite primeiro numero: ");

    //armazena na variavel
    int i = new Scanner(System.in).nextInt();

    //imprime no console
    System.out.print("Digite o segundo numero: ");

    //armazena na variavel
    int j = new Scanner(System.in).nextInt();

    //imprime no console
    System.out.print("Digite o incremento da sequencia: ");

    //armazena na variavel
    int k = new Scanner(System.in).nextInt();

    //armazena valor de outro metodo na variavel
    int resultado = SomaSerie(i, j, k);

    //imprime resultado no console
    System.out.println("Resultado da operação: " + resultado);
    

  }

  //metodo para efetuar a soma
  public static int SomaSerie(int i, int j, int k) {

    //declarando variavel
    int soma = 0; 

    //abrindo condicional
    if (i < j) { 

      return soma = i + SomaSerie(i + k, j, k);

    } else { 

      return soma = soma + j; 
    }

  }

}