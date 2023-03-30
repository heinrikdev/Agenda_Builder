package BackAnd;


import java.util.ArrayList;



public class Loginn {
    //tributos
   private String NomeUsuario;
   private String Senha;
   private int tamanho, validade;
   ArrayList <Aluno> novoAluno = new ArrayList(); 
   
   //metodos

    public Loginn() {
    }
   

    //metodo para criar um novo registro de aluno
    public boolean Cadastro(String Nome, String Senha) {
       
            
          if(!Login(Nome, Senha, true)){
              
             // Aluno aluno= new Aluno(this.NomeUsuario, this.Senha);
              Aluno aluno= Aluno.AlunoBuilder()
                      .Nome(this.NomeUsuario)
                      .Senha(this.Senha);

            novoAluno.add(aluno);
            return true;
        
        }else{
              return false;
        }
            
        
    }

    public boolean Login(String Nome, String Senha, boolean SenhaImporta) {
        this.NomeUsuario=Nome;
        this.Senha=Senha;
       validade=0; 
       tamanho=novoAluno.size();
        for(int x=0; x<tamanho; x++){
          if(novoAluno.get(x).getNome().equals(this.NomeUsuario)){
              validade++;   
              if(!SenhaImporta){
              if(validade>0) {
                  if(novoAluno.get(x).getSenha().equals(this.Senha)){
              return true;
                  }
                  
                  return false;
          
              
          }
              }else{
                  return true;
              }
        }
        }
              return false;
    }

        
    
}
