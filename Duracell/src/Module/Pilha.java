package Module;
import java.util.Vector;

public class Pilha {
    private final Vector<Integer> lista;

    public Pilha(int tamanho) {
        super();
        this.lista = new Vector<>(tamanho);
    }

    public void setItem(int valor) {
        if(lista.capacity() < lista.size()){
            System.out.print("Tá cheio");
        }
        lista.add(valor);
    }

    public int getSize() {
        return lista.size();
    }

    public void popItem(){
        lista.remove(lista.lastElement());
    }
}
