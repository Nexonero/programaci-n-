package mundo;
import java.util.LinkedList;

// Aplicación del Principio de Inversión de Dependencias (DIP):
// Se usa la abstracción Empleado en lugar de una implementación específica.
public class Proyecto {
    private String nombre, codigo;
    private LinkedList<Empleado> empleadosAsignados;

    public Proyecto(String nombre, String codigo, LinkedList<Empleado> empleadosAsignados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = empleadosAsignados;
    }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    
    public LinkedList<Empleado> getEmpleadosAsignados() { return empleadosAsignados; }
    public void setEmpleadosAsignados(LinkedList<Empleado> empleadosAsignados) { this.empleadosAsignados = empleadosAsignados; }
    
    public void agregarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
    }
}
