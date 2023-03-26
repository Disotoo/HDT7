import java.util.ArrayList;
/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 7
 * 25-03-2023
 */

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
