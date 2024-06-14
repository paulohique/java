package animais;

public class cachorro {
    // ATRIBUTOS
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoEspirito;


    // CONSTRUTORES 
    public cachorro(){}// padrão
    //  adicionados
    public cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoEspirito = estadoEspirito;
    };




    // METODOS
    // Get e Set para usar em dados
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if(nome.equals("lily"))
        this.nome = null;
        }
    public String getCor(String cor){
        return this.cor;
        }
    public void setCor(String cor){
        this.cor = cor;
        }
    public int getAltura(int altura){
        return this.altura;
        }
    public void setAltura(int altura){
        this.altura = altura;
        }
    public double getPeso(double peso){
        return this.peso;
        }
    public void setPeso(double peso){
        this.peso = peso;
        }
    public int getTamanhoDoRabo(int tamanhoDoRabo){
        return this.tamanhoDoRabo;
        }
    public void setPeso(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
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