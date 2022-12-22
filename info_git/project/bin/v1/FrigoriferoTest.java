public class FrigoriferoTest {
    public void testAccendi() {
        Frigorifero frigo = new Frigorifero("Marca", "Modello", 200, 100, 500, 0.5, 5, -20);
        frigo.accendi();
        assertTrue(frigo.isAcceso(), "Errore: il frigorifero non è stato acceso correttamente.");
    }

    public void testSpegni() {
        Frigorifero frigo = new Frigorifero("Marca", "Modello", 200, 100, 500, 0.5, 5, -20);
        frigo.spegni();
        assertFalse(frigo.isAcceso(), "Errore: il frigorifero non è stato spento correttamente.");
    }

    public void testAumentaTemperaturaFrigo() {
        Frigorifero frigo = new Frigorifero("Marca", "Modello", 200, 100, 500, 0.5, 5, -20);
        frigo.aumentaTemperaturaFrigo(2);
        assertEquals(7, frigo.getTemperaturaFrigo(), "Errore: la temperatura del frigorifero non è stata aumentata correttamente.");
    }

    public void testDiminuisciTemperaturaFrigo() {
        Frigorifero frigo = new Frigorifero("Marca", "Modello", 200, 100, 500, 0.5, 5, -20);
        frigo.diminuisciTemperaturaFrigo(2);
        assertEquals(3, frigo.getTemperaturaFrigo(), "Errore: la temperatura del frigorifero non è stata diminuita correttamente.");
    }

    public void testAumentaTemperaturaFrizer() {
        Frigorifero frigo = new Frigorifero("Marca", "Modello", 200, 100, 500, 0.5, 5, -20);
        frigo.aumentaTemperaturaFrizer(2);
        assertEquals(-18, frigo.getTemperaturaFrizer(), "Errore: la temperatura del freezer non è stata aumentata correttamente.");
    }

    public void testDiminuisciTemperaturaFrizer() {
        Frigorifero frigo = new Frigorifero("Marca", "Modello", 200, 100, 500, 0.5, 5, -20);
        frigo.diminuisciTemperaturaFrizer(2);
        assertEquals(-22, frigo.getTemperaturaFrizer(), "Errore: la temperatura del freezer non è stata diminuita correttamente.");
    }
}
