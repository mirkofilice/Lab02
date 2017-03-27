package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> parole;
	
	public AlienDictionary() {//ciao come stai
		this.parole =new LinkedList<Word>();
	}

	public void addWord(String alienWord, String translation){
		Word nuovaParola= new Word (alienWord, translation);
		/*boolean trovato=false;

		for (int i=0; i<parole.size() && trovato==false; i++){
			if (parole.get(i).getAlienWord().equals(alienWord)){	//per la variante con più traduzioni basta commentare questa parte
				parole.get(i).setTranslation(translation);
				trovato=true;
			}		
		}
		
		if(trovato==false)*/
			parole.add(nuovaParola);
	}
	
	public String translateWord(String alienWord){
		String s="";
		for (Word w:parole){
			if (w.getAlienWord().equals(alienWord)){
				s+=w.getTranslation()+"\n";
			}
		}
		return s;
	}
	
}
