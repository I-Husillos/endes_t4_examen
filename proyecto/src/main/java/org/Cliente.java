package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Cliente que representa a un cliente con su nombre, apellidos, id y sus cuentas de bancarias<br/>
 *  * @author Ivan Husillos
 *  * @version 1.0 12-03-2024
 */
public class Cliente {

    /**
     * Atributo de tipo String que representa el nombre del cliente
     */
    private String nombre;

    /**
     * Atributo de tipo String que representa el apellido del cliente
     */
    private String apellido;

    /**
     * Atributo de tipo String que representa el id del cliente
     */
    private String id;

    /**
     * Atributo de tipo ArrayList que representa las cuentas del cliente
     */
    private List<CuentaBancaria> cuentas;

    /**
     * Constructor Cliente para obtener los datos nombre, apellido e id del cliente<br/>
     * @param nombre que representa al nombre del cliente
     * @param apellido que representa al apellido del cliente
     * @param id que representa al id del cliente
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Metodo para retornar el nombre del cliente que llega mediante el constructor Cliente<br/>
     * @return que retorna el nombre del Cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setNombre para actualizar el nombre del cliente<br/>
     * @param nombre que será el nombre del cliente actualizado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getApellido para retornar el apellido del cliente que llega mediante el constructor Cliente<br/>
     * @return que retorna el apellido del Cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo setApellido para actualizar el apellido del cliente<br/>
     * @param apellido que será el apellido del cliente actualizado
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo getId para retornar el apellido del cliente que llega mediante el constructor Cliente<br/>
     * @return que retorna el id del Cliente
     */
    public String getId() {
        return id;
    }

    /**
     * Metodo setId para actualizar el id del cliente<br/>
     * @param id que será el id del cliente actualizado
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Metodo getCuentas que retorna un arraylist con las cuentas del cliente<br/>
     * @return de la lista que contiene las cuentas del cliente
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Metodo agregarCuenta para agregar una cuenta a la lista cuentas<br/>
     * @param cuenta que añadade un nuevo elemento a la lista cuentas
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * Metodo cerrarCuenta para cerrar la cuenta del cliente<br/>
     * @param numeroCuenta que represente el numero que identifica la cuenta
     * @return que retorna el resultado de la operacion al cerrar la cuenta
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    /**
     * Metodo toString para devolver la informacio  del cliente, incluyendo nombre, apellido, id y las cuentas<br/>
     * @return que retornará la informacion del cliente en un String para imprimirla en pantalla
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}