public class Parametrizacao {
    PilhaDinamica pilha = new PilhaDinamica();

    public boolean verifica(String expressao){
        for (int i = 0; i < expressao.length(); i++) {

            char valor = expressao.charAt(i);

            if ( valor == '(' || valor == '[' || valor == '{'){
                this.pilha.empilhar(valor);

            } else if (valor == ')' || valor == ']' || valor == '}') {

                if (this.pilha.estaVazia()){
                    return false;
                }

                char topo = this.pilha.desempilhar();

                if (valor == ')' && !(topo == '(') ||
                        valor == ']' && !(topo == '[') ||
                        valor == '}' && !(topo == '{')) {
                    return false;
                }
            }

        }
        return pilha.estaVazia();
    }
}
