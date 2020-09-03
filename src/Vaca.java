
public class Vaca extends Mamifero { 
    @Override
    public void emitirSom() {
        System.out.println("Muu");
    }

    @Override
    public void locomover() {
        System.out.println("pastando");
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
