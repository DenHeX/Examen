/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

import java.util.Queue;

/**
 *
 * @author Student
 */
public class TicketList {
    private static TicketList listaTickets;
    Queue<Ticket> tickets;
    
    public static TicketList getInstance() {
        if (listaTickets == null) {
            listaTickets = new TicketList();
        }
        return listaTickets;
    }
        
    public void agregar(Ticket ticket){
        tickets.add(ticket);
    }
    
    public void eliminar(Ticket ticket){
        tickets.remove(ticket);
    }
    
    public void eliminar(){
        
    }
    
    public Ticket buscar(Ticket ticket){
        
        return ticket;
    }
    

}
