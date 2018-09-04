package org.mvpigs.commandpattern.interfaces;

import org.mvpigs.commandpattern.interfaces.Pedido;

/**
 * La interfaz PedidoPeligroso implementa el metodo:
 * 
 * instrucciones
 * @param   void
 * @return  String
 * 
 * Hereda de la interfaz Pedido
 */

public interface PedidoPeligroso extends Pedido {

     String instrucciones();

}
