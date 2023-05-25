import java.util.ArrayList;

public class Vertice {
    private ArrayList<Aresta> arestas;
    private boolean visitado = false;
    private String id;

    public Vertice(String nome){
        this.id = nome;
    }

public String getId(){
    return this.id;
}

    public boolean equals(Vertice v){
        if(id.compareTo(v.getId()) = 0) return true;
        return false;
    }

    public void addAresta(Vertice vertice){
        this.arestas.add(new Aresta(this, vertice));
        vertice.addAresta(this);
    }

    public boolean isVizinho(Vertice vertice){
        for (Aresta a : arestas) {
            if (vertice.equals(a.getOutroVertice())   ) {
                return true;
            }
        }
        return false;
    }
}
