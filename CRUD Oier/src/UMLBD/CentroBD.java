
package UMLBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import UML.*;

public class CentroBD {
    
    private GenericoBD GBD;
    
    private static String plantilla;
    private static PreparedStatement ps;
    private static Statement sentencia;
    private static ResultSet resultado;
    
    public GenericoBD gbd;
    
    public CentroBD(){
        gbd = new GenericoBD();
        
    }
    
public void alta(Centro c)throws Exception{
    
    gbd.abrirBD();
    
    plantilla = "INSERT INTO centro VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    ps.getConnection().prepareStatement(plantilla);
        ps.setInt(1,c.getNumero());
        ps.setString(2,c.getNombre());
        ps.setString(3,c.getProvincia());
        ps.setString(4,c.getCiudad());
        ps.setString(5,c.getCp());
        ps.setString(6,c.getCalle());
        ps.setString(7,c.getTelefono());
    int n = ps.executeUpdate();
        gbd.cerrarBD();
        
        }
public void baja(int numero)throws Exception{
    
    gbd.abrirBD();
    
    plantilla = "DELETE centro WHERE numero=?";
    ps.getConnection().prepareStatement(plantilla);
    ps.setInt(1,numero);
    int n = ps.executeUpdate();
        
        gbd.cerrarBD();
        if (n == 0);
            throw new Exception();
            
        }
public void modificacion(Centro ca, Centro cn)throws Exception{
    
    gbd.abrirBD();
    
    plantilla = "UPDATE centro SET numero=?, nombre=?, provincia=?, ciudad=?, cp=?, calle=?, telefono=?";
    ps.getConnection().prepareStatement(plantilla);
    ps.setInt(1,cn.getNumero());
        ps.setString(2,cn.getNombre());
        ps.setString(3,cn.getProvincia());
        ps.setString(4,cn.getCiudad());
        ps.setString(5,cn.getCp());
        ps.setString(6,cn.getCalle());
        ps.setString(7,cn.getTelefono());
        int n = ps.executeUpdate();
        gbd.cerrarBD();
        if (n == 0)
            throw new Exception();
}
public Centro consultarCentroNum(int numero)throws Exception{
    
   GenericoBD.abrirBD();

}

