
package trabalhocartas;

import java.security.SecureRandom;
import javax.swing.ImageIcon;


public class Baralho {
    private Cartas cartas;
    private Naipes naipes;
    static  private ImageIcon imagem ; 
    private static final SecureRandom random = new SecureRandom(); 

    public Baralho(Cartas cartas, Naipes naipes, ImageIcon imagem) {
        this.cartas = cartas;
        this.naipes = naipes;
        this.imagem = imagem; 
    }

    public Cartas getCartas() {
        return cartas;
    }

    public Naipes getNaipes() {
        return naipes;
    }

    public static ImageIcon getImagem() {
        return imagem;
    }
    public static Baralho [] criabaralho (){
        int tamanho = Naipes.values().length * Cartas.values().length;
       Baralho baralho [] = new Baralho [tamanho];
       int i= 0;
       for (Naipes naipes: Naipes.values()){
           for(Cartas cartas: Cartas.values()){
               baralho[i++] = new Baralho (cartas , naipes, imagem);
           }
       }
        for (int uno = 0 ; uno < baralho.length; uno ++){
            int dos = random.nextInt(tamanho); 
            Baralho temp = baralho[uno]; 
            baralho [uno] = baralho [dos];
            baralho [dos] = temp; 
        }
       return baralho;
    }
    public static void main (String[] args ){
        Baralho um [] = Baralho.criabaralho();
            for (Baralho baralho: um) {
                System.out.println(baralho.getCartas().getCartadobaralho() + 
                        " de " + baralho.getNaipes().getNaipes());
            }
    }
          
}
