package DesafioControleFluxo;
import java.util.Scanner;


public class Contador {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int primeiroNum = scanner.nextInt();
        int segundoNum = scanner.nextInt();

        try {
            contar(primeiroNum, segundoNum);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        };
            
   };
   

    static void contar(int primeiroNum, int segundoNum) throws ParametrosInvalidosException{

        if(segundoNum > primeiroNum){

             int contagem = segundoNum - primeiroNum;

            for(int i = 0; i < contagem; i++){
                System.out.println(i);
            }
            
        }else{

           throw new ParametrosInvalidosException("Falha! O primeiro número deve ser menor que o segundo!");
        };

    };
}
