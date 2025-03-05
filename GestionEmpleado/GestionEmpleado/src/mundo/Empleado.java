package mundo;

// Clase base para aplicar el Principio de Abierto/Cerrado (OCP).
public abstract class Empleado {
    private String nombre, codigo;
    private Departamento departamento;

    public Empleado(String nombre, String codigo, Departamento departamento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.departamento = departamento;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public Departamento getDepartamento() { return departamento; }
    public void setDepartamento(Departamento departamento) { this.departamento = departamento; }
    
    public abstract void mostrarInformacion(); // Permite extender sin modificar
}