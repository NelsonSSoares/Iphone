package navegador;

public class NavegadorInternetImpl implements NavegadorInternet{
    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo Url: "+url);
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando navegador..");
    }

    @Override
    public void navegarHistórico() {
        System.out.println("Acessando Historico..");
    }
}
