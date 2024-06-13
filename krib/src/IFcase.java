import java.util.Scanner;
public class IFcase {
    public static void main(String[] args) {
        int nota;
        Scanner escolha = new Scanner(System.in);
        System.out.println("Sua nota está boa?\n Qual é sua nota?");
        nota = escolha.nextInt();
        if(nota >= 70){
            System.out.println("Aluno aprovado!");
        
        }
        else if(nota == 0){
            System.out.println("Zerou");
        }
        else{
            System.out.println("Não aprovado!");
        }
    }

}
