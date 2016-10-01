/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.bank.linguagens.formais.e.automatos;

import simple.bank.gals.linguagens.formais.e.automatos.*;

/**
 *
 * @author Joshua
 */
public class SimpleBank {
    
    public static double val;
    // gera o saldo aleatoriamente
    public static double saldo = 3573.34;
    // entrada da instrução
    public static String entrada = "meu saldo";
    
    public static void main(String[] args) 
    {
        try 
        {
            Lexico lex = new Lexico(entrada);
            
            Sintatico sin = new Sintatico();
            Semantico sem = new Semantico();
            sin.parse(lex, sem);
            
        } catch (LexicalError | SyntaticError | SemanticError ex) {
            System.out.println(ex);
        }
    }
    
}
