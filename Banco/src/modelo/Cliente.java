package modelo;

public class Cliente {
    //Atributos
    private String rut;
    private Cuenta cuenta;
    //Constructores
    public Cliente() {
    }

    public Cliente(String rut, Cuenta cuenta) {
        this.rut = rut;
        this.cuenta = cuenta;
    }
    //Accesadores y mutadores
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    //ToString
    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", cuenta=" + cuenta + '}';
    }
    
}
