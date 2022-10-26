import java.util.*;

public class Mesero {

	private String nombre;
	private final List<Pedido> pedidos;

	public Mesero() {
		this.pedidos = new ArrayList<>();
	}

	public void atenderPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre de mesero: " + getNombre();
	}
}