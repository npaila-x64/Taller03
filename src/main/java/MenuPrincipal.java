import java.util.ArrayList;
import java.util.List;

public class MenuPrincipal {

    private final Mesero mesero;
    private final List<Pedido> pedidos;

    public MenuPrincipal() {
        this.mesero = new Mesero();
        this.pedidos = new ArrayList<>();
        agregarDatosDePrueba();
    }

    private void agregarDatosDePrueba() {
        // Se agregan datos inciales para probar funcionalidad
        this.mesero.setNombre("Juan");
        Pedido pedido = new Pedido();
        pedido.setId(1);
        pedido.setDescripcion("Desayuno");
        pedido.setMesero(this.mesero);
        this.pedidos.add(pedido);

    }

    public void iniciar() {
        mostrarMenuDeIngreso();
    }

    private void mostrarMenuDeIngreso() {
        while (true) {
            mostrarOpcionesDeIngreso();
            switch (ValidadorDeDatos.pedirOpcionHasta(2)) {
                case 0 -> {return;}
                case 1 -> mostrarDatosDeObjeto();
                case 2 -> mostrarEdicionDeDatosDeObjeto();
            }
        }
    }

    private void mostrarOpcionesDeIngreso() {
        System.out.print(("\n" +
                "¡Bienvenido!\n" +
                "[1] Mostrar datos de objetos\n" +
                "[2] Editar datos de objetos\n" +
                "Si desea salir escriba [0]\n").concat("> "));
    }

    private void mostrarDatosDeObjeto() {
        while (true) {
            mostrarOpcionesDeObjeto();
            switch (ValidadorDeDatos.pedirOpcionHasta(2)) {
                case 0 -> {return;}
                case 1 -> mostrarDatosDePedido();
                case 2 -> mostrarDatosDeMesero();
            }
        }
    }

    private void mostrarOpcionesDeObjeto() {
        System.out.print(("\n" +
                "[1] Mostrar datos del pedido\n" +
                "[2] Mostrar datos del mesero\n" +
                "Si desea volver escriba [0]\n").concat("> "));
    }

    public void mostrarDatosDePedido() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido.toString());;
        }
    }

    public void mostrarDatosDeMesero() {
        System.out.println(mesero.toString());
    }

    private void mostrarEdicionDeDatosDeObjeto() {
        while (true) {
            mostrarOpcionesEdicionesDeObjeto();
            switch (ValidadorDeDatos.pedirOpcionHasta(2)) {
                case 0 -> {return;}
                case 1 -> editarDatosDePedido();
                case 2 -> editarDatosDeMesero();
            }
        }
    }

    private void mostrarOpcionesEdicionesDeObjeto() {
        System.out.print(("\n" +
                "[1] Editar datos del pedido\n" +
                "[2] Editar datos del mesero\n" +
                "Si desea volver escriba [0]\n").concat("> "));
    }

    private void editarDatosDePedido() {
        while (true) {
            mostrarOpcionesEdicionDePedido();
            switch (ValidadorDeDatos.pedirOpcionHasta(2)) {
                case 0 -> {return;}
                case 1 -> mostrarEdicionIdDePedido();
                case 2 -> mostrarEdicionDescripcionDePedido();
            }
        }
    }

    private void mostrarEdicionIdDePedido() {
        Pedido pedido = this.pedidos.get(0);
        System.out.print("ID> ");
        Integer nuevaId = ValidadorDeDatos.pedirOpcionHasta(256);
        pedido.setId(nuevaId);
    }

    private void mostrarEdicionDescripcionDePedido() {
        Pedido pedido = this.pedidos.get(0);
        System.out.print("Descripción> ");
        String nuevaDescripcion = ValidadorDeDatos.pedirEntrada();
        pedido.setDescripcion(nuevaDescripcion);
    }

    private void mostrarOpcionesEdicionDePedido() {
        System.out.print(("\n" +
                "[1] Editar id del pedido\n" +
                "[2] Editar descripción del pedido\n" +
                "Si desea volver escriba [0]\n").concat("> "));
    }

    private void editarDatosDeMesero() {
        System.out.print("Nombre> ");
        String nuevoNombre = ValidadorDeDatos.pedirEntrada();
        mesero.setNombre(nuevoNombre);
    }
}
