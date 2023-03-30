package BackAnd;
import java.util.ArrayList;
public class Aluno {
   //atributos
    private String Nome;
    private String Senha;
    
    ArrayList <Disciplina> novaDisciplina = new ArrayList(); 
    ArrayList <Complemento> novoComplemento = new ArrayList();    
    Eventos novoEvento= Eventos.EventosBuilder();
    
   // Eventos novoEvento = new Eventos(); 
    
    //metodos
    private int x=0;

    private Aluno() {
    }

    public static Aluno AlunoBuilder(){
        return new Aluno();
    }
    
    public Aluno Nome(String nome) {
        this.Nome=nome;
        return this;
    }

      public Aluno Senha(String senha) {
        this.Senha=senha;
        return this;
    }

    public int getX() {
        return this.x;
    }
    //aqui adicionamos array de eventos
public void setEvento(int diferenca, String tipo, String nome,String data){
novoEvento
        .Diferenca(diferenca)
        .Tipo(tipo)
        .Nome(nome)
        .Data(data);

    novoEvento.adicionarEventos();
        
    }

    // aqui temos a função adicionar disciplina
    public void setDisciplina(String Nome, String Professor, String horario){
   //aqui colocamos as caixas da interface
   //Nome,Professor, horario
      Disciplina disciplina1 = Disciplina.Disciplinabuilder()
         .Horario(horario)
         .Nome(Nome)
         .Professor(Professor);
        
        novaDisciplina.add(disciplina1);
    this.x=novaDisciplina.size()-1;
    }
    //getters disciplina
    String getDisciplina(){
        //this.x=novaDisciplina.size();
        return novaDisciplina.get(this.x).getNome();
    }
    String getProfessor(){
        //this.x=novaDisciplina.size();
        return novaDisciplina.get(this.x).getProfessor() ;
    }
    String getHorario(){
        //this.x=novaDisciplina.size();
        return novaDisciplina.get(this.x).getHorario() ;
    }
    // aqui temos a função adicionar Complemento
    public void setComplemento(){
        Complemento novo = Complemento.ComplementoBuilder();
        //aqui colocamos as caixas da interface
    //String Pesquisa, String Extensao, String Orientacao
        novoComplemento.add(novo);
    this.x=novoComplemento.size()-1;
    }
    String getPesquisa(){
        return novoComplemento.get(this.x).getPesquisa();
    }
    String getExtensao(){
        return novoComplemento.get(this.x).getExtensao();
    }
    String getOrientacao(){
        return novoComplemento.get(this.x).getOrientacao();
    }
    
    // getters and setters

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    
    
    }

