
public class Mamifero extends Animal {
    protected String corPelo;
    public String  amamenta() {
        return "amamenta";

    }


    @Override
    public String emitirSom() {
        return "";
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

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo( String corPelo) {
        this.corPelo = corPelo;
    }
}
