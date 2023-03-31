package factorymethod;

public class ServicoOficinaAutomotiva implements IServico {
    public String criar() {
        return "Oficina Automotiva criada";
    }

    public String cancelar() {
        return "Oficina Automotiva cancelada";
    }
}
