public class PilhaDinamica {
    No topo;

    public PilhaDinamica(){
        this.topo = null;
    }

    public void empilhar(char valor){
        No novoNo = new No(valor);
        if (this.topo != null){
            novoNo.anterior = this.topo;
            this.topo.proximo = novoNo;
        }
        this.topo = novoNo;
    }

    public char desempilhar(){
        if(this.topo == null){
            System.out.println("A pilha está vazia");
            return '\0';
        }
        char valor = this.topo.valor;
        this.topo = this.topo.anterior;
        if (this.topo != null) {
            this.topo.proximo = null;
        }
        return valor;
    }

    public char consultarTopo(){
        if (this.topo == null){
            System.out.println("A pilha está vazia");
            return '\0';
        }
        return this.topo.valor;
    }

    public boolean estaVazia(){
        return this.topo == null;
    }
}