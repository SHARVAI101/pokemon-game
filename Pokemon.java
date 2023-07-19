// package GAMES;

import java.io.*;

public class Pokemon
{
    static InputStreamReader read= new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);
    
    static world ob =new world(); 
    static Fight ob1 = new Fight();
    
    //player's pokemon 
    static String playerPokemon[]={"CHICKORITA","","","",""};
    static int playerPokemonNumber=0;
    
    //player's bag
    static String playerBag[]={"","","","",""};
    static int playerBagPocketNumber=0;      
    
    //Sharvai's pokemon
    static String SharvaiPokemon="BULBASAUR";           

    public static void main()throws IOException
    {
        
    }
    
    public void receive_pokemon_Birch()throws IOException
    {
        int c=0;
        
        String s="ENTER CHOICE NUMBER:";
        ob.displayline(s);
        c=Integer.parseInt(in.readLine());
        
        if(c==2)
        {
            playerPokemon[playerPokemonNumber]="CHICKORITA";
            playerPokemonNumber+=1;
        } 
    }    
    
    public void receive_pokedex_Birch()throws IOException
    {
        int c=0;
        
        playerBag[playerBagPocketNumber]="POKEDEX";
        playerBagPocketNumber=1;
    } 
    
    public void receive_pokeballs_Birch()throws IOException
    {
        int c=0;
        
        playerBag[playerBagPocketNumber]="5 POKEBALLS";
        playerBagPocketNumber=2;
    } 
    
    public void fightSharvai1()throws IOException
    {
        ob1.fight(playerPokemon[0],"BULBASAUR","SHARVAI","TRAINER");
    }
}