import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        // Atividade Boolean
        // Entrada
        Scanner escolha = new Scanner(System.in);
        System.out.println("Como está o final de semana?\n Limpo ou feio?");
        String escolhaUsuario = escolha.next();
        boolean finalDeSemanaLimpo;
        if (escolhaUsuario.equalsIgnoreCase("limpo")) {
            finalDeSemanaLimpo = true;
            System.out.println("Final de semana está limpo? " + finalDeSemanaLimpo);
            System.out.println("Bora para a praia!");
        } else if (escolhaUsuario.equalsIgnoreCase("feio")) {
            finalDeSemanaLimpo = false;
            System.out.println("Final de semana está limpo? " + finalDeSemanaLimpo);
            System.out.println("Ficaremos em casa.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
