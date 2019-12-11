/* 
* App java para fazer uma função recursiva que recebe 
* um vetor preenchido e a quantidade de posições deste vetor, 
* e retorna a soma de todos os elementos do veto r.
* 
* Progamadores: Larissa e Hudson
*/

package app;

//criando classe
public class exercicio6 {

  //metodo para inicializar o array e informar o resultado
  public static void main(String[] args) {

    // declarando o array e a variavel
    int[] array = { 10, 4, 5, 3, 5, 10 };

    int resultado = somatorio(array, 0);

    //imprime resultado no console
    System.out.println(resultado);

  }

  //metodo para efetuar a soma
  public static int somatorio(int[] array, int i) {

    //abre condicional
    if (i < array.length) {

      return array[i] + somatorio(array, i + 1);

    } else {

      return 0;

    }

  }
}
