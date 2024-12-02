package models.genericos;

public class Par<K,V> {
    private K clave;
    private V valor;

    public void guardarClave(K clave){
        this.clave = clave;
    }

    public K obtenerClave(){
        return clave;
    } 

    public void guardarValor(V valor){
        this.valor = valor;
    }

    public V obtenerValor(){
        return valor;
    } 
    
}
