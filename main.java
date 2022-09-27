
package acesosadatos_tema1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Todo los derechos a Rubu.dev
 * @author Raul Raposo buzon
 */
public class Acesosadatos_tema1 {
    static void eliminarDirectorio(String name){
    File f = new File(name);
    if(f.delete())
        System.out.println("El fichero " + name + " ha sido borrado correctamente");
    else
    System.out.println("El fichero " + name + " no se ha podido borrar");
    }
    static void eliminarArchivo(String name){
    File f = new File(name);
    if (f.exists()){
    f.delete();
    }if(!f.exists()){
    System.err.println("NO esta EL fichero que usted a puesto "+"'"+name+"'");
    }
    }
    
    
    static void creacionDir(String name){
    File f = new File(name);
    if (!f.exists()){
    f.mkdir();
    }
    }
   static void creacionFile(String name) throws IOException{
   File f = new File(name);
    if (!f.exists()) {
    System.out.println("Crecion de archivo completado");
    f.createNewFile();
    }else{
    System.err.println("Error no se podido crear el arhivo");
    }
   
   }
   
   static void listarTodo(String direcionCarpeta){
    File f = new File(direcionCarpeta);
    File[] listFiles = f.listFiles();
    System.err.println("Listado de archivos :");
    for (File file : listFiles) {
        System.out.println(file);
    }
   }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try{
          
          creacionFile("D:\\pruebas\\prueba.txt");
           
          listarTodo("D:\\pruebas\\");
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
    
}
