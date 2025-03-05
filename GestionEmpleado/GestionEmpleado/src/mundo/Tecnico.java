package mundo;

public class Tecnico extends Empleado implements Contribuyente {
    private String areaEspecifica;

    public Tecnico(String nombre, String codigo, Departamento departamento, String areaEspecifica) {
        super(nombre, codigo, departamento);
        this.areaEspecifica = areaEspecifica;
    }

    public String getAreaEspecifica() { return areaEspecifica; }
    public void setAreaEspecifica(String areaEspecifica) { this.areaEspecifica = areaEspecifica; }
    
    @Override
    public void contribuir() {}
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Técnico: " + getNombre() + ", Código: " + getCodigo());
    }
}