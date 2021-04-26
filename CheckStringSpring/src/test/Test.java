package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import handlers.CheckStringHandler;
import handlers.Match;

public class Test {
	
	public static void main(String[] args) throws IOException {
		ArrayList<String> dizionario = new ArrayList<>();
		loadArrFromFile(dizionario);
		
		String correctme = "Afganista";
		//String correctme2 = "Republic of";
		
		String s = "-------------------------------------------------------";
		
		
		System.out.println(editDistance(dizionario, correctme));
		
		//System.out.println(contains(dizionario, correctme2,context));
		
	}

	static void loadArrFromFile(ArrayList<String> array) throws IOException{
	    Path inputFilePath=Paths.get("C:/Users/rpaga/Desktop/dizionario.txt");
		int count =0;
	    try(BufferedReader fileInputReader = Files.newBufferedReader(inputFilePath)){
	      String line=null;
		  while ((line = fileInputReader.readLine()) != null){
	        array.add(line);
			count++;
	      }
	    }
	  }
	
	
	
	public static Match editDistance(ArrayList<String> dizionario, String daCorreggere) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansString.xml");
		CheckStringHandler editDistanceStrategy = (CheckStringHandler) context.getBean("ed1");
	
		return editDistanceStrategy.check(dizionario, daCorreggere);
	}
	
	public static Match contains(ArrayList<String> dizionario, String daCorreggere) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansString.xml");
		CheckStringHandler contains = (CheckStringHandler) context.getBean("c1");
		
		return contains.check(dizionario, daCorreggere);
	}
	

	
}
