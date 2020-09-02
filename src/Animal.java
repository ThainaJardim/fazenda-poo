
public abstract class Animal {
    //atributos de animal
    protected int idade;;
    protected float tamanho;
    //métodos de animal
    public abstract void locomover ();
    public abstract void emitirSom();
    public abstract void reproduzir();

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
