public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, mundo!!");

        String nomeUm = "dryego";
        String nomeDois = new String("dryego");

        double salario = 4000;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = numeroCurto;
        final String TEXTO_NUMERO = "Um";

        System.out.println(salario);
        System.out.println(numeroNormal);
        System.out.println(numeroCurto2);
        System.out.println(TEXTO_NUMERO);

        System.out.println(nomeUm.equals(nomeDois));
    }
}
