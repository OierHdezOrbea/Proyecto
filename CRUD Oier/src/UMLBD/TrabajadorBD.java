
package UMLBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import UML.*;


public class TrabajadorBD {
    private static String plantilla;
    private static PreparedStatement ps;
    private static Statement sentencia;
    private static ResultSet resultado;
    
    public GenericoBD gbd;
    
    public TrabajadorBD(){
        gbd = new GenericoBD();
        
    }
    
public void alta(Trabajador t)throws Exception{
    
    gbd.abrirBD();
    
    plantilla = "INSERT INTO trabajador VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    ps.getConnection().prepareStatement(plantilla);
        ps.setInt(1,t.getDni());
        ps.setString(2,t.getNombre());
        ps.setString(3,t.getApellidos());
        ps.setString(4,t.getCalle());
        ps.setString(5,t.getPortal());
        ps.setString(6,t.getPiso());
        ps.setString(7,t.getTelPer());
        ps.setString(8,t.getTelEmp());
        ps.setInt(9,t.getSalario());
        ps.setString(10,t.getFechaNac());
        ps.setBoolean(11,t.isCategoria());
    int n = ps.executeUpdate();
        gbd.cerrarBD();
        
        }
public void baja(int dni)throws Exception{
    
    gbd.abrirBD();
    
    plantilla = "DELETE trabajador WHERE dni=?";
    ps.getConnection().prepareStatement(plantilla);
    ps.setInt(1,dni);
    int n = ps.executeUpdate();
        
        gbd.cerrarBD();
        if (n == 0);
            throw new Exception();
            
        }
public void modificacion(Trabajador ta, Trabajador tn)throws Exception{
    
    gbd.abrirBD();
    
    plantilla = "UPDATE trabajador SET dni=?, nombre=?, apellidos=?, calle=?, portal=?, piso=?, TelPer=?, TelEmp=?, salario=?, fechaNac=?, categoria=?";
    ps.getConnection().prepareStatement(plantilla);
    ps.setInt(1,tn.getDni());
        ps.setString(2,tn.getNombre());
        ps.setString(3,tn.getApellidos());
        ps.setString(4,tn.getCalle());
        ps.setString(5,tn.getPortal());
        ps.setString(6,tn.getPiso());
        ps.setString(7,tn.getTelPer());
        ps.setString(8,tn.getTelEmp());
        ps.setInt(9,tn.getSalario());
        ps.setString(10,tn.getFechaNac());
        ps.setBoolean(11,tn.isCategoria());
        int n = ps.executeUpdate();
        gbd.cerrarBD();
        if (n == 0)
            throw new Exception();
}

    
    
}

