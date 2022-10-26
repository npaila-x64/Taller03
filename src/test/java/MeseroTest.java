import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeseroTest {

    private Mesero mesero;

    @Test
    void atenderPedidoTest() {
        mesero = new Mesero();
        Pedido pedido = new Pedido();
        pedido.setId(5);
        mesero.atenderPedido(pedido);
        assertEquals(5, (int) mesero.getPedidos().get(0).getId());
    }
}