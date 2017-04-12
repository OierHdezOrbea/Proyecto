
package main;
import UML.*;
import UMLBD.*;
import Ventanas.*;
import java.sql.CallableStatement;


public class Controladora {

    public static Centro c;
    public static Trabajador t;
    
    
    public static VentanaPrincipal vp;
    public static VentanaCentro vc;
    public static VentanaTrabajador vt;
    
    private static TrabajadorBD tbd;
    private static CentroBD cbd;
    
    public static void main(String[] args) {
         
        vp = new VentanaPrincipal();
        vp.setVisible(true);
    
    }
    public static void VisualizarVentanaCentro(){
        vc = new VentanaCentro();
        vc.setVisible(true);
    }
    public static void VisualizarVentanaTrabajador(){
        vt = new VentanaTrabajador();
        vt.setVisible(true);
    }
    
    public static void altaTrabajador(int dni, String nombre, String apellidos, String calle, String portal, String piso, String TelPer, String TelEmp, int salario, String fechaNac, boolean categoria) throws Exception{
        Trabajador t = new Trabajador();
        tbd.alta(t);
    }   
   
    public static void modificacionTrabajador(int dni, String nombre, String apellidos, String calle, String portal, String piso, String TelPer, String TelEmp, int salario, String fechaNac, boolean categoria) throws Exception{
        Trabajador ta = new Trabajador();
        Trabajador tn = new Trabajador();
        tbd.modificacion(ta, tn);       
    }
    
    public static void bajaTrabajador (int dni) throws Exception{
        tbd.baja(dni);         
    }    
    
    public static void altaCentro(int numero,String nombre, String provincia, String ciudad, String cp, String calle, String telefono) throws Exception{
        Centro c = new Centro(numero, nombre, provincia, ciudad, cp, calle, telefono);
        cbd.alta(c);       
    }
   
    public static void modificarCentroTrabajo(int numero,String nombre, String provincia, String ciudad, String cp, String calle, String telefono) throws Exception{
        Centro ca = new Centro(numero, nombre, provincia, ciudad, cp, calle, telefono);
        Centro cn = new Centro(numero, nombre, provincia, ciudad, cp, calle, telefono);
        cbd.modificacion(ca, cn);    
    }
    
    public static void bajaCentroTrabajo(int numero) throws Exception{
        cbd.baja(numero);
    }
      
    /*Consultas PROCEDURE*/
    
    public static void consultarCentroNum(int numero){
       
        
    }
            
    public static void consultarCentroNom(String nombre){
        
    }
    
    public static void consultarNumCentroPorNombre(int numero){
        
    }
    
}
