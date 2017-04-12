
package Controladora;

import BD.*;
import Ventanas.*;
import Clases.*;

public class Controladora {
    
    private static TrabajadorBD tbd;
    private static CentroTrabajoBD cbd;
  
    public static void main(String[] args)
    {
         tbd = new TrabajadorBD();
         cbd = new CentroTrabajoBD();
         
      
         MenuPrincipal v = new MenuPrincipal();
         v.setVisible(true);
    }
    
    public static void altaTrabajador(/*Datos Tr*/) throws Exception{
        Trabajador T = new Trabajador(/*Datos Tr*/);
        tbd.alta(T);
        
    }
    public static void altaCentroTrabajo(int NumeroCentro,String Nombre, String Calle, String Telefono, String CP, String Ciudad, String Provincia) throws Exception{
        CentroTrabajo C = new CentroTrabajo(NumeroCentro, Nombre,  Calle,  Telefono,  CP,  Ciudad, Provincia);
        cbd.alta(C);       
    }
    
    public static void bajaTrabajador(String dni) throws Exception{
        tbd.baja(dni);         
    }
    
     public static void bajaCentroTrabajo(int d) throws Exception{
        cbd.baja(d);
    }
    
    
    public static void modificarTrabajador(/*DatosTrabajador*/) throws Exception{
        Trabajador tViejo = new Trabajador(/*DatosTrabajador*/);
        Trabajador tNuevo = new Trabajador(/*DatosTrabajador*/);
        tbd.modificar(tViejo, tNuevo);      /*comprobar orden*/        
    }
    
    public static void modificarCentroTrabajo(int NumeroCentro,String Nombre, String Calle, String Telefono, String CP, String Ciudad, String Provincia) throws Exception{
        CentroTrabajo C =new CentroTrabajo(NumeroCentro, Nombre,  Calle,  Telefono,  CP,  Ciudad, Provincia); ;
        cbd.modificar(C);    
    }
    
    public static void consultarPorCentroNum(int n){
        /*Pendiente de enlazar paquete*/
    }
            
    public static void consutlarPorCentroNombre (String s){
        /*Pendiente de enlazar paquete*/
    }
    
    
}
