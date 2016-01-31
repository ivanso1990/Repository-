package cryptography;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CaesarCipher {
	
	public static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public int toNum(char c){
		if (c >= 'A' && c <= 'Z')
			return ALPHABET.indexOf(c);
		else if (c >= 'a' && c <= 'z')
			return alphabet.indexOf(c);
		else 
			return -1;
	}
	
	public String toStrM(int pos){
		return String.valueOf(ALPHABET.charAt(pos));
	}
	
	public String toStrm(int pos){
		return String.valueOf(alphabet.charAt(pos));
	}
	
	public String encrypt (String input, int key){
		
		String output = "";
		int index = -1;
		key %= 26;
		
		for (int i = 0; i < input.length(); ++i){
			
			if ((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') || (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')) {
				index = (toNum(input.charAt(i)) + key) % 26;
				
				if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
						output = output.concat(toStrM(index));
				else
					output = output.concat(toStrm(index));
			}	
			else
				output = output.concat(String.valueOf(input.charAt(i)));
			
		}
		return output;
		
	}
	
public String encryptTwoKeys (String input, int key1, int key2){
		
		String output = "";
		int index = -1;
		key1 %= 26;
		key2 %= 26;
		int key;
		
		for (int i = 0; i < input.length(); ++i){
			
			if (i % 2 != 1) 
				key = key1;
			else
				key = key2;
			
			if ((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') || (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')) {
				index = (toNum(input.charAt(i)) + key) % 26;
				
				if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
						output = output.concat(toStrM(index));
				else
					output = output.concat(toStrm(index));
			}	
			else
				output = output.concat(String.valueOf(input.charAt(i)));
			
		}
		return output;
		
	}
	
	
	/*void TestCaesar(){
		FileResource fr = new FileResource();
		String message = fr.asString();
		String encrypted = encrypt(message, key);
		System.out.println("key is " + key + "\n" + encrypted);
	}*/

}
