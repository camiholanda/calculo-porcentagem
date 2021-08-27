
import java.util.Scanner;

public class Porcentagem {

    public static void main(String[] args) {
         System.out.println("Calculando o percentual de casos de Covid no Brasil");
       
         // Declaração de variáveis //
        
        int numCasos_Brasil;
        String nomeRegiao;  
        int numCasos_Regiao;
        int calculo;
        
          // Entrada de dados pelo usuário //
        
       Scanner leitor = new Scanner(System.in);
            System.out.println("Informe o total de casos de Covid-19 no Brasil:");
               numCasos_Brasil = leitor.nextInt();
                 System.out.println("Informe a região:");           
                      nomeRegiao = leitor.next();
                        System.out.println("Agora, digite o número de casos da região:");
                            numCasos_Regiao = leitor.nextInt();
                            
          // Processamento //
                 
                  calculo = (numCasos_Regiao * 100) / numCasos_Brasil;
                         System.out.println("A região informada foi: " + nomeRegiao);
                               System.out.println("O número de casos dessa região é de : " + numCasos_Regiao);
                                     System.out.println("O percentual de casos dessa região em relação ao total de casos do Brasil = " + calculo);
                     
    }
    
}
