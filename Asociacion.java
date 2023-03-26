import java.util.ArrayList;

public class Asociacion {
    private String idiomaOri;
    private ArrayList<String> traducciones;  

    public Asociacion(String idiomaOri, ArrayList<String> traducciones) {
        this.idiomaOri = idiomaOri;
        this.traducciones = traducciones;
    }
    
    public String getIdiomaOri() {
        return this.idiomaOri;
    }

    public void setIdiomaOri(String idiomaOri) {
        this.idiomaOri = idiomaOri;
    }

    public ArrayList<String> getTraducciones() {
        return this.traducciones;
    }

    public void setTraducciones(ArrayList<String> traducciones) {
        this.traducciones = traducciones;
    }
    
}
