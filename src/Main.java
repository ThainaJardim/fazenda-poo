import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Pato p = new Pato();
        Galinha g = new Galinha();
        Morcego m = new Morcego();
        Vaca v = new Vaca();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos tem a vaca?");
        v.setIdade ( scanner.nextInt());
        System.out.println("Quantos cm tem a vaca");
        v.setTamanho ( scanner.nextFloat());
        System.out.println("Qual a cor do pelo da vaca?");
        v.setCorPelo(scanner.next());
        v.emitirSom();
        v.amamenta();


        System.out.println("Quanto meses tem o morcego?");
        m.setIdade ( scanner.nextInt());
        System.out.println("Quantos cm tem o morcego?");
        m.setTamanho ( scanner.nextFloat());
        System.out.println("Qual a cor do pelo do morcego?");
        m.setCorPelo(scanner.next());
        m.locomover();
        m.emitirSom();
        m.amamenta();

        System.out.println("Quantos meses tem o pato?");
        p.setIdade ( scanner.nextInt());
        System.out.println("Quantos cm tem o pato?");
        p.setTamanho ( scanner.nextFloat());
        System.out.println("Qual a cor da pena do pato?");
        p.setCorPena (scanner.next());
        p.locomover();
        p.emitirSom();
        p.botarOvos();

        System.out.println("Quantos meses tem a galinha?");
        g.setIdade ( scanner.nextInt());
        System.out.println("Quantos cm tem a galinha?");
        g.setTamanho ( scanner.nextFloat());
        System.out.println("Qual a cor da pena da galinha?");
        g.setCorPena (scanner.next());
        g.emitirSom();
        g.botarOvos();


        System.out.printf("Vaca:\t Idade: %d\t tamanho: %2.2f\t Cor do pelo: %s \t Emite o som: %s \t %s", v.getIdade(), v.getTamanho(), v.getCorPelo(), v.emitirSom(), v.amamenta());

    }

}
