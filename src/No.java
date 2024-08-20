public class No {
    char valor;
    No anterior;
    No proximo;

    public No(char valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}