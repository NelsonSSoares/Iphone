import ligar.AparelhoTelefonicoImpl;
import musica.ReprodutorMusicalImpl;
import navegador.NavegadorInternetImpl;

public class Iphone {
    public static void main(String[] args) {
        Iphone myPhone = new Iphone();

    }

    public void ligarTelefone(){
        System.out.println("Ligando Telefone..");
    }
    public void usarReprodutorMusical(){
        ReprodutorMusicalImpl reprodutor = new ReprodutorMusicalImpl();

        reprodutor.reproduzir();
        reprodutor.pausar();
        reprodutor.pausar();
        reprodutor.retroceder();
    }

    public void navegarInternet(){
        NavegadorInternetImpl navegador = new NavegadorInternetImpl();
        navegador.abrirURL("www.google.com");
        navegador.navegarHistórico();
        navegador.fecharNavegador();

    }

    public void telefone(){
        AparelhoTelefonicoImpl telefone = new AparelhoTelefonicoImpl();
        telefone.ligar("4002-8922");
        telefone.atender();
        telefone.encerrarChamada();
    }
}
