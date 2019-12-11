/*
* App java para fazer uma função recursiva para 
* elevar um valor base a potência do valor expoente.
* 
* Programadores: Larissa e Hudson
*/

package app;

//criando classe
public class exercicio2 {

  //metodo para elevar o valor base a potencia do valor expoente
  public static double mdc(double a, double b) {

    //abrindo condicional
    if ((a % b == 0)) {

      return b;

    } else {

      return mdc(b, (a % b));

    }
  }

  //metodo principal para informar o resultado
  //chama o metodo anterior
  public static void main(String[] args) {

    //armazena o valor do metodo anterior na variavel
    double resposta = mdc(30, 48);

    //efetua formatação
    String resultado = String.format("%.0f", resposta);

    //imprime resultado no console
    System.out.println("\n\n\n resposta ....: " + resultado);

  }

}
