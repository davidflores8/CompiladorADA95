/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador_ada95;

import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Yylex lexer  = new Yylex( new FileReader("src/compilador_ada95/entrada.txt")); 
            
            parser p = new parser(lexer);
            
            p.parse();
            
            if(lexer.erroresLexicos.isEmpty()){
                   System.out.println("Felicidades, no hay errores léxicos");
            }
            else{
                for (int i = 0; i < lexer.erroresLexicos.size(); i++) {
                     System.out.println(lexer.erroresLexicos.get(i));
                }
            }
            
            if(p.errores.isEmpty()){
                   System.out.println("Felicidades, no hay errores sintácticos");
            }
            else{
                System.out.println("Errores sintacticos: ");
                for (int i = 0; i < p.errores.size(); i++) {
                     System.out.println(p.errores.get(i));
                }
            }
                        
            
            
        }catch(Exception e){
                e.printStackTrace();
        }
        
    }

 
    
}

