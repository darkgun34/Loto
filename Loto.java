
import java.util.*;

public class loto{

  public static void main(String[] args)
  {
    int compteur = 0;
    int[] grille = new int[6];
    int[] tirage = new int[6];
    Scanner s = new Scanner(System.in);

 for (int i = 0 ; i < 6; i++) // pour le joueur
 {
   
      if (i < 5) //faut que ce soit inferieur sinon sa boule 6 fois et donc 6 demandes de nombres
      {
        System.out.println("choisir un nombre entre 1 et 49");
        grille[i] = s.nextInt();
        	if( grille[i] >49 || grille[i] < 1)
        		{
        		System.out.println("ce n'est pas possible recommencer entre 1 et 49 j'ai demander");
        		i = i--;
        		
        		}
        	if (grille[i] > 1 && grille[i] <50)
        		{
        		System.out.println("ok");
        		i = i++;
        		}
        	
      } 
      else 
      	{
        System.out.println("choisir un nombre entre 1 et 10");
        grille[i] = s.nextInt();
        	if (grille[i] >10 || grille[i] < 1)
        		{
        		System.out.println("ce n'est pas possible recommencer entre 1 et 10 j'ai demander");
        		i = i--;
        		}
      	}
    }

 
    for (int l = 0; l < 6; l++)
    {
      if (l <= 5)
      {
    	  int lower = 1; //inclus
    	  int higher = 50; // exclus

    	  int a = (int)(Math.random() * (higher-lower)) + lower;
        tirage[l] = (int)a ;
        	
      } 
      else {
    	  int lower = 1; // inclus
    	  int higher = 11; //exclus
    	  int b = (int)(Math.random() * (higher-lower)) + lower;
        tirage[l] = (int)b;
      		}
    }
    
    
 
    for (int m = 0; m < 6; m++)
    {
      for (int n = 0; n < 6; n++)
      {
        if (grille[m] == tirage[n]) 
        	{
        	compteur++;
        	}
      }
    }
    
    
    System.out.println("tu a "+compteur+" chiffre du loto de bon");
    if (grille[5] == tirage[5]) 
    {
      System.out.println("tu a le numero chance");
    }

  }
}
