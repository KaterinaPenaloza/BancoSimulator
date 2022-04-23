package modelo;

public class Cuenta {
    //Atributos
    private char tipoCuenta;
    private int saldo;
    //Constructores
    public Cuenta() {
    }
    
    public Cuenta(char tipoCuenta, int saldo) {
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    //Mutadores y accesadores
    public char getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(char tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
