package mediafinal;
import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        float notaAluno;
        

        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
       
            System.out.println("Insira a nota do aluno:");
            notaAluno= teclado.nextFloat();
            if (notaAluno <0 || notaAluno >10){
                System.out.println("Essa nota não é válida. Insira um valor entre 0 e 10.");
                
            } else if(notaAluno >= 3 && notaAluno <6){
                System.out.println("Digite a nota da final do aluno:");
                float notaFinal = teclado.nextFloat();
                float mediaFinal = (notaAluno + notaFinal)/2;
                if(mediaFinal >=6){
                    System.out.println("APROVADO NA FINAL. A média ficou em " +mediaFinal+ " pontos.");
                } else {
                    System.out.println("ALUNO REPROVADO NA FINAL.");
                }     
            } else if(notaAluno >= 6){
                System.out.println("Aluno APROVADO com média de " +notaAluno+ " pontos.");
            } else if (notaAluno <3){
                System.out.println("Aluno REPROVADO, pois média de "+notaAluno+ " não é recuperável nem na final.");
            }
            
    }
    
}
