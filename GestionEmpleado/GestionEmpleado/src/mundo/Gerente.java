package mundo;

// Aplicación del Principio de Sustitución de Liskov (LSP):
// Gerente hereda de Empleado y puede ser tratado como tal.
public class Gerente extends Empleado implements Contribuyente {
    private String areaEncargada;

    public Gerente(String nombre, String codigo, Departamento departamento, String areaEncargada) {
        super(nombre, codigo, departamento);
        this.areaEncargada = areaEncargada;
    }
    
    public void gestionProyecto() {}
    public void gestionEquipos() {}
    
    @Override
    public void contribuir() {}
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Gerente: " + getNombre() + ", Código: " + getCodigo());
    }
}