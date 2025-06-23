//Criar um sistema de Cifras simples
package cifraplayer;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.Scanner;


public class CifraPlayer {
public void play (String NovaEra){
    URL url = getClass().getResource(NovaEra+".wav");
    AudioClip audio = Applet.newAudioClip(url);
    audio.play();
    }

public void play2 (String Tornado){
    URL url = getClass().getResource(Tornado+".wav");
    AudioClip audio = Applet.newAudioClip(url);
    audio.play();
    }


    public static void main(String[] args) {
    Scanner cifra = new Scanner(System.in);
    CifraPlayer meuPlayer = new CifraPlayer();
    int escolha;
    
    do{
        System.out.println("===== Bem - Vindo(a) =====");
        System.out.println("Escolha uma musica abaixo: ");
        System.out.println("1- Tornado Of Souls - Megadeth");
        System.out.println("2- Nova Era - Angra");
        System.out.println("3- Sair \n");
        escolha  = cifra.nextInt();
        
       switch(escolha){
           case 1:
               System.out.println("Opção Escolhida: Tornado of Souls - Megadeth");
               System.out.println(""
              +"E|----------------------------------------------------|\n"+
               "B|----------------------------------------------------|\n"+
               "G|----------------------------------------------7-----|\n"+
               "D|-----------------------------------7-----9p7--------|\n"+
               "A|--9------------7h8p7------7--8--9-----9-------------|\n"+
               "E|--7--7--9--10---------10----------------------------|\n");
               System.out.println("======================================");
               meuPlayer.play2("Tornado");
               System.out.println("1- Sair");
               escolha = cifra.nextInt();
               break;
               
           case 2: 
               System.out.println("Opção Escolhida: Nova Era - Angra");
               System.out.println(""
                +"E|------------------------------------------------------------------------------\n" +
                 "B|-----------------------------------------------------17-18---17---------------\n" +
                 "G|-14--------14---17--16----------16--17b----17-16-17--------19--17--19--16--17-\n" +
                 "D|--------14-------------------18-----------------------------------------------\n" +
                 "A|-----15---------------15--19--------------------------------------------------\n" +
                 "E|------------------------------------------------------------------------------");
                 System.out.println("================================================================");
                 meuPlayer.play("NovaEra");
                 System.out.println("1- Sair");
                 escolha = cifra.nextInt();
                 break;
               
           case 3:
               System.out.println("Encerrando");
               break;
               
           default:
               System.out.println("Informação Invalida");
       }
       
    }
    while(escolha != 3);
    }
}
