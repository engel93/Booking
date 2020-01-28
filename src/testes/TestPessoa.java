package testes;

import Pessoa.Pessoa;
import Pessoa.Viajante;
import org.junit.Assert;
import org.junit.Test;

public class TestPessoa {

    @Test
    public void dadoInformacoesCorretasQuandoInserirPessoaEntaoRetornaMensagemOK(){

        Pessoa pessoa = new Pessoa("João", "06/12/1990", "123456789");

        Assert.assertNotNull(pessoa);

        System.out.println("ok");
    }


    @Test
    public void dadoNomeNuloQuandoInserirPessoaEntaoRetornaMensagemDeErro(){

        Pessoa pessoa = new Pessoa(null, "06/12/1990", "123456789");

        Assert.assertNull(pessoa.getNome());

        System.out.println("Falta Nome");
    }

    @Test
    public void dadoInformacoesNulasQuandoInserirPessoaEntaoRetornaMensagemOK(){
       Pessoa pessoa = new Pessoa("Vitoria", null, "123456789");

        Assert.assertNull(pessoa.getDataNascimento());

        System.out.println("Falta Data Nascimento");
    }
}
