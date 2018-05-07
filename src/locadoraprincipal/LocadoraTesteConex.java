/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoraprincipal;

import dados.Dados;
import javax.swing.JOptionPane;

/**
 *
 * @author aunio
 */
public class LocadoraTesteConex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Dados d = new Dados();
            d.conectar();
            JOptionPane.showMessageDialog(null, "Funcionou");
            d.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
