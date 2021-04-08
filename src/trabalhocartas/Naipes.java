
package trabalhocartas;


public enum Naipes {
    COPAS ("copas", "NC"), ESPADA ("espada", "NE"), PAUS ("paus", "NP"), OURO ("ouro", "NO");
    
    private final String naipes ;
    private final String codigonaipe; 

    private Naipes(String naipes,String codigonaipe) {
        this.naipes = naipes;
        this.codigonaipe = codigonaipe; 
    }

    public String getCodigonaipe() {
        return codigonaipe;
    }
    
    public String getNaipes() {
        return naipes;
    }
        
    
    
    
}
