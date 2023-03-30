package BackAnd;
public class Complemento {
   //atributos
    private String Pesquisa= "Pesquisa";
    private String Extensao= "Extensão";
    private String Orientacao="Monitoria";
   //metodos

    private Complemento() {
    }

    public static Complemento ComplementoBuilder() {
        return new Complemento();
    }

    public Complemento Pesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
        return this;
    }
    
     public Complemento Extensao (String Extensao) {
       this.Extensao = Extensao;
        return this;
    }
      public Complemento Orientacao(String Orientacao) {
       this.Orientacao = Orientacao;
        return this;
    }
      
    public String getPesquisa() {
        return Pesquisa;
    }

    public String getExtensao() {
        return Extensao;
    }


    public String getOrientacao() {
        return Orientacao;
    }

   
}
