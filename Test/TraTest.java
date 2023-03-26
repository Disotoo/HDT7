import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 7
 * 25-03-2023
 * Clase TRaTest: Pruebas Unitarias
 */


class TraTest {

	@Test
	void agregaryBuscar() {
		Comparador comparador = new Comparador();
		Extraer<String, Asociacion> extraer = new Extraer<String, Asociacion>();
		ArrayList<String> ar1 = new ArrayList<String>();
		ArrayList<String> ar2 = new ArrayList<String>();
		ArrayList<String> ar3 = new ArrayList<String>();
		ar1.add("casa");
		ar1.add("loger");
		ar2.add("perro");
		ar2.add("chien");
		ar3.add("mujer");
		ar3.add("femme");
		

		BinarySearchTree<String, Asociacion> arbol = new BinarySearchTree<>(comparador, extraer);

		arbol.add("house", new Asociacion("house",ar1));
		arbol.add("dog", new Asociacion("dog",ar2));
		arbol.add("woman", new Asociacion("woman",ar3));


		assertEquals("house", arbol.search("house").getIdiomaOri());
		assertEquals(null, arbol.search("yes"));
		assertEquals("dog", arbol.search("dog").getIdiomaOri());
	}

	

}