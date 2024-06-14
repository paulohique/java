package animais;

public class cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoEspirito;

    public void  comer() {
    }
    public void latir(){
    System.out.println("Ruff Ruff");
    }
    public String pegar(){
        return "Pegou";
    }
    // enum ( Pesquisar )
    public String interagir(String acao){
        switch (acao) {
            case "carinho": this.estadoEspirito = "feliz";
                
                break;
            case "dormir":  this.estadoEspirito = "bravo";
                
                break;
            case "pisar na pata":   this.estadoEspirito = "reclamar";
                
                break;
            case "alimentar":   this.estadoEspirito = "felicidade";
                
                break;
        
            default:    this.estadoEspirito = "Neutro";
                break;
        }
        return this.estadoEspirito;
    }

}