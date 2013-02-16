import java.util.*;

public class loto{

  public static void main(String[] args)
  {
    int compteur = 0;
    int[] grille = new int[6];
    int[] tirage = new int[6];
    Scanner s = new Scanner(System.in);
    int valueScan = 0;

 for (int i = 0 ; i < 6; i++) // pour le joueur
 {
   
      if (i < 5) //faut que ce soit inferieur sinon sa boule 6 fois et donc 6 demandes de nombres
      {
        System.out.println("choisir un nombre entre 1 et 49");
        valueScan = s.nextInt();
        	if( valueScan >49 || valueScan < 1)
        		{
        		System.out.println("ce n'est pas possible recommencer entre 1 et 49 j'ai demander");
        		i--;
        		
        		}
        else
        		{
        		System.out.println("ok");
            grille[i] = valueScan;
        		}
        	
      } 
      else 
      	{
        System.out.println("choisir un nombre entre 1 et 10");
        valueScan = s.nextInt();
        	if (grille[i] >10 || grille[i] < 1)
        		{
        		System.out.println("ce n'est pas possible recommencer entre 1 et 10 j'ai demander");
        		i--;
        	}
          else
            grille[i] = valueScan;
      	}
    }

    int lower = 1; //inclus
    int higher = 50; // exclus
    int a;
        
    for (int l = 0; l < 5; l++)
    {
    	  a = (int)(Math.random() * (higher-lower)) + lower;
        for(int i=0; i<l; i++)
        {
          if(a==tirage[i])
            l--;
          else if(i == l-1)
            tirage[l] = (int)a;
        }

    }
    
    lower = 1; // inclus
    higher = 11; //exclus
	  int b = (int)(Math.random() * (higher-lower)) + lower;
    tirage[5] = (int)b;
    
    
 
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
