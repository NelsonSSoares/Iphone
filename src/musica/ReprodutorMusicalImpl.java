package musica;

 public class ReprodutorMusicalImpl implements ReprodutorMusical{
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo Musica..");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void avancar() {
        System.out.println("Avançando para a proxima musica..");
    }

    @Override
    public void retroceder() {
        System.out.println("Voltando para a musica anterior...");
    }
}
