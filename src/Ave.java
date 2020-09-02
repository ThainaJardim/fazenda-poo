
public class Ave extends Animal {
    private String CorPena;

    @Override
    public void locomover() {
        System.out.println("Voar");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de aves");
    }
    @Override
    public void reproduzir() {
        System.out.println("Bota ovo");
    }

    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
}