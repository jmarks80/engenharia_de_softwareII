/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblisemtela;


import DAO.ProdutoDAO;
import basicos.Autor;
import basicos.Livro;
import basicos.LivroFisico;
import basicos.Produto;

/**
 *
 * @author 05220149
 */
public class BibliSemTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor a = new Autor();
        a.setNome("Jean Marks");
        a.setCpf("999.999.999-99");
        a.setEmail("jm@ifrs.br");
        
        
        
        LivroFisico l = new LivroFisico("A biblioteca",1.00, a);
        l.setDescricao("TESTE DESCRICAO");
        
        //l.mostraDetalhes();
        
        ProdutoDAO livroDao = new ProdutoDAO();
        livroDao.adicionaProduto(l);
    }
    
}
