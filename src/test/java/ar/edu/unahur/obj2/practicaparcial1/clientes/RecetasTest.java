package ar.edu.unahur.obj2.practicaparcial1.clientes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.recetas.*;
import ar.edu.unahur.obj2.practicaparcial1.recetas.ingredientes.*;


public class RecetasTest {
    @Test
    @DisplayName("creamos una receta nueva, decorada con CHIA y le pedimo su valor nutriconal y comparamos(debe dar 1290)")
    void nuevaRecetaTest(){
        Receta nuevaReceta = new RecetaBase(2,"pepito","caracoles",800);

        nuevaReceta = new Chia(nuevaReceta);

        assertEquals(1290, nuevaReceta.valorNutricional());
    }

    @Test
    @DisplayName("nueva receta, decorada con Frutos Secos, le preguntamos si es tradi")
    void nuevaRecetaFrutosTest(){
        Receta nuevaReceta = new RecetaBase(80,"yo","concha", 30);

        nuevaReceta = new FrutosSecos(nuevaReceta);
        
        assertTrue(nuevaReceta.esTradicional());
    }

}
