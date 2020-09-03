import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Pato p = new Pato();
        Galinha g = new Galinha();
        Morcego m = new Morcego();
        Vaca v = new Vaca();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade da vaca:");
        v.setIdade ( scanner.nextInt());

        System.out.println("Informe o tamanho da vaca:");
        v.setTamanho ( scanner.nextFloat());
        v.emitirSom();

        System.out.println("Informe a idade do morcego:");
        m.setIdade ( scanner.nextInt());

        System.out.println("Informe o tamanho do morcego:");
        m.setTamanho ( scanner.nextFloat());
        m.locomover();
        m.emitirSom();

        System.out.println("Informe a idade do pato:");
        p.setIdade ( scanner.nextInt());
        System.out.println("Informe o tamanho do pato:");
        p.setTamanho ( scanner.nextFloat());
        p.locomover();
        p.emitirSom();

        System.out.println("Informe a idade da galinha:");
        g.setIdade ( scanner.nextInt());
        System.out.println("Informe o tamanho da galinha:");
        g.setTamanho ( scanner.nextFloat());
        g.emitirSom();

    }
}
