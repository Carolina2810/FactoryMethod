package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoEntregasTest {

    @Test
    void deveCriarEntregas() {
        IServico servico = ServicoFactory.obterServico("Entregas");
        assertEquals("Entregas criadas", servico.criar());
    }

    @Test
    void deveCancelarEntregas() {
        IServico servico = ServicoFactory.obterServico("Entregas");
        assertEquals("Entregas canceladas", servico.cancelar());
    }
}
