package tama;

import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {
    // Subject Under Tests (Tamagotchi)

    // Quiero crear un Tamagotchi (OK)
    @Test
    public void testCrearTamagotchi(){
        // Primero dejo los objetos a probar listos/creados
        // Segundo, ejecuto el método a probar
        Tamagotchi tama = new Tamagotchi();
        // Compruebo mediante Asserts que se realizó correctamente la acción
        Assert.assertNotNull(tama);
    }

    // Quiero conocer el nivel de un Tamagotchi
    @Test
    public void testParaConocerElNivelInicialDeUnTamagotchi(){
        // Primero dejo los objetos a probar listos/creados
        Tamagotchi tama = new Tamagotchi();
        Integer nivelEsperado = 0;
        // Segundo, ejecuto el método a probar
        Integer nivelObtenido = tama.getNivel();
        // Compruebo mediante Asserts que se realizó correctamente la acción
        Assert.assertEquals(nivelEsperado,nivelObtenido);
    }

    @Test
    public void testParaCrearDosTamagotchiConDiferenteNivel(){
        // Primero dejo los objetos a probar listos/creados
        Tamagotchi tama = new Tamagotchi(0);
        Integer nivelEsperado = 0;

        Tamagotchi tama2 = new Tamagotchi(1);
        Integer nivelEsperado2 = 1;

        // Segundo, ejecuto el método a probar
        Integer nivelObtenido = tama.getNivel();
        Integer nivelObtenido2 = tama2.getNivel();

        // Compruebo mediante Asserts que se realizó correctamente la acción
        Assert.assertEquals(nivelEsperado,nivelObtenido);
        Assert.assertEquals(nivelEsperado2,nivelObtenido2);
    }
}
