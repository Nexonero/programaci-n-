package mundo;
import java.util.LinkedList;

// Principio de Abierto/Cerrado (OCP):
// Se permite la extensión sin modificar la clase al trabajar con la interfaz Contribuyente.
public class Departamento {
    private String nombre, codigo;
    private LinkedList<Empleado> empleados;
    
    public Departamento(String nombre, String codigo, LinkedList<Empleado> empleados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleados = empleados;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public LinkedList<Empleado> getEmpleados() { return empleados; }
    public void setEmpleados(LinkedList<Empleado> empleados) { this.empleados = empleados; }
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
}