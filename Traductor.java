import java.util.ArrayList;

public class Traductor {
    
    public BinarySearchTree<String, Asociacion> generarArbol(){
        Comparador compararLlave = new Comparador();
        Extraer<String, Asociacion> llave = new Extraer<String, Asociacion>();
        BinarySearchTree<String, Asociacion> arbol = new BinarySearchTree<String, Asociacion>(compararLlave, llave );
        return arbol;
    }

    public Asociacion crear(String original, String val1, String val2){
        ArrayList<String> lista = new ArrayList<>();
        lista.add(val1);
        lista.add(val2);
        Asociacion aso = new Asociacion(original, lista);
        return aso;
    }

    public String traducir(String pal1, String pal2){
        return "";
    }


}
