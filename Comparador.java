import java.util.Comparator;
/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 7
 * 25-03-2023
 */


public class Comparador implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.equals(o2)) {
			return 0;
		} else {
			return 1;
		}
    }
    
}
