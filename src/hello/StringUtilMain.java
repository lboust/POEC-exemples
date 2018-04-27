package hello;

import java.util.Map;
import java.util.Map.Entry;

public class StringUtilMain {

	public static void main(String[] args) {
		
		//Math.PI;
		
		String texte = " ";
		
		// compte le nombre de caractères autres que espace
		System.out.println(StringUtil.countCharacters(texte));
		
		//compte le nombre de mots
		System.out.println(StringUtil.countWords(texte));
		
		//retourne true si palindrome, false sinon
		
		System.out.println(StringUtil.isPalindrome(texte));
		System.out.println(StringUtil.isPalindrome("radar"));
		
		// retourne true si anagramme, false sinon
		System.out.println("anagramme1" + " " +StringUtil.isAnagramme("romain", "manoir"));
		
		System.out.println("anagramme2" + " "+ StringUtil.isAnagramme("Pablo Picasso", "Pascal Obispo"));
		// couple lettre/occurence!!
		//tableau de caracteres et tableau d'iteration aux indices correspondants 
		
		
		String text = "The core collection interfaces encapsulate different types The core etc bla bla bla bla bla the THE";
		Map<String, Integer> occurences = StringUtil.countWordOccurences(text);
		
		System.out.println(occurences.size());
		for (Entry<String, Integer> entry : occurences.entrySet()) {
			System.out.format("%s : %d%n", entry.getKey(), entry.getValue());
			
		}
		
	}

}
