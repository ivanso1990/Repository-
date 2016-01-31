package cryptography;

import java.util.*;

public class WorldPlay {

	private static String vowel = "aeiouAEIOU";
	public String phrase;
	public char ch;
	
	WorldPlay(String phrase, char ch){
		this.phrase = phrase;
		this.ch = ch;
	}

	
	public boolean isVowel(char ch){
		if (vowel.indexOf(ch) == -1)
			return false;
		return true;
	}
	
	
	public String replaceVowels () {
		
		String phraseEdited = this.phrase;
		
		for (int i = 0;  i < phraseEdited.length() -1; ++i){
			if (isVowel(phraseEdited.charAt(i))){				
				phraseEdited = phraseEdited.replace(phraseEdited.charAt(i), this.ch);
			}
				
		}
		
		return phraseEdited;
	}
	
	public String emphasize () {
		
		char[] phraseEdited = this.phrase.toCharArray();

		for (int i = 0;  i <= (this.phrase.length() -1); ++i){
			if (phraseEdited[i] == String.valueOf(this.ch).toLowerCase().charAt(0) || phraseEdited[i] == String.valueOf(this.ch).toUpperCase().charAt(0)){
				if ((i+1)%2 == 0)
					phraseEdited[i] = '+';
				else
					phraseEdited[i] = '*';
			}
		}
		return String.valueOf(phraseEdited);
	}

}
