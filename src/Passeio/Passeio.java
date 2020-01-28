package Passeio;

import Pessoa.Guia;

import java.util.List;

public class Passeio {
    private List guias;
    private String tipo;
    private String destino;

    public Passeio(List guias, String tipo, String destino) {
        this.guias = guias;
        this.tipo = tipo;
        this.destino = destino;
    }

    public List getGuias() {
        return guias;
    }

    public String getDestino() {
        return destino;
    }

    public String getTipo() {
        return tipo;
    }
}
