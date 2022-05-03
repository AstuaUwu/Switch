import java.util.Scanner;
public class unu {
    public static void main(String[] args) {
    Scanner Captura=new Scanner(System.in);
    
    
   int Prenda;
   System.out.println("Elija su prenda");
   
   Prenda=Captura.nextInt();
   
   String PrendaTexto= "";
   
   switch(Prenda){
       
       case 1:
           PrendaTexto="Pantalones";
           break;
           
       case 2:
           PrendaTexto="Camiseta";
           break;
           
       case 3:
           PrendaTexto="Short";
           break;
           
           
           
   }
    System.out.println(PrendaTexto);    
        
}}
 
    
