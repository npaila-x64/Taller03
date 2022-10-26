import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorDeDatosTest {

    private Logger logger;

    @BeforeEach
    void init() {
        logger = Logger.getLogger("AccesoADatosTest.class");
    }

    @BeforeAll
    static void limpiarLog() {
        try {
            new File("src/test/resources/testinglogs.log").delete();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void pedirValorEnteroEnIntervaloTest() {
        var exception = assertThrows(InputMismatchException.class,
                () -> ValidadorDeDatos.pedirValorEnteroEnIntervalo(-1));
        logger.info("Se ha lanzado la excepción InputMismatchException, dado " +
                "dado que el parámetro dado sobrepasa el límite. " + exception.getMessage());
    }
}