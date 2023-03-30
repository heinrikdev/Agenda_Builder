
package BackAnd;

import javax.swing.table.DefaultTableModel;

public class Eventos {
    //atributos
    private String tipo;// prova ou trabalho
    private String Nome, data;
    
    private int diferenca;
    //metodos
Mostrar mostrart= new Mostrar();
DefaultTableModel mostrar= (DefaultTableModel) mostrart.TabelaMostrarEvento.getModel();

    private Eventos() {
    }

    public static Eventos EventosBuilder(){
        return new Eventos();
    }
    
    
    public Eventos Diferenca(int diferenca){
        this.diferenca= diferenca;
        return this;
    }
    public Eventos Tipo(String tipo){
        this.tipo= tipo;
        return this;
    }
    public Eventos Nome(String Nome){
        this.Nome= Nome;
        return this;
    }
    public Eventos Data(String data){
        this.data= data;
        return this;
    }
    
//    public Eventos(int diferenca, String tipo, String Nome,String data ) {  
//         
//         Object[] dados= {diferenca, tipo, Nome, data};
//        mostrar.addRow(dados);
//        this.diferenca= diferenca;
//        this.tipo= tipo;
//        this.Nome= Nome;
//        }  
//    void adicionarEventos(int diferenca, String tipo, String Nome,String data){
//        Object[] dados= {diferenca, tipo, Nome, data};
//        mostrar.addRow(dados);
//    }
    
     void adicionarEventos(){
        Object[] dados= {this.diferenca, this.tipo, this.Nome, this.data};
        mostrar.addRow(dados);
    }
     
int index(){
 return mostrar.getRowCount();
}
void visivel(){
   mostrart.setVisible(true);
}
    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return Nome;
    }

    public int getDiferenca() {
        return diferenca;
    }


    
    
 
    }
