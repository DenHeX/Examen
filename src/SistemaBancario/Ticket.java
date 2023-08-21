/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @author Student
 */
public class Ticket {
    private int numero;
    private TipoTicket tipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoTicket getTipo() {
        return tipo;
    }

    public void setTipo(TipoTicket tipo) {
        this.tipo = tipo;
    }

    public Ticket(int numero, TipoTicket tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    
    public String abreviar(TipoTicket tipo) {
        switch (tipo) {
            case PLATAFORMA -> {
                return "P";
            }
            case CAJAS -> {
                return "C";
            }
            case PREFERENCIAL -> {
                return "A";
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return numero + abreviar(tipo);
    }
    
}
