public class Morcego extends Mamifero implements Caseiro{

    public String locomover() {
        return "voa baixo";

    }

    @Override
    public String emitirSom(){
        return "farfalho";
    }

    public String  amamenta() {
        return "amamenta";

    }

}
