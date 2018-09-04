package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
    private int peso;
    private String destino;

    public PedidoInternacional(String mordor, int i) {

    }

    @Override
    public int peso() {
        return 0;
    }

    @Override
    public String destino() {
        return null;
    }
}
