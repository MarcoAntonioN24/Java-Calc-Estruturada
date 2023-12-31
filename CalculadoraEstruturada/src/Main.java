
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Classe
public class Main {

//Método
    public static void main(String[] args) {
        // TODO code application logic here
        double n1, n2;
        String nome;
        int n3,n4;
        //entrada de dados
        Scanner entrada = new Scanner(System.in);
        //saída de dados
        System.out.println("Forneça o primeiro algarismo");
        n1 = entrada.nextDouble();
        
        System.out.println("\nForneça o segundo algarismo");
        n2 = entrada.nextDouble();
         
          System.out.println("\nForneça o terceiro algarismo");
        n3 = entrada.nextInt();
       
         System.out.println("\nForneça o quarto algarismo");
        n4 = entrada.nextInt();
        
        System.out.println("\ndigite seu nome");
        nome = entrada.next();
        
        System.out.println(n1 + "\n" + n2);
        System.out.println(n3 + "\n" + n4);
        System.out.println(nome);
        
         System.out.println(
                "resultados: \n\n" +
                 "adicao: " + (n1 + n2) + "\n" +
                  "subtracao: " + (n1 - n2) + "\n" +
                   "multiplicacao: " + n1 * n2 + "\n" +
                    "divisao: " + n1 / n2 + "\n" +
                     "exponenciacao: " + Math.pow(n1, n2) + "\n" +
                      "resto da divisao: " + n3 % n4 + "\n" 
         );
    }
    
}
