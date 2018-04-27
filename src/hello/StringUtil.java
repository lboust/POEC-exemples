package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringUtil {

	public static int countCharacters(String texte) {
		int nombreDEspaces = 0;
		String extrait;
		for (int i = 0; i < texte.length(); i++) {
			extrait = texte.substring(i, i+1);
			if (extrait.contains(" ")) { // utiliser plutôt charAt cf correction
				nombreDEspaces+=1;
			}
		}
		System.out.println();
		return (texte.length()-nombreDEspaces);
		//return texte.replace(" ", "").length(); l'opération replace génère une chaîne de caractères en mémoire -> à éviter
	}

	public static int countWords(String texte) {
		int compteur = 0;
		int debut, fin;
		debut = 0;
		String extrait;
		if (countCharacters(texte)!=0) {		
			compteur = 1;
		}
		for (int i = debut; i < texte.length(); i++) {
			extrait = texte.substring(debut, i);
			if (extrait.contains(" ")) { // ne fonctionne pas pour plusieurs espaces consécutifs cf correction
				compteur += 1;
				debut = i;
			}
		}
		return compteur;
	}

	public static boolean isPalindrome(String texte) {
		boolean palindrome = true ; 
		int moitie = (int)texte.length()/2;
		for (int i = 0; i < moitie; i++) {
			if(!(texte.substring(i, i+1).equals(texte.substring(texte.length()-i-1, texte.length()-i)))) {				
				palindrome = false;
			} 
		}
		return palindrome;		
	}

	public static boolean isAnagramme(String string1, String string2) {
		Integer iteration = 1;		
		HashMap<Character, Integer> anagramme1 = new HashMap<Character, Integer>();
		
		// construction d'un tableau de caractères de string1
		for (int i = 0; i < string1.length(); i++) {					
			for (Entry<Character, Integer> entry : anagramme1.entrySet()) {					
				if (entry.getKey().equals(Character.toLowerCase(string1.charAt(i)))) {
					iteration = entry.getValue()+1;
				} 											
			}
			anagramme1.put(Character.toLowerCase(string1.charAt(i)), iteration);
			iteration = 1;				
		}		
		HashMap<Character, Integer> anagramme2 = new HashMap<Character, Integer>();
	
		// construction d'un tableau de caractères de string2
		for (int i = 0; i < string2.length(); i++) {					
			for (Entry<Character, Integer> entry : anagramme2.entrySet()) {					
				if (entry.getKey().equals(Character.toLowerCase(string2.charAt(i)))) {
					iteration = entry.getValue()+1;
				} 											
			}
			anagramme2.put(Character.toLowerCase(string2.charAt(i)), iteration);
			iteration = 1;				
		}		
		return anagramme1.equals(anagramme2);		
	}
	
	public static Map<String, Integer> countWordOccurences(String text) {
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		// construction du tableau de mots avec doublons
		String[] splittedText = text.split(" ");
		int iteration = 1;
		//pout tout mot du tableau
			for (int i = 0; i < splittedText.length; i++) { 
				// test
				for (Entry<String, Integer> entry : myMap.entrySet()) {					
					if (entry.getKey().equals(splittedText[i])) {
						iteration = entry.getValue()+1;
					} 											
				}
				myMap.put(splittedText[i], iteration);
				iteration = 1;				
			}
		return myMap;		
	}
	
	public static Map<String, Integer> countWordOccurences2(String text) {
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		// construction du tableau de mots avec doublons
		String[] splittedText = text.split(" ");
		int iteration = 1;
		
		//pout tout mot du tableau
			for (int i = 0; i < splittedText.length; i++) { // compare un mot		
				for (int j = i+1; j < splittedText.length; j++) {// avec les mots suivants
					// test		
					if (splittedText[i].equals(splittedText[j])) {
						splittedText[j]= "";						
						iteration+=1;
					}
				}
				//ecriture dans myMap
				myMap.put(splittedText[i], iteration);
				iteration = 1;				
			}
		myMap.remove("");
		return myMap;
		
	}
}
	

