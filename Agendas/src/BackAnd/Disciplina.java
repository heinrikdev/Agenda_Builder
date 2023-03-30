package BackAnd;
public class Disciplina {
    //atributos
    private String Nome;
    private String Professor;
    private String horario;// primeiro, segundo, etc...
    //metodos

    private Disciplina() {
    }
    public static Disciplina Disciplinabuilder(){
        return new Disciplina();
    }
public Disciplina Nome (String Nome) {
        this.Nome = Nome;
        return this;
    }
    
public Disciplina Professor (String Professor) {
        this.Professor = Professor;
        return this;
    }
public Disciplina Horario (String Horario) {
        this.horario = Horario;
        return this;
    }
//    public Disciplina(String Nome, String Professor, String horario) {
//        this.Nome = Nome;
//        this.Professor = Professor;
//        this.horario = horario;
//    }

    public String getNome() {
        return Nome;
    }

    public String getProfessor() {
        return Professor;
    }

   
    public String getHorario() {
        return horario;
    }  
    
    @Override
    public String toString() {
        return "Disciplina{" + "Nome=" + Nome + ", Professor=" + Professor + ", horario=" + horario + '}';
    }
    
}
