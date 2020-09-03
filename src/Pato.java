public class Pato extends Ave implements Caseiro{
    @Override
    public String emitirSom(){
        return "Quac, quac";
    }

    @Override
    public String botarOvos() {
       return "bota ovos";
    }

    public String locomover() {
        return "voa alto";

    }



}
