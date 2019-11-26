package Arquivos;

import Itens.Item;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import personagens.Jogador;

public class ArquivoTeste {

    public ArquivoTeste() {
    }
 
    public int lercoeficientedeDano(String nome) {

        String path = "src\\Arquivos\\" + nome + ".txt";
        FileReader fr = null;

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            
            
            int dano = Integer.parseInt(line);
            return dano;
        
            
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    return -1;
    } 
    public int leralcance(String nome) {

        String path = "src\\Arquivos\\" + nome + ".txt";
        FileReader fr = null;

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            
            int alcance = Integer.parseInt(line);
            return alcance;
        
            
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    return -1;
    } 
   
}

        /*File file = new File("src\\Arquivos\\Escopeta.txt");
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
         }*/
    
