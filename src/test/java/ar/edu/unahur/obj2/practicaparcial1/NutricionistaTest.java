package ar.edu.unahur.obj2.practicaparcial1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.Criterio;
import ar.edu.unahur.obj2.practicaparcial1.nutricionista.Nutricionista;
import ar.edu.unahur.obj2.practicaparcial1.recetas.*;


public class NutricionistaTest {
    @Test
    void test() {

        List<Receta> disponibles = new ArrayList<>();

        Receta recetaNueva = new RecetaBase(3, "fito", "papas", 54);

        disponibles.add(recetaNueva);

        Nutricionista nutri = new Nutricionista(disponibles, "pepe");

        Criterio criterio = new ComeTutti();
    
        Cliente cli = new Cliente(4332, criterio);

        nutri.visitarAUnCliente(cli);

        assertEquals("papas", cli.getRecetasRecibidas().get(0).nombre());
        
    }
}
