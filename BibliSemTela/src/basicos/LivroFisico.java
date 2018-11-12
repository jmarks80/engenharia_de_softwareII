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
public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(String n, double d, Autor a) {
        setNome(n);
        setValor(d);
        setAutor(a);
       
    }
    
    
    public double getTaxaImpressao(){
        
        return super.getValor() * (5 / 100);
        
    }
    
    public boolean aplicaDescontoDe(double percent){
        if (percent <= 5 / 100) return true;
        else return false;
    }
}
