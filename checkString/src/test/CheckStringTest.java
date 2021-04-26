package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CheckStringTest {

	/**
	 * Carica le righe del file in un array di stringhe
	 * @param array: l'array che viene caricato
	 * @throws IOException
	 */
	private static void loadArr(ArrayList<String> array) throws IOException{
		
	    Path inputFilePath=Paths.get("C:/Users/rpaga/Desktop/dizionario.txt");
		int count =0;
	    try(BufferedReader fileInputReader = Files.newBufferedReader(inputFilePath)){
	      String line=null;
		  while ((line = fileInputReader.readLine()) != null){
	        array.add(line);
			count++;
	      }
	    }
	    //System.out.println("dizionario caricato");
	  }

	public static void main(String[] args) throws IOException {
		ArrayList<String> dizionario = new ArrayList<>();
		loadArr(dizionario);
		
		String correctme = "Afganista";
		String correctme2 = "Republic of";
		String correctme3 = "jifiepo";
		
		System.out.println(Utilizzo.analysis(dizionario,correctme));
		//Utilizzo.analysis(dizionario,correctme2);
		//Utilizzo.analysis(dizionario,correctme3);
		
		//PaeseDAO<?> dao = new PaeseDAO();
	    
	}
}
