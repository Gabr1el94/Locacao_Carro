package veiculo;

import locacao.Locacao;



public class NegocioVeiculo implements InterfaceVeiculo {

    @Override
    public void situacaoVeiculoOc(Locacao v) throws Exception {
       DadosVeiculo dv = new DadosVeiculo();
        dv.situacaoVeiculoOc(v);
    }

    @Override
    public void situacaoVeiculoLi(Locacao v) throws Exception {
        DadosVeiculo dv = new DadosVeiculo();
        dv.situacaoVeiculoLi(v);
    }

   

    

}
