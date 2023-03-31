package factorymethod;

public class ServicoEntregas implements IServico {

    public String criar() {
        return "Entregas criadas";
    }

    @Override
    public String cancelar() {
        return "Entregas canceladas";
    }
}
