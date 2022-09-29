
package acesosadatos_tema1;

import java.io.*;
import java.util.Scanner;

/**
 * Todo los derechos a Rabu.dev
 * @author Raul Raposo buzon
 */
public class Acesosadatos_tema1 {
    public static String leerFile(String filename) throws IOException { 
        File file = new File(filename);
        int len = (int) file.length();
        byte[] bytes = new byte[len];
        FileInputStream fis = null; 
        try { 
            fis = new FileInputStream(file);
            assert len == fis.read(bytes); 
        } catch (IOException e) {
        close(fis); 
        throw e; }
        return new String(bytes, "UTF-8");
    } 
    public static void escribirFile(String filename, String text) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename);
            fos.write(text.getBytes("UTF-8")); 
        } catch (IOException e) { 
            close(fos);
            throw e; }
        }
    public static void close(Closeable closeable) {
            try { closeable.close(); } 
            catch(IOException ignored) { } }


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
    static void editarArchavo(String nombre,String contenido) throws IOException{
    File archivo = new File(nombre);
    FileWriter escribir = new FileWriter(archivo);
    String texto = contenido;
    for(int i=0; i<texto.length();i++){
    escribir.write(texto.charAt(i));
    escribir.close();
    }
    
    }
    
    static void creacionDir(String name){
    File f = new File(name);
    if (!f.exists()){
        
    f.mkdir();
    }else{
    System.err.println("El archivo "+name+" ya existe");
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
    System.err.println("Listado de archhivos y directorios :");
    File f = new File(direcionCarpeta);
    String[] list = f.list();
    for (String file : list) {
        System.out.print(file+"\n");
    }
   }
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\pruebas\\");
        Scanner sc = new Scanner(System.in);
        String Bienvenida = "";
        boolean paso = true;
        try{
        while(paso == true){
        System.out.print("User :");
        String comando = sc.nextLine();
        System.out.print("Direcion: ");
        String parametros = sc.nextLine();
        System.out.println("");
        switch(comando){
            case "exit":
              paso = false;
            break;
            case "list":
              listarTodo(parametros);
            break;
            case "mkdir":
              creacionDir(parametros);
            break;
            case "mkfile":
              creacionFile(parametros);
            break;
            case "deleteFile":
              eliminarArchivo(parametros);
            break;
            case "deleteDir":
              eliminarDirectorio(parametros);
            break;
        }
        
        }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
}
