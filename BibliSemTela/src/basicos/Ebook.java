/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos;

/**
 *
 * @author 05220149
 */
 
 //alterado pelo usuário 2 ---(
public class Ebook extends Livro implements Promocional{
    public Ebook(){
    }
    
    public Ebook(String n, double d, Autor a) {
        setNome(n);
        setValor(d);
        setAutor(a);
       
    }

    @Override
    public boolean aplicaDescontoDe(double percentagem) {
        if (percentagem <= 30 / 100) return true;
        else return false;
    }
    
}
