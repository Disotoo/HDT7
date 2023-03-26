import java.util.ArrayList;
/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 7
 * 25-03-2023
 */

public class Guardar<K,V> implements ITraversal<K,V> {

    private ArrayList<Asociacion> miListado = new ArrayList<Asociacion>();

    @Override
    public void visit(TreeNode<K, V> actualNode) {
        Asociacion actual = (Asociacion) actualNode.getValue();
        miListado.add(actual);
    }

    public ArrayList<Asociacion> getMiListado(){
        return miListado;
    }

    public void setMiListado(ArrayList<Asociacion> miListado){
        this.miListado = miListado;
    }
    
}
