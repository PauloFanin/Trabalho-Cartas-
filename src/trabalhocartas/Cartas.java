
package trabalhocartas;


public enum Cartas {
    DOIS ("2",2,"C02"), TRES ("3",3,"C03"), QUATRO ("4",4,"C04"), CINCO ("5",5,"C05"), SEIS ("6",6,"C06"), 
    SETE ("7",7,"C07"), OITO ("8",8,"C08") , NOVE ("9",9,"C09"), DEZ ("10",10,"C10"), J ("valete",11,"C11"),
    Q ("dama",12,"C12"), K ("rei",13,"C13"), A ("ás",14,"C14") ;
    
    private final String cartadobaralho;
    private final int cartaponto;
    private final String numcarta;

    private Cartas(String cartadobaralho, int cartaponto, String numcarta) {
        this.cartadobaralho = cartadobaralho;
        this.cartaponto = cartaponto;
        this.numcarta = numcarta;
    }

    public String getNumcarta() {
        return numcarta;
    }

    public String getCartadobaralho() {
        return cartadobaralho;
    }

    public int getCartaponto() {
        return cartaponto;
    }
    
}
