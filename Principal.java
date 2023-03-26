import java.util.ArrayList;
import java.util.Scanner;
/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 7
 * 25-03-2023
 */

public class Principal {
    public static void main(String[] args) {
        
        Archivo archivo = new Archivo("./diccionario.txt");
        ArrayList<String> lineasTraducciones = archivo.leerArchivo();
        Archivo archivo1 = new Archivo("./texto.txt"); // solo puede tener una oracion 
        ArrayList<String> traducir = archivo1.leerArchivo();
        String separada = traducir.get(0);
        String[] separadas = separada.split(" ");
        Scanner teclado = new Scanner(System.in);
        Traductor traductor = new Traductor();
        BinarySearchTree<String, Asociacion> Tree = traductor.generarArbol();
        String resultado = "";
        Guardar<String, Asociacion> miRecorrido = new Guardar<String, Asociacion>();
        String orden = "";

        try{
            System.out.println("Cual es el idioma original?: \n1. Español \n2. Ingles \n3. Frances");
            int original = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Cual es el idioma a traducir?: \n1. Español \n2. Ingles \n3. Frances");
            int idiomaTraducir = teclado.nextInt();
            teclado.nextLine();

            String casas = lineasTraducciones.get(0);
            String perros = lineasTraducciones.get(1);
            String tareas = lineasTraducciones.get(2);
            String mujeres = lineasTraducciones.get(3);
            String pueblos = lineasTraducciones.get(4);
            String sis = lineasTraducciones.get(5);
            String[] casa = casas.split(",");
            String[] perro = perros.split(",");
            String[] tarea = tareas.split(",");
            String[] mujer = mujeres.split(",");
            String[] pueblo = pueblos.split(",");
            String[] si = sis.split(",");

            orden = "("+perros+")" + "("+tareas+")" + "("+casas+")" + "("+pueblos+")" + "("+mujeres+")" + "("+sis+")"; 

            switch(original){
                case 1: 
                    

                    Asociacion v1 = traductor.crear(casa[1], casa[0] , casa[2]);
                    Asociacion v2 = traductor.crear(perro[1], perro[0] , perro[2]);
                    Asociacion v3 = traductor.crear(tarea[1], tarea[0] , tarea[2]);
                    Asociacion v4 = traductor.crear(mujer[1], mujer[0] , mujer[2]);
                    Asociacion v5 = traductor.crear(pueblo[1], pueblo[0] , pueblo[2]);
                    Asociacion v6 = traductor.crear(si[1], si[0] , si[2]);

                    Tree.add(casa[1],v1);
                    Tree.add(perro[1],v2);
                    Tree.add(tarea[1],v3);
                    Tree.add(mujer[1],v4);
                    Tree.add(pueblo[1],v5);
                    Tree.add(si[1],v6);

                    switch(idiomaTraducir){
                        case 1: 
                        for(String palabra : traducir){
                            resultado = resultado + palabra + " ";
                        }
                        break;
                        
                        case 2: 
                        for(String palabra : separadas){
                            Asociacion cambio = Tree.search(palabra);
                            if(Tree.search(palabra) != null){
                                String par = cambio.getTraducciones().get(0);
                                resultado = resultado + par + " ";
                            }   
                            else{
                                resultado = resultado + "*"+palabra+"* ";
                            }
                        }
                        break;

                        case 3: 
                        for(String palabra : separadas){
                            Asociacion cambio = Tree.search(palabra);
                            if(Tree.search(palabra) != null){
                                String par = cambio.getTraducciones().get(1);
                                resultado = resultado + par + " ";
                            }   
                            else{
                                resultado = resultado + "*"+palabra+"* ";
                            }
                        }
                        break;

                        default: 
                        System.out.println("Ingrese una opcion valida");
                        
                    }
                break;

                case 2:
                    Asociacion v11 = traductor.crear(casa[0], casa[1] , casa[2]);
                    Asociacion v22= traductor.crear(perro[0], perro[1] , perro[2]);
                    Asociacion v33 = traductor.crear(tarea[0], tarea[1] , tarea[2]);
                    Asociacion v44 = traductor.crear(mujer[0], mujer[1] , mujer[2]);
                    Asociacion v55 = traductor.crear(pueblo[0], pueblo[1] , pueblo[2]);
                    Asociacion v66 = traductor.crear(si[0], si[1] , si[2]);

                    Tree.add(casa[0],v11);
                    Tree.add(perro[0],v22);
                    Tree.add(tarea[0],v33);
                    Tree.add(mujer[0],v44);
                    Tree.add(pueblo[0],v55);
                    Tree.add(si[0],v66);

                    switch(idiomaTraducir){
                        case 1: 
                        for(String palabra : separadas){
                            Asociacion cambio = Tree.search(palabra);
                            if(Tree.search(palabra) != null){
                                String par = cambio.getTraducciones().get(0);
                                resultado = resultado + par + " ";
                            }   
                            else{
                                resultado = resultado + "*"+palabra+"* ";
                            }
                        }
                        break;
                        
                        case 2: 
                        for(String palabra : traducir){
                            resultado = resultado + palabra + " ";
                        }
                        break;

                        case 3: 
                        for(String palabra : separadas){
                            Asociacion cambio = Tree.search(palabra);
                            if(Tree.search(palabra) != null){
                                String par = cambio.getTraducciones().get(1);
                                resultado = resultado + par + " ";
                            }   
                            else{
                                resultado = resultado + "*"+palabra+"* ";
                            }
                        }
                        break;

                        default: 
                        System.out.println("Ingrese una opcion valida");
                    }
                break;
                
                case 3:
                Asociacion vv1 = traductor.crear(casa[2], casa[1] , casa[0]);
                    Asociacion vv2= traductor.crear(perro[2], perro[1] , perro[0]);
                    Asociacion vv3 = traductor.crear(tarea[2], tarea[1] , tarea[0]);
                    Asociacion vv4 = traductor.crear(mujer[2], mujer[1] , mujer[0]);
                    Asociacion vv5 = traductor.crear(pueblo[2], pueblo[1] , pueblo[0]);
                    Asociacion vv6 = traductor.crear(si[2], si[1] , si[0]);

                    Tree.add(casa[2],vv1);
                    Tree.add(perro[2],vv2);
                    Tree.add(tarea[2],vv3);
                    Tree.add(mujer[2],vv4);
                    Tree.add(pueblo[2],vv5);
                    Tree.add(si[2],vv6);

                    switch(idiomaTraducir){
                        case 1: 
                        for(String palabra : separadas){
                            Asociacion cambio = Tree.search(palabra);
                            if(Tree.search(palabra) != null){
                                String par = cambio.getTraducciones().get(0);
                                resultado = resultado + par + " ";
                            }   
                            else{
                                resultado = resultado + "*"+palabra+"* ";
                            }
                        }
                        break;
                        
                        case 2: 
                        for(String palabra : separadas){
                            Asociacion cambio = Tree.search(palabra);
                            if(Tree.search(palabra) != null){
                                String par = cambio.getTraducciones().get(1);
                                resultado = resultado + par + " ";
                            }   
                            else{
                                resultado = resultado + "*"+palabra+"* ";
                            }
                        }
                        break;
                        
                        case 3: 
                        for(String palabra : traducir){
                            resultado = resultado + palabra + " ";
                        }
                        break;

                        default: 
                        System.out.println("Ingrese una opcion valida");
                    }
                break;

                default: 
                System.out.println("Ingrese una opcion valida");
                break;
            }
            System.out.println("\nOracion traducida: ");
            System.out.println(resultado);
            System.out.println("\nOrdenados en ingles: ");
            System.out.println(orden);


        } catch (Exception e){
            teclado.nextLine();
            System.out.println("Ingreso algo incorrecto");
        }


        
    }
}
