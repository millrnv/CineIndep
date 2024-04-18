package model;

public class Entrada {

    private String id;
    private TipoEntrada tipoEntrada;
    private SalaCine salaCine;

    //Constructor
    public Entrada(String id, TipoEntrada tipoEntrada, SalaCine salaCine) {
        this.id = id;
        this.tipoEntrada = tipoEntrada;
        this.salaCine = salaCine;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public SalaCine getSalaCine() {
        return salaCine;
    }

    public void setSalaCine(SalaCine salaCine) {
        this.salaCine = salaCine;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
