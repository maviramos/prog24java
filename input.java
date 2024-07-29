// comentários da aula: //


//in é a entrada (teclado) 
// out é a saida 
// sempre colocar ; no final de cada linha 
// void significa nada/vazio, não retorna nada 
// arquivo sempre tem que ser salvo com nome da classe
//args é argurmentos, (String[]args) vetor de argurmentos 
// input pode ser substituido por uma variavel, ex: de Scanner input  p/ Scanner s 
// nextLine pega a linha completa inclusive o enter e o enter pega a linha inteira automáticamente, * 
// * next vai pegar so o proximo por isso da erro ao colocar so ele
// aula: 18/07


import java.util.Scanner;
class input {
      public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Digite seu nome:");
        String nome = input.nextLine();
        System.out.print("Informe sua idade:");
        int idade = input.nextInt();


        System.out.println("Hello," + nome +
                        " sua idade é:" + idade);
   input.close();
      }
    }

