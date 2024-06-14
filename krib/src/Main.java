import animais.cachorro;

public class Main {
 public static void main(String[] args) {
    

    // cachorro cachorro1 = new cachorro();
    cachorro cachorro2 = new cachorro("Puppy","Rosa", 13 ,10 ,10,"normal");

    // cachorro1.setNome("Zeruela"); 
    // cachorro1.setAltura(24);
    // cachorro1.setCor("Vermelho");
    // cachorro1.setPeso( 10);
    // cachorro1.setPeso(5.5);

    // cachorro1.latir();
    // cachorro1.pegar();
    // System.out.println( "O cachorro pegou? " +cachorro1.pegar()+"!");
    // System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
    // System.out.println("O cachorro está " + cachorro1.interagir("dormir"));
    // System.out.println("O cachorro está " + cachorro1.interagir("alimentar "));

    System.out.println(cachorro2.getNome());
 }
}
