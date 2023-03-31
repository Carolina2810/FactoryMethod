package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoOficinaAutomotivaTest {

    @Test
    void deveCriarOficinaAutomotiva() {
        IServico servico = ServicoFactory.obterServico("Oficina Automotiva");
        assertEquals("Oficina Automotiva criada", servico.criar());
    }

    @Test
    void deveDeletarOficinaAutomotiva() {
        IServico servico = ServicoFactory.obterServico("Oficina Automotiva");
        assertEquals("Oficina Automotiva cancelada", servico.cancelar());
    }
}
