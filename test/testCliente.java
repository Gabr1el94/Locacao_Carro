/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cliente.Cliente;
import cliente.InterfaceCliente;
import cliente.NegocioCliente;
import fachada.Fachada;
import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author gabrieldev
 */
public class testCliente extends TestCase {

    private Fachada fcliente;

    public testCliente() {
    }

    @Before
    public void setUp() {
        fcliente = new Fachada();
    }

    /*
    @Test
    public void testInsert() throws Exception{
        Cliente c = new Cliente();
        c.setCli_nome("Gabriel");
        c.setCli_email("biel@biel.com");
        c.setCli_num_doc("111.111.111-11");
        c.setCli_tipo("PF");
        c.setCli_cidade("São Lourenço");
        c.setCli_estado("PE");
        c.setCli_sexo("M");
        c.setCli_rua("Machado de Assis");
        c.setCli_telefone("(11)1111-1111");
        c.setCli_dt_nascimento("11/11/1111");
        c.setCli_cep("54.705-281");
        c.setCli_numero("11");
        c.setCli_bairro("Capibaribe");
        fcliente.cadastrar(c);
    }*/
    @Test
    public void testSearch() throws Exception {
        Cliente c = new Cliente();
        c.setCli_num_doc("111.111.111-11");
        ArrayList<Cliente> resposta = fcliente.listar(c);
        if (resposta.size() > 0) {
            for (Cliente al : resposta) {
                System.out.println("" + al.getCli_num_doc());
            }
        }

    }
}
