import animais.cachorro;

public class Main {
 public static void main(String[] args) {
    

    cachorro cachorro1 = new cachorro();

    cachorro1.nome = "Zeruela";
    cachorro1.altura = 24;
    cachorro1.cor = "Vermelho";
    cachorro1.tamanhoDoRabo = 10;
    cachorro1.peso = 5.5;

    cachorro1.latir();
    cachorro1.pegar();
    System.out.println( "O cachorro pegou? " +cachorro1.pegar()+"!");
    System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
    System.out.println("O cachorro está " + cachorro1.interagir("dormir"));
    System.out.println("O cachorro está " + cachorro1.interagir("alimentar "));
 }
}
