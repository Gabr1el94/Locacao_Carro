
package veiculo;

import dados.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import locacao.Locacao;


public class DadosVeiculo extends Dados implements InterfaceVeiculo{

   
    @Override
    public void situacaoVeiculoOc(Locacao v) throws Exception {
       Statement conex = conectar();
        String sql = "Update Veiculo set vei_situacao = 'Ocupado' where vei_placa = ? ";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, v.getVeiculo().getVei_placa());
            cmd.execute();
        } catch (Exception e) {
            throw new Exception("Erro ao executar atualização: " + e.getMessage());
        }
        desconectar();
    }

    @Override
    public void situacaoVeiculoLi(Locacao v) throws Exception {
       Statement conex = conectar();
        String sql = "update Veiculo set vei_situacao = 'Livre' from Veiculo as v inner join Locacao as l on v.vei_placa = l.vei_placa where l.loc_codigo = ?";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, v.getLoc_codigo());
            cmd.execute();
        } catch (Exception e) {
            throw new Exception("Erro ao executar atualização: " + e.getMessage());
        }
        desconectar();
     
    }
    }


 

