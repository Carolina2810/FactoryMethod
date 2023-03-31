package factorymethod;

public class ServicoSolicitacoes implements IServico {

        public String criar() {
            return "Solicitações criadas";
        }

    public String cancelar() {
        return "Solicitações canceladas";
        }
}
