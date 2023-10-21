package ligar;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Iniciando ligação para: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Recendo Chamada..");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada");
    }
}
