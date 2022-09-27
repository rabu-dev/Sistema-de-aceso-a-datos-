
package acesosadatos_tema1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Raul Raposo buzon
 */
public class Acesosadatos_tema1 {
    static void eliminarArchivo(String name){
    File f = new File(name);
    if (f.exists()){
    f.delete();
    }if(!f.exists()){
    System.err.println("NO esta EL fichero que usted a puesto "+"'"+name+"'");
    }
    }
    
    static void listarTodo(String direcionCarpeta){
     File f = new File(direcionCarpeta);
    f.list();
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
    f.createNewFile();
    }
   
   }
   static void listarFile(String direcionCarpeta){
    File f = new File(direcionCarpeta);
    File[] listFiles = f.listFiles();
    for (File file : listFiles) {
        System.out.println(file);
    }
   }
    public static void main(String[] args) throws IOException {
        try{
        File fileOrigen = new File("D\\pruebas.txt");
        File fileDestino = new File("D:\\pruebas\\pruebas.txt");
        
        creacionFile("D:\\pruebas\\prueba1.txt");
        listarFile("D:\\pruebas");
        creacionDir("D:\\pruebas\\raul");
        listarFile("D:\\pruebas");
        listarTodo("D:\\pruebas");
        eliminarArchivo("D:\\pruebas\\prueba1.txt");
         creacionFile("D:\\pruebas\\prueba2.txt");
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
}
