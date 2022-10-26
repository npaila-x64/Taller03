public class Pedido {

	private Integer id;
	private Mesero mesero;
	private String descripcion;

	public Pedido() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Mesero getMesero() {
		return mesero;
	}

	public void setMesero(Mesero mesero) {
		this.mesero = mesero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + "\n" +
				"Descripción: " + getDescripcion() + "\n" +
				"Nombre de mesero: " + getMesero().getNombre();
	}
}