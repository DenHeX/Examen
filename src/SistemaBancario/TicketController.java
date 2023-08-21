/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @author Student
 */
public class TicketController {
    private TicketList list;
    
    public TicketController() {
        list = TicketList.getInstance();
    }
    
    public void generar(int numero, TipoTicket tipo) {
        Ticket ticket = new Ticket(numero, tipo);
        list.agregar(ticket);
    }

}
