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

    @Test
    public void testQuePruebaQuePuedoModificarElEstadoDeUnTama(){
        Tamagotchi tama = new Tamagotchi();
        String estadoEsperado = "aburrido";
        tama.setEstado("aburrido");
        Assert.assertEquals(estadoEsperado, tama.getEstado());
    }

    @Test
    public void testQuePruebaQueAlComerElTamaHambrientoPasaAEstarContento(){
        Tamagotchi tama = new Tamagotchi();
        // En este caso, el tama de tener estado Hambriento
        tama.setEstado("hambriento");
        tama.comer();
        String estadoEsperado = "contento";
        Assert.assertEquals(estadoEsperado, tama.getEstado());
    }

    @Test
    public void testQuePruebaQueAlComerEltamaContentoSuNivelSeIncrementaEnUno(){
        Tamagotchi tama = new Tamagotchi(); // Su nivel inicial es 0
        tama.setEstado("contento");
        tama.comer();
        Integer nivelEsperado = 1;
        Assert.assertEquals(nivelEsperado, tama.getNivel());
    }

    @Test
    public void testQuePruebaPasarDeAburridoAContentoSiSeAburreMasDe80Mins(){
        Tamagotchi tama = new Tamagotchi();
        // Pasaje a estado aburrido
        tama.setEstado("aburrido");
        String estadoEsperado = "contento";
        tama.comer();
        Assert.assertEquals(estadoEsperado, tama.getEstado());
    }
}
