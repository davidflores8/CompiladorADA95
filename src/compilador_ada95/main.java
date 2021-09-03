/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador_ada95;

import java.io.FileReader;
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
            
            
            
        }catch(Exception e){
                e.printStackTrace();
        }
        
    }
    
}
