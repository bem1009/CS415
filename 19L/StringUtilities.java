import wheelsunh.users.*;
import java.util.*;

/**--------------------------------------------------------
  * StringUtilities:
  * Several utility methods for doing pig latin
  * 
  * Lab 18
  * 
  * 
  * mlb 
  */

public class StringUtilities
{  
   
   
   
   //--------------------------------------------------------------------- 
   // return index of first vowel 
   // returns -1 if the word has no vowels
   public static int firstVowel(String word) 
   {
      
      for ( int z = 0; z < word.length() ; z++ )
      {
         
         String letter = letterAt( word, z );
         if ( isVowel( letterAt( word, z ))) 
         {
             
             return z;
         }
      }
         
        
            return -1;
        
      }
      
      
      
   
   
   //--------------------------------------------------------------------- 
   // returns true if the string represents a vowel (a,e,i,o or u)
   // otherwise return false
   //
   public static boolean isVowel(String letter) 
   {
      
      String a = "a";
      String e = "e";
      String i = "i";
      String o = "o";
      String u = "u";
          
      if ( letter.equalsIgnoreCase(a) || letter.equalsIgnoreCase(e) || letter.equalsIgnoreCase(i) ||
          letter.equalsIgnoreCase(o) || letter.equalsIgnoreCase(u) )
      {
          return true;
      }
      
      else 
      return  false;
   }
   
   
   //---------------------------------------------------------------
   // returns a String representing the letter in "text" at index n
   // returns null if the index is out of bounds
   //
   public static String letterAt (String text, int n)
   {
        
       if ( n > (text.length() - 1) || n < 0 )  
      return null;
      
      else 
      {
      char ch = text.charAt( n );
      String newstring = Character.toString( ch );
      return newstring;
      }
      
      
      
   }
   
   
   //---------------------------------------------------------------------- 
   // returns  "word" translated to pig latin 
   //
   public static String translateWord( String word ) 
   {
         
        int ind = firstVowel( word );
        
        if( ind != -1 )
        {
            String start = word.substring( 0, ind );
            String end = word.substring( ind );
            return end + start + "ay";
        }
        else 
        {
        return word + "ay";
        }
   }   
   
   
   //---------------------------------------------------------------------- 
   // returns  "sentence" translated to pig latin 
   //
   public static String translateSentence( String s ) 
   {
     // An empty String in which to construct the translated sentence
     String result = "";
     
     // Split the sentence into an array of words
     String [] list = s.split(" ");
     
     // for each word in the list translate it with "translateWord" and 
     //  concatenate it to the String "result"
     // and concatenate a blank " " to result.
     
     for ( int i = 0; i < list.length; i++ )
     {
       result += translateWord( list[i]);
     }
     
     return result;
   }
         
      
      
      
      
      
       
      // return the result
   
      
      
   
   
   
   
   
   
   //---------------------------------------------------------------
   // A unit test of the above methods
   //  DO NOT EDIT
   public static void main( String args[] )
   {
      String alpha;
      
      //--------------------------------------------------------------------------------- 
      alpha = "ABCDE";
      System.out.println("\n\n****************** TEST LetterAt *******************");
      System.out.println("Original: " + alpha); 
      
      String letter;
      for( int i = -1; i < alpha.length() + 1; i++ )
      {
         letter = letterAt( alpha, i );
         if( letter == null )
            System.out.println("LetterAt " + i + " : " + "null" );
         else
            System.out.println("LetterAt " + i + " : " + letter ); 
      }
      
      
      //--------------------------------------------------------------------------------- 
      alpha = "ABCDEioux";
      System.out.println("\n\n****************** TEST isVowel *******************");
      System.out.println("Word: " + alpha); 
      
      for( int i = 0; i < alpha.length(); i++ )
      {
         letter = letterAt(alpha,  i );
         if( letter == null )
            System.out.println("LetterAt " + i + " : " + "null" );
         else
            System.out.println("isVowel "+ letter + " is " + isVowel(letter) ); 
      }
      
      //--------------------------------------------------------------------------------- 
      System.out.println("\n\n****************** TEST firstVowel *******************");
      String words[] = { "one", "two", "three", "shhh", "hymn", "" };
      
      for( int i = 0; i < words.length; i++ )
      {
         int idx = firstVowel( words[i] );
         if( idx == -1 )
            System.out.println( words[i] + ":  no vowels");
         else
            System.out.println( words[i] + " : '" + letterAt( words[i],idx ) + "' at index "+
                               idx ) ; 
      }
      
      
      //--------------------------------------------------------------------------------- 
      System.out.println("\n\n****************** TEST word translator *******************");
      String words2[] = { "dog", "bananna", "nix", "scram" };
      
      for( int i = 0; i < words2.length; i++ )
         System.out.println( words2[i] + " : " + translateWord( words2[i] ) );
      
      
      //--------------------------------------------------------------------------------- 
      System.out.println("\n\n****************** TEST sentence translator *******************");
      String sentences[] = { "nix the dog and scram",  "I like bannana pudding"  };
      
      for( int i = 0; i < sentences.length; i++ )
         System.out.println( sentences[i] + " : " + translateSentence( sentences[i] ) );
      
   }// end of main
   
}// end of class