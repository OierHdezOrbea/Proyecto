
package UML;


public class Centro {
    
    private int numero;
    private String nombre;
    private String provincia;
    private String ciudad;
    private String cp;
    private String calle;
    private String telefono;
    

    public Centro() {
    }

    public Centro(int numero, String nombre, String provincia, String ciudad, String cp, String calle, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.cp = cp;
        this.calle = calle;
        this.telefono = telefono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}

