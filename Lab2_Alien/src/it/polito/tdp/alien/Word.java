package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;//ciao come stai
	private String translation;
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}


	public String compare(String alienWord){
		String s="";
		if (alienWord.equals(this.alienWord)){
			s+="parola già presente nel dizionario";
			return s;//probabilmente devi ritornare la parola inserita
		}
		return null;			
	}


	public String getTranslation() {
		return translation;
	}


	public void setTranslation(String translation) {
		this.translation = translation;
	}


	public String getAlienWord() {
		return alienWord;
	}


	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	
	

}
