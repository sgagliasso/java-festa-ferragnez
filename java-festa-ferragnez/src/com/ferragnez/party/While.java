package com.ferragnez.party;
// Consegna:
// creare e inizializzare l’array contenente i nomi degli invitati
// chiedere all’utente come si chiama
// verificare che il nome sia presente nella lista
// lasciarlo entrare o rispedirlo cortesemente da dove è venuto
import java.util.Scanner;
public class While {
    public static void main(String[] args) throws Exception {
        // creo array di stringhe contenente gli invitati
        String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // chiedere all' invitato il nome e il cognome e salvarlo in una variabile
        Scanner input = new Scanner(System.in);
        System.out.println("Qual è il suo nome e cognome?");
        String nomeInvitato = input.nextLine();

        //verificare che la variabile stringa sia contenuta nell' array
       
        int i = 0;
            //se presente stampare sul terminale "Puoi entrare!" viceversa "Non può entrare!""
            Boolean eInvitato = false;
            while(!eInvitato && i < listaInvitati.length){
                //se presente stampare sul terminale "Puoi entrare!" viceversa "Non può entrare!""
                if(nomeInvitato.equals(listaInvitati[i])){
                    eInvitato = true;
                    
                }
                i++;
            }
    
            if(eInvitato == true){
                System.out.println("Puoi entrare!");
            }else{
                System.out.println("Non puoi entrare!");
            }
            
       
        input.close();
    }
}
