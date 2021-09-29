package pedra_papel_tesoura;
import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		Jogadas jg= new Jogadas();
		Scanner teclado = new Scanner(System.in);
		Random gerador= new Random();
		

	
	
	
	
    System.out.println("___________________________");
    System.out.println("1- PEDRA" );
    System.out.println("2- PAPEL");
     System.out.println("3- TESOURA");
     System.out.println("____________________________");
     
     System.out.println("Escolha uma opção:");
     jg.setjogador(teclado.nextInt());
     
     
     jg.setmaquina(gerador.nextInt(3)+1);
    
     
     if(jg.getjogador() == jg.getmaquina()){
    	 
    	 
    	 
    	 switch(jg.getjogador()){
    	 
    	 case(1):
    		  System.out.printf("Empate! Ambos escolheram Pedra");
    	 
    	  break;
    	 
     case(2):
		  System.out.printf("Empate! Ambos escolheram Papel");
	 
	  break;
	  
     case(3):
		  System.out.printf("Empate! Ambos escolheram Tesoura");
	 
	  break;
     
    	 }
	  
     }
 
    	 
    	 //j1   m3   jogador ganha
    	 //j2    m1  jogador ganha
    	 //j3   m2   jogador ganha   
    	//j1   m2   maquina ganha
    	 //j2   m3   maquina ganha
    	 //j3   m1   maquina ganha
    	 
    	 
    	 
    	 
    	 
    	 if(jg.getjogador() - jg.getmaquina() == -2 ||
    			 (jg.getjogador() - jg.getmaquina() == 1)){
    		
    				 System.out.printf("Voce foi o vencedor! Voce escolheu %s: e ele %s:", jg.getjogador(),jg.getmaquina());
    				 System.out.println("");
    				 
    				 System.out.println("____________________________");
    	    		    System.out.println("1- PEDRA" );
    	    		    System.out.println("2- PAPEL");
    	    		     System.out.println("3- TESOURA");
    	    		     System.out.println("____________________________");
    	    		    
    				 
    	 }else {
    		 System.out.printf("Voce perdeu para a maquina.Voce escolheu %s e a maquina %s", jg.getjogador(),jg.getmaquina());
    		 System.out.println("");
    		 
    		 System.out.println("");
    		 System.out.println("___________________________");
 		    System.out.println("1- PEDRA" );
 		    System.out.println("2- PAPEL");
 		     System.out.println("3- TESOURA");
 		     System.out.print("____________________________");
    	 }
    				 
    		 
    	
    	 
    	 
    
    	
     }
     
           
}
     



	

	



