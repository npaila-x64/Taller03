
public class MenuPrincipal {

    public void iniciar() {
        mostrarMenuDeIngreso();
    }

    private void mostrarOpcionesDeIngreso() {
        System.out.print(("\n" +
                "¡Bienvenido!\n" +
                "[1] Mostrar datos del objeto\n" +
                "[2] Editar datos del objeto\n" +
                "Si desea salir escriba [0]\n").concat("> "));
    }

    private void mostrarMenuDeIngreso() {
        while (true) {
            mostrarOpcionesDeIngreso();
            switch (ValidadorDeDatos.pedirOpcionHasta(2)) {
                case 0 -> {return;}
                case 1 -> mostrarDatosDeObjeto();
            }
        }
    }

    private void mostrarDatosDeObjeto() {

    }


}
