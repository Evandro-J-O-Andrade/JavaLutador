/*Autor Evandro Andrade*/
public class JavaMma {


    public static void main(String[] args) {
         Lutador l[] = new  Lutador [6];
          l[0]= new Lutador(" Pretty Boy ", " Farnca ", 31, 1.80f, 68.9f , 11, 2, 1);
          l[1]= new Lutador("Putscript", "Brasik", 25, 185f , 57.6f, 12, 5, 8);
          l[2]= new Lutador(" Esquilo Voador ", " São Paulo ", 31, 1.85f, 90.9f, 20, 2, 1);
          l[3]= new Lutador(" Martins Laurens ", " USA ", 31, 1.80f, 100.9f, 11, 2, 1);
          l[4]= new Lutador(" Tsuname ", " São Paulo ", 31, 1.85f, 90.9f, 20, 2, 1);
          l[5]= new Lutador("Billy kane ", " USA ", 31, 1.80f, 100.9f, 11, 2, 1);
          
         Luta UEC01 =new Luta();
         UEC01.marcaLuta(l[0],l[1]);
         UEC01.lutar();
         l[0].status();
         l[1].status();
                
    
}
}