public class Main {
    public static void main(String[] args) {
        Parametrizacao parametrizacao = new Parametrizacao();

        System.out.println(parametrizacao.verifica("{[(-)]}"));
        System.out.println(parametrizacao.verifica("(())-(()())–()()"));
        System.out.println(parametrizacao.verifica("{[(-]})"));
        System.out.println(parametrizacao.verifica(")(–(()(–))(("));


    }
}
