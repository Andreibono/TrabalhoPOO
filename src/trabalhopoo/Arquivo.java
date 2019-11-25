package trabalhopoo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Arquivo {
    
    private int coeficienteDeDano;
    private int alcance;
    
public void lerArquivo(){
    File file = new File("c:\\temp\\teste.txt");
    Scanner sc = null;
    try {
        sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
    catch (IOException e){
        System.out.println("Erro: "+e.getMessage());
    }
    finally {
        if (sc != null)
        sc.close();
    }
}
}
