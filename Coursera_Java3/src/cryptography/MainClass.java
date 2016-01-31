package cryptography;

import java.util.*;

public class MainClass  {

	public static void main(String[] args) {
		
		String phrase;
		char ch;
		int key;
		int key1;
		int key2;
		String replaceVowels;
		String emphasize;
		
		phrase = "Mary Bella Abracadabra";
		ch = 'a';
		
		WorldPlay wp = new WorldPlay(phrase, ch);
		
		
		replaceVowels = wp.replaceVowels();
		emphasize = wp.emphasize();
		
		//System.out.println("The phrase " + phrase + " after replacing the vowels by " + ch + " is: " + replaceVowels);
		//System.out.println("The phrase " + phrase + " after emphasizing by " + ch + " is: " + emphasize);
		
		//prueba p = new prueba();
		//p.imprime();
		
		CaesarCipher cesar = new CaesarCipher();

		/*System.out.println(cesar.encrypt("AAA BBB aaa", 26));
		System.out.println(cesar.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
		System.out.println(cesar.encryptTwoKeys("First Legion", 23, 17));*/
		
		phrase = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
		key = 15;
		key1 = 21;
		key2 = 8;
		
		System.out.println(cesar.encrypt(phrase, key));
		System.out.println(cesar.encryptTwoKeys(phrase, key1, key2));
		

	}

}
