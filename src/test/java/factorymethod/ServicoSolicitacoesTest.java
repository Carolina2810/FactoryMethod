package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoSolicitacoesTest {

    @Test
    void deveCriarSolicitacoes() {
        IServico servico = ServicoFactory.obterServico("Solicitacoes");
        assertEquals("Solicitações criadas", servico.criar());
    }

    @Test
    void deveDeletarSolicitacoes() {
        IServico servico = ServicoFactory.obterServico("Solicitacoes");
        assertEquals("Solicitações canceladas", servico.cancelar());
    }
}
