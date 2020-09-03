
public class Ave extends Animal {
    protected  String corPena;
    public String botarOvos() {
        return "";
    }

    @Override
    public String emitirSom(){
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

    public String getCorPena() {  return corPena ; }

    public void setCorPena( String corPena) {
        this.corPena = corPena;
    }
}