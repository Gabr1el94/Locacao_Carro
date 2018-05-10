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

    @Test
    public void testInsert() throws Exception {
        Cliente c = new Cliente();
        c.setCli_nome("Sujeito S.A");
        c.setCli_email("sj@sj.com");
        c.setCli_num_doc("99.999.999/9999-99");
        c.setCli_tipo("PJ");
        c.setCli_cidade("Camaragibe");
        c.setCli_estado("PE");
        c.setCli_rua("Travessa Duque de Caxias");
        c.setCli_telefone("(99)9999-9999");
        c.setCli_cep("99.999-999");
        c.setCli_numero("99");
        c.setCli_bairro("Umuarama");
        fcliente.cadastrar(c);
        System.out.println("Cadastro realizado com sucesso!");
    }
    /*
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
     */

 /*
    @Test
    public void testUpdate() throws Exception {
        Cliente c = new Cliente();
        c.setCli_codigo(1);
        fcliente.buscarCliente(c);
        if (c.getCli_codigo() > 0) {
            c.setCli_nome("Marcos Antonio");
            c.setCli_email("marcos@ml.com");
            c.setCli_num_doc("63.764.376/4736-49");
            c.setCli_tipo("PJ");
            c.setCli_cidade("Recife");
            c.setCli_estado("PE");
            c.setCli_rua("Machado de Asssis");
            c.setCli_telefone("(44)4444-4444");
            c.setCli_cep("22.555-999");
            c.setCli_numero("11");
            c.setCli_bairro("Boa vista");
            fcliente.atualizar(c);
        }
    }
     */
}
