package ar.edu.unahur.obj2.practicaparcial1.clientes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.Criterio;
import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.Premium;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.RecetaBase;

public class ClienteTest {

    @Test
    @DisplayName("Que se guarde correctamente el criterio del cliente")
    void test() {
        Criterio criterio = new ComeTutti();

        Cliente c = new Cliente(1234, criterio);

        assertEquals(criterio, c.getCriterio());

    }

    @Test
    void nuevoTest(){

        List<String> autoresPreferidos = new ArrayList<>();

        autoresPreferidos.add("federico alfonso");
        autoresPreferidos.add("alcatraz");


        Criterio criterio = new Premium(autoresPreferidos);

        Cliente clien = new Cliente(2342, criterio);

        Receta recetaNueva = new RecetaBase(20, "alcatraz", "caca", 32);

        assertTrue(clien.leGustaEstaReceta(recetaNueva));
    }
}
