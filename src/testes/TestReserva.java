package testes;

import Passeio.Passeio;
import Passeio.Reserva;
import Pessoa.Guia;
import Pessoa.Viajante;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestReserva {

    @Test
    public void testaSeReservaCorretamente(){
        List<Guia> guias = new ArrayList<Guia>();
        Guia guia = new Guia("Paulina Azurenha", "10-10-2010", "12345678911", "1", "Paris", "11-01-2020", "Grupo","Raft",100.0 );
        guias.add(guia);
        Passeio passeio = new Passeio(guias, "Grupo","Paris");
        Viajante viajante = new Viajante("Paulina Azurenha", "10-10-2010", "12345678911", "1", "Paris","12-10-2020 até 19-10-2020");
        Reserva reserva = new Reserva("19-01-2020",passeio,viajante,"Raft");
    }
}
