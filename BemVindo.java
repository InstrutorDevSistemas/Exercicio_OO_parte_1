package olaMundo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BemVindo {

	public static void cat(File arquivo) {
		RandomAccessFile entrada = null;
		String linha = null;

		 try {
			 entrada = new RandomAccessFile(arquivo, "r");
		     while ((linha = entrada.readLine()) != null) {
		            System.out.println(linha);
		     }
		     return;
		 } catch(FileNotFoundException fnf) {
		        System.err.println("File: " + arquivo + " not found.");
		    } catch(Exception e) {
		        System.err.println(e.toString());
		} finally {
			 if (entrada != null) {
				 try {
		                entrada.close();
		            } catch(IOException io) {
		            }
		     }
		 }
	}
	
	public static void main(String[] args) {
		int i = 0;
        
		//  i++, incrementa a variável i depois dela ser utilizada no comando
		System.out.printf("      i++  : %d",i++); 
		System.out.printf("\n        i  : %d",i); 
		System.out.printf("\n");
		
		// ++i, incrementa a variável i antes dela ser utilizada no comando.
        System.out.printf("\n      ++i  : %d", ++i);
        System.out.printf("\n        i  : %d",i);
        System.out.printf("\n");
        
        /** já no caso i = i + 1 veja que a variável i 
         *  também foi incrementada antes de ser utilizada
         *  O que significa que a instrução i = i + 1, resulta 
         *  no valor da variável i após o incremento.
         **/
        System.out.printf("\n i = i + 1 : %d", (i = i + 1));
        System.out.printf("\n        i  : %d", i);
	}    

}
