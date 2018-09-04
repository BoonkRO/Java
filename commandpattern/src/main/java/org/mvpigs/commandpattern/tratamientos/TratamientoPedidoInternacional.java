package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {


    public TratamientoPedidoInternacional(PedidoInternacional pedidoInt) {


    }

    @Override
    public boolean tratar() {
        return false;
    }
}
