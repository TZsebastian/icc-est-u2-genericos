package models.genericos;

public class Par<K, V> {
    private K clave;
    private V valor;

    public Par() {}

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public void guardarClave(K clave) {
        this.clave = clave;
    }

    public K obtenerClave() {
        return clave;
    }

    public void guardarValor(V valor) {
        this.valor = valor;
    }

    public V obtenerValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Par [clave=" + clave + ", valor=" + valor + "]";
    }
}
