package cryptography;

public class prueba {

	public void imprime(){
		String phraseEdited = "hola que tal como estas";
		char ch = 'e';
		int i = 1;
		
		
		phraseEdited.replace(phraseEdited.charAt(i), ch);
		System.out.println(phraseEdited);
		
		phraseEdited = phraseEdited.replace('a', 'K');

		System.out.println(phraseEdited);
	}
}
