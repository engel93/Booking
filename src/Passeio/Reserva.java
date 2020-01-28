package Passeio;

import Pessoa.Viajante;

public class Reserva {
    private String dataReserva;
    private Passeio passeio;
    private Viajante viajante;
    private String modalidade;

    public Reserva(String dataReserva, Passeio passeio, Viajante viajante, String modalidade) {
        this.dataReserva = dataReserva;
        this.passeio = passeio;
        this.viajante = viajante;
        this.modalidade = modalidade;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public Passeio getPasseio() {
        return passeio;
    }

    public Viajante getViajante() {
        return viajante;
    }

    public String getModalidade() {
        return modalidade;
    }
}
