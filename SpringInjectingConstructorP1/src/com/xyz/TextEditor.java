package com.xyz;

public class TextEditor 
{
     private SpellChecker spellChecker;
     
     public TextEditor(SpellChecker spellChecker)
     {
    	 System.out.println("Inside texteditor");
    	 this.spellChecker=spellChecker;
     }
     public void spellCheck()
     {
    	 spellChecker.checkSpelling();
     }
}
