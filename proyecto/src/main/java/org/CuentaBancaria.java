package org.example;

/**
 * Clase CuentaBancaria que representa la cuenta bancaria de un cliente, que incluye el numero de la cuenta, el saldo de la cuenta
 * y el propietario de esta<br/>
 * @author Ivan Husillos
 * @version 1.0 12-03-2024
 */
public class CuentaBancaria {
    /**
     * Atributo de tipo String que representa el numero de la cuenta
     */
    private String numeroCuenta;

    /**
     * Atributo de tipo double que representa el saldo que hay en la cuenta
     */
    private double saldo;

    /**
     * Atributo de tipo Cliente que representa el propietario de la cuenta
     */
    private Cliente propietario;

    /**
     * Constructor CuentaBancaria que obtiene los datos numeroCuenta, saldo y propieatario de la cuenta bancaria<br/>
     * @param numeroCuenta que representa el numero de identificacion de la cuenta
     * @param saldo que representa el saldo que hay en la cuenta
     * @param propietario que representa el propietario de dicha cuenta
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    /**
     * Metodo getNumeroCuenta para obtener el numero de identificación de la cuenta<br/>
     * @return que retorna el numero de la cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Metodo setNumeroCuenta para actualizar el numero de la cuanta<br/>
     * @param numeroCuenta que será el numero que identifique la cuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Metodo getSaldo para obtener el saldo que existe en la cuenta<br/>
     * @return que retorna el saldo existente en la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo setSaldo para actualizar el saldo de la cuenta<br/>
     * @param saldo que será el saldo que habrá en la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo getPropietario para obtener el nombre del propietario de la cuenta<br/>
     * @return que retorna el nombre del propietario
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * Metodo setPropietario para actualizar el nombre del propietario de la cuenta<br/>
     * @param propietario que será el propietario de la cuenta
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Metodo depositar para agregar una cantidad de saldo en la cuenta<br/>
     * @param cantidad que es la cantidad que se agregará
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Metodo retirar para retirar una cantidad de saldo en la cuenta, en caso de que la cantidad a extraer sea menor o igual,
     * en caso contrario se cancelará la operación<br/>
     * @param cantidad la cantidad del saldo que se va a retirar
     * @return para retornar la cantidad
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * Metodo toString para devolver la informacio  de la cuenta, incluyendo el numero, saldo y propietario<br/>
     * @return que retornará la informacion de la cuenta en un String para imprimirla en pantalla
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}