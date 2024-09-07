
import java.util.Random;


public class Luta {
    // Atributos da Classe
    
    private  Lutador desafiado;
    private  Lutador desafiante;
    private  int rounds;
    private boolean aprovada;
    
    //Metodos Publicos 
    
public void marcaLuta(Lutador l1, Lutador l2){
    if (l1.getCategoria().equals (l2.getCategoria())
              && l1 !=l2) {
        this.aprovada=true;
        this.desafiado=l1;
        this.desafiante=l2;                
     }else{
        this.aprovada=false; 
        this.desafiado=null;
        this.desafiante=null; 
    }
   
  }
    public void lutar(){
        if(this.aprovada){
            System.out.println(" #### DESAFIADO #### ");
            this.desafiado.apresenta();
            System.out.println("#### DESAFIANTE ####");
            this.desafiante.apresenta();
            
            Random aleatorio = new Random ();
        }else{
            System.out.println("A Luta não pode acontecer!!");
        }
    } 
    //Metodos especiais 

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafianteLutador) {
        this.desafiante = desafianteLutador;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}