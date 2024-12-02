package mainpackage;

//IMPORTA LIBRERIA SCANNER E RANDOM
import java.util.Scanner;
import java.util.Random;

public class ParcoDivertimenti {
	public static void main(String[] arg) {
	
		//APERTURA SCANNER
		
		Scanner scanner = new Scanner(System.in);
		
		//ORARIO APERTURA PARCO
		int minutiapertura = 0;
	
		
		//VARIABILI ATTRAZIONE UNO
		String attrazione1 = ("Montagna Russa");
		int capacitacorsa1 = 10;
		int capacitagiorno1 = 480;
		int costogiro1 = 5;
		int biglietto1 = 15;
		int maxgiri1 = 48;
		int tempogiro1 = 10;
		int tempodecorrenza1 = tempogiro1; //- girofattofinoaquelmomento1; //da ottenere nel ciclo
		int coda1 = tempodecorrenza1 * capacitacorsa1 ; //OPPURE persona +1
		int tempoattesa1 =0;
		int marcatoretempo1;
		int temporimanente1=0;
		
		
		//VARIABILI ATTRAZIONE DUE
		String attrazione2 = ("Ruota Panoramica");
		int capacitacorsa2 = 5;
		int capacitagiorno2 = 240;
		int costogiro2 = 40;
		int biglietto2 = 10;
		int maxgiri2 = 72;
		int tempogiro2 = 10;
		int tempodecorrenza2 =tempogiro2;// - girofattofinoaquelmomento2; //da ottenere nel ciclo
		int coda2 = tempodecorrenza2 * capacitacorsa2 ; //OPPURE persona +1
		int tempoattesa2 =0;
		int marcatoretempo2;
		int temporimanente2=0;
		
		//VARIABILI ATTRAZIONE TRE
				String attrazione3 = ("Casa degli orrori");
				int capacitacorsa3 = 5;
				int capacitagiorno3 = 240;
				int costogiro3 = 30;
				int biglietto3 = 10;
				int maxgiri3 = 72;
				int tempogiro3 = 10;
				int tempodecorrenza3 = tempogiro3; //- girofattofinoaquelmomento3; //da ottenere nel ciclo
				int coda3 = tempodecorrenza3 * capacitacorsa3 ; // OPPURE persona +1
				int tempoattesa3 = 0;
		        int marcatoretempo3;
		        int temporimanente3=0;
		        
		        
		        int tempoattesa1tot=0;
		        int tempoattesa2tot=0;
		        int tempoattesa3tot=0;
		        
		        
		        int clientisoddisfatti=0;
		        int clientisi1=0;
		        int clientisi2=0;
		        int clientisi3=0;
		        
		        int clientisoddisfattitotal=clientisi1+clientisi2+clientisi3;
				//GENERAZIONE UTENTE
				int budget;
				int pazienza;
				//INIZIO PERCORSO UTENTE
				int persona=minutiapertura;
				int perclientisodd=(clientisoddisfattitotal/720)*100;
				
				
					
					for(int minuto=0;minuto<=minutiapertura;minuto++){
						
							int marcatore=minuto; 
							budget=10+(int)(Math.random()*26); 
							
							 pazienza=10+(int)(Math.random()*26);
						tempoattesa1tot=temporimanente1+(coda1/capacitacorsa1)+10;
						 tempoattesa1tot=temporimanente2+(coda1/capacitacorsa1)+10;
						 tempoattesa1tot=temporimanente3+(coda1/capacitacorsa1)+10;
						
						int sceltaattrazione=-1;
						
						if(pazienza>=tempoattesa1  && budget>=biglietto1) {
							
						
							int ssceltaattrazione= 1;
						}
						 if (pazienza>=tempoattesa2 && budget>=biglietto2 ) {
							 if(sceltaattrazione==-1 || sceltaattrazione==1 && coda2<coda1)
							sceltaattrazione=2;
							
						}
						
						else if(pazienza>=tempoattesa3 && budget>biglietto3 && coda2>=10) {
							
							if(coda3<coda1 && coda3<coda2) {
								sceltaattrazione=3;
							}
						}
						 
						 if(sceltaattrazione==1) {
							 
							 coda1++;
							 tempoattesa1tot+=tempoattesa1;
							 clientisi1++;
						 } 
						 if(sceltaattrazione==2) {
							 
							 coda2++;
							 tempoattesa2tot+=tempoattesa2;
							 clientisi2++;
						 }
                          if(sceltaattrazione==3) {
							 
							 coda3++;
							 tempoattesa3tot+=tempoattesa3;
							 clientisi3++;
						 }
                          
                          if(coda1==capacitacorsa1 && temporimanente1==0) {
                        	  int personein=0;
                        	  personein++;
                        	/*  giri1=0;
                        	  giri1++;
                        	  int numerigiri3
                        	  */
                        	  }
                          }
						int numerigiri1=clientisi1   /10;
						int numerigiri2=clientisi2   /10;
						int numerigiri3=clientisi3   /10;
						
						int costotot1=numerigiri1 *5;
						int costotot2=numerigiri2 *5;
						int costotot3=numerigiri3 *5;
				
				
			}
					
	}

