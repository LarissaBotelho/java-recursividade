/*
* App java para armazenar um numero digitado pelo usuario, 
* em seguida, fazer a soma de todos os algarismos do número.
* Exemplo: 1111 = 1+1+1+1= 4, 2090 = 2+0+9+0= 11
*
* Programadores: Larissa e Hudson
*/

package app;

//importando a biblioteca
import java.util.Scanner;

//criando a classe
public class exercicio1 {

    //metodo para somar os algarismos
    public static int somaAlgarismos(int num) {

        // abre uma condicional
        if (num < 10)
            return num;

        else

            return somaAlgarismos(num / 10) + num % 10;
    }

    
    // Metodo para soma de todos os algarismos
    public static void main(String[] args) {

        // imprime no console
        System.out.println("Digite um número: ");

        // armazena na variavel
        int num = new Scanner(System.in).nextInt();

        //inserindo valores de outro metodo em uma variavel
        int soma = somaAlgarismos(num);

        // imprime o resultado no console
        System.out.println("A soma dos algarismos é: " + soma);
    }

}
