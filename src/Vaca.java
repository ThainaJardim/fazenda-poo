
public class Vaca extends Mamifero {
    @Override
    public String emitirSom(){
        return "Muu";
    }

    public String  amamenta() {
        return "amamenta";

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
