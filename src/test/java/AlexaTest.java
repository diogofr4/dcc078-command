import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlexaTest {

    Alexa alexa;
    Lampada lampada;

    @BeforeEach
    void setUp(){
        alexa = new Alexa();
        lampada = new Lampada("branca", 2);
    }

    @Test
    void deveAcenderLampada() {
        Tarefa acenderLampada = new AcenderLampadaTarefa(lampada);
        alexa.executarTarefa(acenderLampada);

        assertEquals("Lâmpada acesa", lampada.getEstado());
    }

    @Test
    void deveApagarLampada() {
        Tarefa apagarLampada = new ApagarLampadaTarefa(lampada);
        alexa.executarTarefa(apagarLampada);

        assertEquals("Lâmpada apagada", lampada.getEstado());
    }

    @Test
    void deveCancelarApagarLuz() {
        Tarefa acenderLampada = new AcenderLampadaTarefa(lampada);
        Tarefa apagarLampada = new ApagarLampadaTarefa(lampada);

        alexa.executarTarefa(acenderLampada);
        alexa.executarTarefa(apagarLampada);

        alexa.cancelarUltimaTarefa();

        assertEquals("Lâmpada acesa", lampada.getEstado());
    }
}
