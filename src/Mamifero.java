
public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Andar");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");

    }

    @Override
    public void reproduzir() {
        System.out.println("amamentam");

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
