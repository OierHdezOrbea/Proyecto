
package UML;

public class Trabajador {
    
    private int dni;
    private String nombre;
    private String apellidos;
    private String calle;
    private String portal;
    private String piso;
    private String TelPer;
    private String TelEmp;
    private int salario;
    private String fechaNac;
    private boolean categoria;
    
    

    public Trabajador() {
    }

    public Trabajador(int dni, String nombre, String apellidos, String calle, String portal, String piso, String TelPer, String TelEmp, int salario, String fechaNac, boolean categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calle = calle;
        this.portal = portal;
        this.piso = piso;
        this.TelPer = TelPer;
        this.TelEmp = TelEmp;
        this.salario = salario;
        this.fechaNac = fechaNac;
        this.categoria = categoria;
        
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getTelPer() {
        return TelPer;
    }

    public void setTelPer(String TelPer) {
        this.TelPer = TelPer;
    }

    public String getTelEmp() {
        return TelEmp;
    }

    public void setTelEmp(String TelEmp) {
        this.TelEmp = TelEmp;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isCategoria() {
        return categoria;
    }

    public void setCategoria(boolean categoria) {
        this.categoria = categoria;
    }

}
