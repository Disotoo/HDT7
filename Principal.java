import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Archivo archivo = new Archivo("./diccionario.txt");
        ArrayList<String> lineasTraducciones = archivo.leerArchivo();
        Archivo archivo1 = new Archivo("./texto.txt");
        ArrayList<String> traducir = archivo1.leerArchivo();
        String separada = traducir.get(0);
        String[] separadas = separada.split(" ");
        Scanner teclado = new Scanner(System.in);
        Traductor traductor = new Traductor();
        BinarySearchTree<String, Asociacion> Tree = traductor.generarArbol();
        int cuenta = 0; 
        String resultado = "";

        try{
            System.out.println("Cual es el idioma original?: \n1. Español \n2. Ingles \n3. Frances");
            int original = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Cual es el idioma a traducir?: \n1. Español \n2. Ingles \n3. Frances");
            int idiomaTraducir = teclado.nextInt();
            teclado.nextLine();
            boolean salir = false;

            String casas = lineasTraducciones.get(0);
            String perros = lineasTraducciones.get(1);
            String tareas = lineasTraducciones.get(2);
            String mujeres = lineasTraducciones.get(3);
            String pueblos = lineasTraducciones.get(4);
            String sis = lineasTraducciones.get(5);


            switch(original){
                case 1: 
                    String[] casa = casas.split(",");
                    String[] perro = perros.split(",");
                    String[] tarea = tareas.split(",");
                    String[] mujer = mujeres.split(",");
                    String[] pueblo = pueblos.split(",");
                    String[] si = sis.split(",");

                    Asociacion v1 = traductor.crear(casa[1], casa[0] , casa[2]);
                    Asociacion v2 = traductor.crear(perro[1], perro[0] , perro[2]);
                    Asociacion v3 = traductor.crear(tarea[1], tarea[0] , tarea[2]);
                    Asociacion v4 = traductor.crear(mujer[1], mujer[0] , mujer[2]);
                    Asociacion v5 = traductor.crear(pueblo[1], pueblo[0] , pueblo[2]);
                    Asociacion v6 = traductor.crear(si[1], si[0] , si[2]);

                    Tree.add(v1);
                    Tree.add(v2);
                    Tree.add(v3);
                    Tree.add(v4);
                    Tree.add(v5);
                    Tree.add(v6);

                    switch(idiomaTraducir){
                        case 1: 
                        System.out.println(archivo1);
                        break;

                        case 2: 
                        for(String palabra : separadas){
                            Asociacion cambio = Tree.search(palabra);
                            if(Tree.search(palabra) != null){
                                String par = cambio.getTraducciones().get(0);
                                resultado = resultado + par;
                            }   
                            else{
                                resultado = resultado + "*"+palabra+"*";
                            }
                        }
                        break;

                        case 3: 
                        for(String palabra : separadas){
                            Asociacion cambio = Tree.search(palabra);
                            if(Tree.search(palabra) != null){
                                String par = cambio.getTraducciones().get(1);
                                resultado = resultado + par;
                            }   
                            else{
                                resultado = resultado + "*"+palabra+"*";
                            }
                        }
                        break;

                        default: 
                        System.out.println("Ingrese una opcion valida");
                        
                    }
                break;

                case 2:
                break;
                
                case 3:
                break;

                default: 
                System.out.println("Ingrese una opcion valida");
                break;
            }
            System.out.println(resultado);
        } catch (Exception e){
            teclado.nextLine();
            System.out.println("Ingreso algo incorrecto");
        }


        
    }
}
