package animais;

public class cachorro {
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoEspirito;
    // Get e Set para usar em dados
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if(nome.equals("lily"))
        this.nome = null;
    }

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