public class Aresta {
    private Vertice a, b;
    public Aresta(Vertice Va, Vertice Vb){
        this.a = Va;
        this.b = Vb;
    }

    public Vertice getOutroVertice(){
        return b;
    }

}
