import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            for (StackTraceElement stackTraceElement : e.getStackTrace())
                System.err.println(stackTraceElement);
        }
    }
    public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int limite = parametroDois - parametroUm;
        if (limite <= 0)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        for (int i = 1; i <= limite; i++)
            System.out.println("Imprimindo o número " + i);

    }
}
