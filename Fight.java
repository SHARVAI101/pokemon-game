// package GAMES;

import java.io.*;

public class Fight
{

    static InputStreamReader read= new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);

    static Fight ob = new Fight();
    static world ob1 = new world();

    static String BattleField[][]={{" __","___","___","___","___","___","___","___","___","___","___","__ "},
                                   {"|--","---","---","---","---","---","-__","___","___","_--","---","--|"},
                                   {"|--","---","---","---","---","---","|"  , ""  ,  "" , "|-","---","--|"},
                                   {"|--","---","---","---","---","--|","ENE","MY ","POK","EMO","N|-","--|"},
                                   {"|--","---","---","---","---","---","HP=","-","---","---","---","--|"},
                                   {"|--","---","---","---","---","---","LEV","EL=","--","---","---","--|"},
                                   {"|--","---","---","---","---","___","---","---","---","---","---","--|"},
                                   {"|--","---","---","---","--/","   ","\\--","---","---","---","---","--|"},
                                   {"|--","---","---","---","-| "," O "," |-","---","---","---","---","--|"},
                                   {"|--","---","---","---","--\\","___","/--","---","---","---","---","--|"},
                                   {"|--","---","---","---","---","---","---","---","---","---","---","--|"},
                                   {"|--","---","---","---","---","---","---","---","---","---","---","--|"},
                                   {"|--","---","---","---","---","---","---","---","---","---","---","--|"},
                                   {"|--","-__","___","___","___","---","---","---","---","---","---","--|"},
                                   {"|--","|"  , ""  ,  "" ,  "|","--H" ,"P=","--","---","---","---","--|"},
                                   {"|-|","YOU","R P","OKE","MON","|-L","EVE","L=","---","---","---","--|"},
                                   {"|__","___","___","___","___","___","___","___","___","___","___","__|"}};

    //POKEDEX FORMAT:NAME,TYPE,ATTACK BONUS AGAINST,LEVEL,HP,ATTACK BONUS,DEFENSE,MOVE 1,MOVE 1 ATTACK,MOVE 2,MOVE 2 ATTACK,MOVE 3,MOVE 3 ATTACK,MOVE 4,MOVE 4 ATTACK                               
    static String PlayerPokeDex[][]={{"CHICKORITA","FIRE","GRASS","1","20","2","4","TACKLE","5","GROWL","1","","0","","0"},
                                     {"","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","",""},
                                     {"","","","","","","","","","","","","","",""}};

    //static String SharvaiPokeDex1[][]={{"BULBASAUR","GRASS","WATER","1","20","2","3","LEECH SEED","6","INTIMIDATE","2","","0","","0"}};
    
    static String enemyPokeDex[][]={{"SHARVAI","BULBASAUR","GRASS","WATER","1","20","2","3","LEECH SEED","6","INTIMIDATE","2","","0","","0"}};

    /*//POKEMON STATICSTICS
    //1.CHICKORITA
    static String pokemonName_chickorita="CHICKORITA";
    static String type_chickorita="FIRE";
    static String attack_bonus_against_chickorita="GRASS";
    static int level_chickorita=1;   
    static int hp_chickorita=20;     
    static int attack_chickorita=5;
    static int attack_bonus_chickorita=2;    
    static int defense_chickorita=4;

    //2.BULBASAUR
    static String pokemonName_bulbasaur="BULBASAUR";
    static int hp_bulbasaur=20;
    static int level_bulbasaur=1;
    static String type_bulbasaur="GRASS";
    static String attack_bonus_against_bulbasaur="WATER";
    static int attack_bonus_bulbasaur=2;
    static int attack_bulbasaur=6;
    static int defense_bulbasaur=3;*/

    static int enemyPokeDexRowNumber=0;
    static String playerPokemonName="";
    static String playerType="";
    static String player_attack_bonus_against="";
    static int player_level=0;
    static int player_hp=0;
    static String player_move1="";
    static int player_move1_attack=0;
    static String player_move2="";
    static int player_move2_attack=0;
    static String player_move3="";
    static int player_move3_attack=0;
    static String player_move4="";
    static int player_move4_attack=0;
    static int player_attack_bonus=0;
    static int player_defense=0;
    
    static String enemyPlayerName="";
    static int playerPokeDexRowNumber=0;    
    static String enemyPokemonName="";
    static String enemyType="";
    static String enemy_attack_bonus_against="";
    static int enemy_level=0;
    static int enemy_hp=0;
    static String enemy_move1="";
    static int enemy_move1_attack=0;
    static String enemy_move2="";
    static int enemy_move2_attack=0;
    static String enemy_move3="";
    static int enemy_move3_attack=0;
    static String enemy_move4="";
    static int enemy_move4_attack=0;
    static int enemy_attack_bonus=0;
    static int enemy_defense=0;

    static String enemyPlayerType="WILD";

    public static void main()
    {

    }

    public void fight(String playerPokemon,String enemyPokemon,String enemyName,String enemyType)throws IOException
    {
        System.out.print("\f");

        playerPokemonName=playerPokemon;
        enemyPokemonName=enemyPokemon;
        enemyPlayerName=enemyName;
        enemyPlayerType=enemyType;

        for(int i=0;i<PlayerPokeDex.length;i++)
        {
            if(PlayerPokeDex[i][0].equals(playerPokemon))
            {
                playerPokeDexRowNumber=i;
                playerType=PlayerPokeDex[i][1];
                player_attack_bonus_against=PlayerPokeDex[i][2];
                player_level=Integer.parseInt(PlayerPokeDex[i][3]);
                player_hp=Integer.parseInt(PlayerPokeDex[i][4]);
                player_attack_bonus=Integer.parseInt(PlayerPokeDex[i][5]);
                player_defense=Integer.parseInt(PlayerPokeDex[i][6]);
                player_move1=PlayerPokeDex[i][7];
                player_move1_attack=Integer.parseInt(PlayerPokeDex[i][8]);
                player_move2=PlayerPokeDex[i][9];
                player_move2_attack=Integer.parseInt(PlayerPokeDex[i][10]);
                player_move3=PlayerPokeDex[i][11];
                player_move3_attack=Integer.parseInt(PlayerPokeDex[i][12]);
                player_move4=PlayerPokeDex[i][13];
                player_move4_attack=Integer.parseInt(PlayerPokeDex[i][14]);
            }
        }

        for(int i=0;i<enemyPokeDex.length;i++)
        {
            if(enemyPokeDex[i][0].equals(enemyPlayerName))
            {
                enemyPokeDexRowNumber=i;
                enemyType=enemyPokeDex[i][2];
                enemy_attack_bonus_against=enemyPokeDex[i][3];
                enemy_level=Integer.parseInt(enemyPokeDex[i][4]);
                enemy_hp=Integer.parseInt(enemyPokeDex[i][5]);
                enemy_attack_bonus=Integer.parseInt(enemyPokeDex[i][6]);
                enemy_defense=Integer.parseInt(enemyPokeDex[i][7]);
                enemy_move1=enemyPokeDex[i][8];
                enemy_move1_attack=Integer.parseInt(enemyPokeDex[i][9]);
                enemy_move2=enemyPokeDex[i][10];
                enemy_move2_attack=Integer.parseInt(enemyPokeDex[i][11]);
                enemy_move3=enemyPokeDex[i][12];
                enemy_move3_attack=Integer.parseInt(enemyPokeDex[i][13]);
                enemy_move4=enemyPokeDex[i][14];
                enemy_move4_attack=Integer.parseInt(enemyPokeDex[i][15]);
                
                /*for(int j=0;j<enemyPokeDex[0].length;j++)
                {
                    enemyPokeDex[0][j]=enemyPokeDex[i][j];
                }*/
            }
        }       
        
        ob.BattleFieldPrint(playerPokemon,enemyPokemon);        
    }

    public void BattleFieldPrint(String playerPokemon,String enemyPokemon) throws IOException
    {
        String s="";
        
        System.out.print("\f"); 

        for(int i=0;i<BattleField.length;i++)
        {
            for(int j=0;j<BattleField[0].length;j++)
            {
                if(i==2 && j==7)
                {                    
                     System.out.print(enemyPokemon);                    
                }
                else if(i==4 && j==7)
                {
                    System.out.print(enemyPokeDex[0][5]+BattleField[i][j]);
                }
                else if(i==5 && j==8)
                {
                    System.out.print(enemyPokeDex[0][4]+BattleField[i][j]);
                }
                else if(i==14)
                {
                    if(j==2)
                    {
                        System.out.print(playerPokemon);
                    }
                    else if(j==7)
                    {
                        System.out.print(PlayerPokeDex[playerPokeDexRowNumber][4]+BattleField[i][j]);
                    }  
                    else
                    {
                        System.out.print(BattleField[i][j]);
                    }
                }
                else if(i==15)
                {
                    if(j==8)
                    {
                        System.out.print(PlayerPokeDex[playerPokeDexRowNumber][3]+BattleField[i][j]);
                    }
                    else
                    {
                        System.out.print(BattleField[i][j]);
                    }
                }
                else
                {
                    System.out.print(BattleField[i][j]);
                }
            }
            System.out.println();
        }
        
        //check if enemy has been defeated
        if(enemy_hp<=0)
        {
            s=enemyPokemonName+" WAS DEFEATED BY YOUR "+playerPokemonName+"!";
            ob.displayline(s);
            ob1.map();
        }
        if(player_hp<=0)
        {
            s=playerPokemonName+" WAS DEFEATED BY YOUR ENEMY'S "+enemyPokemonName+"!";
            ob.displayline(s);
            ob1.map();
        }

        System.out.println(" ________________________________________________ ");
        System.out.println("|       1.FIGHT        |         2.BAG           |"); 
        System.out.println("|------------------------------------------------|");
        System.out.println("|      3.POKEMON       |         4.RUN           |");
        System.out.println("| _____________________|_________________________| ");

        System.out.print("ENTER CHOICE:");

        ob.actualFight();
    }

    public void actualFight() throws IOException
    {
        String s="";
        int choice=0,choice1=0;
        double enemy_move=(int)(10*Math.random());

        choice=Integer.parseInt(in.readLine());
        switch(choice)
        {
            case 1:         
            s="CHOOSE YOUR MOVE:";
            ob.displayline(s);
                                    
            System.out.println(" ________________________________________________ ");            
            System.out.print("|1."+PlayerPokeDex[playerPokeDexRowNumber][7]);
            for(int i=1;i<=20-(PlayerPokeDex[playerPokeDexRowNumber][7].length());i++)
            {
                 System.out.print(" ");              
            }
            System.out.print("|2."+PlayerPokeDex[playerPokeDexRowNumber][9]); 
            for(int i=1;i<=23-(PlayerPokeDex[playerPokeDexRowNumber][9].length());i++)
            {
                 System.out.print(" ");              
            }
            System.out.println("|");            
            System.out.println("|------------------------------------------------|");
            System.out.print("|3."+PlayerPokeDex[playerPokeDexRowNumber][11]);
            for(int i=1;i<=20-(PlayerPokeDex[playerPokeDexRowNumber][11].length());i++)
            {
                 System.out.print(" ");              
            }
            System.out.print("|4."+PlayerPokeDex[playerPokeDexRowNumber][13]);
            for(int i=1;i<=23-(PlayerPokeDex[playerPokeDexRowNumber][13].length());i++)
            {
                 System.out.print(" ");              
            }
            System.out.println("|");
            System.out.println("|______________________|_________________________| ");   
            
            System.out.print("ENTER CHOICE:");
            choice1=Integer.parseInt(in.readLine());
            switch(choice1)
            {
                case 1:
                if(player_attack_bonus_against.equals(enemyType))
                {
                    if((player_move1_attack+player_attack_bonus)>enemy_defense)
                    {
                        enemy_hp=enemy_hp-((player_move1_attack+player_attack_bonus)-enemy_defense);
                        enemyPokeDex[0][5]=String.valueOf(enemy_hp);
                        s=playerPokemonName+" USED "+player_move1+".";
                        ob.displayline(s);
                    }
                    else
                    {
                        s=playerPokemonName+"'s ATTACK HAS NO EFFECT ON "+enemyPokemonName+".";
                        ob.displayline(s);
                    }
                }
                else
                {
                    if(player_move1_attack>enemy_defense)
                    {
                        enemy_hp=enemy_hp-((player_move1_attack)-enemy_defense);
                        enemyPokeDex[0][5]=String.valueOf(enemy_hp);
                        s=playerPokemonName+" USED "+player_move1+".";
                        ob.displayline(s);
                    }
                    else
                    {
                        s=playerPokemonName+"'s ATTACK HAS NO EFFECT ON "+enemyPokemonName+".";
                        ob.displayline(s);
                    }
                }
                break;
                
                case 2:
                break;                                
            }
            
            break;

            case 2:
            break;

            case 3:
            break;

            case 4:            
            if(enemyPlayerType.equals("TRAINER"))
            {
                s="YOU CAN'T RUN AWAY FROM A TRAINER FIGHT!!";
                ob.displayline(s);
            }
            else
            {
                s="GOT AWAY SAFELY!";
                ob.displayline(s);
                ob1.map();
            }
            break;
        }               
        
        //enemy attacks
        if((enemy_move>=0 && enemy_move<5 ))
        {
            if(enemy_attack_bonus_against.equals(playerType))
                {
                    if((enemy_move1_attack+enemy_attack_bonus)>player_defense)
                    {
                        player_hp=player_hp-((enemy_move1_attack+enemy_attack_bonus)-player_defense);
                        PlayerPokeDex[playerPokeDexRowNumber][4]=String.valueOf(player_hp);
                        s=enemyPokemonName+" USED "+enemy_move1+".";
                        ob.displayline(s);
                    }
                    else
                    {
                        s=enemyPokemonName+"'s ATTACK HAS NO EFFECT ON "+playerPokemonName+".";
                        ob.displayline(s);
                    }
                }
                else
                {
                    if(enemy_move1_attack>player_defense)
                    {
                        player_hp=player_hp-((enemy_move1_attack)-player_defense);
                        PlayerPokeDex[playerPokeDexRowNumber][4]=String.valueOf(player_hp);
                        s=enemyPokemonName+" USED "+enemy_move1+".";
                        ob.displayline(s);
                    }
                    else
                    {
                        s=enemyPokemonName+"'s ATTACK HAS NO EFFECT ON "+playerPokemonName+".";
                        ob.displayline(s);
                    }
                }
        }
        if((enemy_move>=5 && enemy_move<=10))
        {
            
        }              

        ob.BattleFieldPrint(playerPokemonName,enemyPokemonName);
        
    }

    void displayline(String s)
    {        
        int l= s.length();
        for(int i=0;i<l;i++)
        {
            System.out.print(s.charAt(i));
            for(long j=0;j<=30000000;j++)
            {
            }
        }
        System.out.println();
        for(long i=0;i<=1000000000;i++)
        {
        }
    }
}