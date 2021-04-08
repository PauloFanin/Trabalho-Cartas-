
package trabalhocartas;


public class Jogador {
    private final int cartasjogos = 5;
    private final String nomejogador ;
    private int [] maojogador = new int [cartasjogos] ;
    private int pontosjogador = 0 ;

    public Jogador(String nomejogador, int []maojogador, int pontosjogador) {
        this.nomejogador = nomejogador;
        this.maojogador = maojogador;
        this.pontosjogador =pontosjogador; 
    }

    public int getCartasjogos() {
        return cartasjogos;
    }

    public String getNomejogador() {
        return nomejogador;
    }

    public int[] getMaojogador() {
        return maojogador;
    }

    public int getPontosjogador() {
        return pontosjogador;
    }
    public static int somatorio (int casa, int jogador ){
        return (casa + jogador);
    }
    
}
