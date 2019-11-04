/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodlm_ad;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author xp
 */
public class ProyectoDLM_AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("indique si quiere logearse(1), dar de alta(2) o dar de baja(3): \n");
        int menu = sc.nextInt();
       
       // int numReg = CalculaRegistro(fichero);
        // System.out.println("Número de registros: " + numReg+ "\n");
        if(menu == 1){
            System.out.println("usted ha seleccionado logearse \n");
            System.out.println("introduzca ahora su dni: \n");
            String dni = sc.nextLine();

        }else{
            if(menu == 2){
                 
                 System.out.println("usted ha seleccionado dar de alta \n");
                 System.out.println("escriba ahora su registro: \n");
                 java.io.File ff = new java.io.File("clientes.txt");
                 java.io.RandomAccessFile aa = new java.io.RandomAccessFile(ff,"rw");
                 
                 
                 Scanner sc_d = new Scanner(System.in);
                 Scanner sc_n = new Scanner(System.in);
                 Scanner sc_c = new Scanner(System.in);
                 Scanner sc_t = new Scanner(System.in);
                 Scanner sc_p = new Scanner(System.in);
                 
                 
                 String _dni = sc_d.nextLine();
                 String _nombre = sc_n.nextLine();
                 String _correo = sc_c.nextLine();
                 String _tlf = sc_t.nextLine();
                 String _pwd = sc_p.nextLine();
                 
                 char dni[] = new char[9];
                 char nombre[] = new char[15];
                 char correo[] = new char[20];
                 char tlf[] = new char[9];
                 char pwd[] = new char[15];
                 
                 for(int i=0; i<_dni.length(); i++){  
                     dni[i] = _dni.charAt(i);
                 }
                  for(int i=0; i<_nombre.length(); i++){  
                     nombre[i] = _nombre.charAt(i);
                 }
                   for(int i=0; i<_correo.length(); i++){  
                     correo[i] = _correo.charAt(i);
                 }
                    for(int i=0; i<_tlf.length(); i++){  
                     tlf[i] = _tlf.charAt(i);
                 }
                     for(int i=0; i<_pwd.length(); i++){  
                     pwd[i] = _pwd.charAt(i);
                 }
                 System.out.println(String.valueOf(dni) + "\n");
                 System.out.println(nombre + "\n");
                 System.out.println(correo + "\n");
                 System.out.println(tlf + "\n");
                 System.out.println(pwd + "\n");
                 
                 System.out.println(_dni);
                 
                //Registro reg = new Registro(dni,nombre,correo,tlf,pwd);
                //grabarRegistro(aa, reg, ff); 
                 
            }else{ if(menu == 3){
                 System.out.println("usted ha seleccionado dar de baja \n");
                 System.out.println("escriba ahora su registro: \n");
                 
                 
            }
        } 
       
    }
    //definimos la clase Registro con la estructura que va a tener el
//fichero. En nuestro caso, el nombre del alumno y 4 notas.
    
}
    public class Registro{
        protected char dni[];
        protected char nombre[];
        protected char correo[];
        protected char tlf[];
        protected char pwd[];

      

    
        public void Registro( char dni[], char nombre[], char correo[], char tlf[], char pwd[]){
               this.dni = new char[9];
               this.dni = dni;

               this.nombre = new char[15];
               this.nombre = nombre;

               this.correo = new char[20];
               this.correo = correo;

               this.tlf = new char[9];
               this.tlf = tlf;

               this.pwd = new char[15];
               this.pwd = pwd;
        }
    }
    public static void grabarRegistro(RandomAccessFile aa, Registro estudiante, File fal) throws IOException {
                // desplazarse al final del archivo
                int longitud = (int)fal.length();
                aa.seek(longitud);
                // escribir datos del registro en el archivo aleatorio
                for (int i=0; i < (estudiante.dni).length ; i++){
                 aa.writeChar(estudiante.dni[i]);
                }
                 for (int i=0; i < (estudiante.nombre).length ; i++){
                 aa.writeChar(estudiante.nombre[i]);
                }
                  for (int i=0; i < (estudiante.correo).length ; i++){
                 aa.writeChar(estudiante.correo[i]);
                }
                   for (int i=0; i < (estudiante.tlf).length ; i++){
                 aa.writeChar(estudiante.tlf[i]);
                }
                    for (int i=0; i < (estudiante.pwd).length ; i++){
                 aa.writeChar(estudiante.pwd[i]);
                }
                //mostramos el tamaño del fichero una vez escrito en el fichero
                longitud = (int)fal.length();
                System.out.println("length file: " + longitud);
}
}
