package Datos;

/**
 *
 * @author O.o pc
 */
public class DDepartamento {

    private int iddepartemento;
    private String departamento;

    public DDepartamento(int iddepartemento, String departamento) {
        this.iddepartemento = iddepartemento;
        this.departamento = departamento;
    }

    public DDepartamento() {
    }

    public int getIddepartemento() {
        return iddepartemento;
    }

    public void setIddepartemento(int iddepartemento) {
        this.iddepartemento = iddepartemento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
