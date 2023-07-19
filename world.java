// package GAMES;


/*# INDEX
g = grass 
r = road
b = blocked
l = lake
pl= pokecentre lake 
m = man
S = SHARVAI
n = nurse Neha (at pokecentre)
p = pokecentre door
l = lab door*/

import java.io.*;
public class world
{
    static InputStreamReader read= new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);

    static String World[][]={{",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,_","_,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,_","_,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,_","_,,",",,,",",,,",",,,",",?,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,_","___","___","___","___","___","___",",__","__,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,","|~~","~~~","~~|","___","|P.","C.|",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,","|~~","~~~","~~|","___","|_I","I_|",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,","|~~","~~~","~~|","___","___","___","___",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,","___",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,","___","___","___","___",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,","___","| L"," A ","B |",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,","___","|__","I I","__|",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,","___","___","___",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"},
            {",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,",",,,"}};

    static String Thing_World[][]={{"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","r","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","r","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","r","g","g","g","S","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","r","r","r","r","r","r","b","b","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","pl","pl","pl","r","b","b","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","pl","pl","pl","r","p","p","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","pl","pl","pl","r","r","r","r","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","r","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","r","b","b","b","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","r","b","b","b","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","r","b","l","b","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","r","r","r","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"},
            {"g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g","g"}};

    static String P_C[][]={{"___","___","___","P O"," K ","E C"," E ","N T"," R ","E__","___","___"}, 
            {"|__","___","___","|__","___","___","___","__|","___","___","___","__|"},
            {"|__","___","___","|__","___","_?_","___","__|","___","___","___","__|"},
            {"|__","___","___","|--","---","---","---","--|","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","I_I","___","___","___","___","___","__|"}};

    static String Thing_P_C[][]={{"___","___","___","P O"," K ","E C"," E ","N T"," R ","E__","___","___"}, 
            {"|__","___","___","b","___","___","___","b","___","___","___","__|"},
            {"|__","___","___","b","___","n","___","b","___","___","___","__|"},
            {"|__","___","___","b","b","b","b","b","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","I_I","___","___","___","___","___","__|"}};
            
    static String LAB_BIRCH[][]={{"___","___","___","___","_L_","_A_","_B_","___","___","___","___","___"}, 
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","_I "," I_","___","__|"},
            {"|__","___","___","___","___","___","___","___","_I_","_I_","___","__|"},
            {"|__","|II","II|","___","___","_?_","___","___","___","___","___","__|"},
            {"|__","|II","II|","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","I_I","___","___","___","___","___","__|"}};

    static String Thing_LAB[][]={{"___","___","___","___","_L_","_A_","_B_","___","___","___","___","___"}, 
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___", "b" , "b" ,"___","__|"},
            {"|__","___","___","___","___","___","___","___", "b" , "b" ,"___","__|"},
            {"|__", "b" , "b" ,"___","___","___","___","___","___","___","___","__|"},
            {"|__", "b" , "b" ,"___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","___","___","___","___","___","___","__|"},
            {"|__","___","___","___","___","I_I","___","___","___","___","___","__|"}};

    //current x and y coordinate in world map
    static int posX=0; 
    static int posY=0;

    static int pokecenter_entered=0;

    //current loction
    static String location="map";

    //pokecentre movement variables
    static int pc_x=5;
    static int pc_y=10;

    //speaker
    static boolean speaker_present=false;
    static String speaker="";

    //objectives
    static int objective_number=1;
    static String objectives[]={"Meet SHARVAI standing near the lake, near the Pokecentre.",
            "Go and checkout the Pokecentre.",
            "Go and meet SHARVAI again and get your next objective.",
            "Go and meet Professor Birch.",
            "Go and fight a battle with SHARVAI!",
            "Go to Parab Ville and deliver the medicine given by SHARVAI to Vidit."};    

    //object
    static world ob = new world();
    static Pokemon ob1 = new Pokemon();
    //static Fight ob2 = new Fight();

    public static void main(String args[])throws IOException
    {
        if(location.equals("map"))
        {
            ob.map();     
        }
        else if(location.equals("pokecentre"))
        {
            ob.pokecentre();
        }
        else if(location.equals("lab_BIRCH"))
        {
            ob.lab_BIRCH();
        }
    }

    public void move()throws IOException
    {
        int n;//reads which key is pressed         

        System.out.println("If you want to interact, press 1.");
        System.out.println("If you want view current objective, press 3.");
        System.out.println();
        System.out.println("Do you want to move?");
        System.out.println("Format is this:");
        System.out.println(" ___________        ___________      ");
        System.out.println("|___|_8_|___|      |___|_^_|___|     ");
        System.out.println("|_4_|_0_|_6_|      |_<_|_X_|_>_|     ");
        System.out.println("|___|_2_|___|      |___|_V_|___|     ");
        System.out.println();
        System.out.print("ACTION-->");               

        n=Integer.parseInt(in.readLine()); 
        if(location.equals("map"))
        {
            //interaction
            if(n==1)
            {
                //first check if there is a person/thing to be interacted with...
                if(Thing_World[posY+6][posX+5].equals("S")==true || Thing_World[posY+6][posX+7].equals("S")==true || Thing_World[posY+5][posX+6].equals("S")==true || Thing_World[posY+7][posX+6].equals("S")==true )
                {                    
                    System.out.print("SHARVAI : ");
                    ob.talk_SHARVAI();
                    if(objective_number==1)
                    {
                        objective_number=2;
                    }
                    if(objective_number==3)
                    {
                        objective_number=4;
                    }
                    if(objective_number==5)
                    {
                        objective_number=6;
                    }
                }
                //now check if there is a lake around 
                if(Thing_World[posY+6][posX+5].equals("pl")==true || Thing_World[posY+6][posX+7].equals("pl")==true || Thing_World[posY+5][posX+6].equals("pl")==true || Thing_World[posY+7][posX+6].equals("pl")==true )
                {
                    System.out.print("COMMENTRY : ");
                    ob.pc_lake_talk();
                }

            }

            //objectives
            if(n==3)
            {
                String s=objectives[objective_number-1];
                ob.displayline(s);
            }

            //movement
            if(n==4 && posX!=0 && /*blocked by wall,etc-->*/Thing_World[posY+6][posX+5].equals("b")==false && /*blocked by water-->*/Thing_World[posY+6][posX+5].equals("pl")==false && /*blocked by man-->*/Thing_World[posY+6][posX+5].equals("m")==false && /*blocked by SHARVAI-->*/Thing_World[posY+6][posX+5].equals("S")==false)
            {
                posX-=1;
            }
            if(n==6 && posX!=World[0].length-13 && /*blocked by wall,etc-->*/Thing_World[posY+6][posX+7].equals("b")==false && /*blocked by water-->*/Thing_World[posY+6][posX+7].equals("pl")==false && /*blocked by man-->*/Thing_World[posY+6][posX+7].equals("m")==false && /*blocked by SHARVAI-->*/Thing_World[posY+6][posX+7].equals("S")==false)
            {
                posX+=1;
            }
            if(n==8 && posY!=0 && /*blocked by wall,etc-->*/Thing_World[posY+5][posX+6].equals("b")==false && /*blocked by water-->*/Thing_World[posY+5][posX+6].equals("pl")==false && /*blocked by man-->*/Thing_World[posY+5][posX+6].equals("m")==false && /*blocked by SHARVAI-->*/Thing_World[posY+5][posX+6].equals("S")==false)
            {
                posY-=1;
            }
            if(n==2 && posY!=World.length-13 && /*blocked by wall,etc-->*/Thing_World[posY+7][posX+6].equals("b")==false && /*blocked by water-->*/Thing_World[posY+7][posX+6].equals("pl")==false && /*blocked by man-->*/Thing_World[posY+7][posX+6].equals("m")==false && /*blocked by SHARVAI-->*/Thing_World[posY+7][posX+6].equals("S")==false)
            {
                posY+=1;
            }
            if(n==0)
            {
                System.exit(0);
            }
            ob.map();
        }
        else if(location.equals("pokecentre"))
        {
            //interaction
            if(n==1)
            {
                //first check if there is a person/thing to be interacted with...
                if((pc_x==5 && pc_y==4))
                {                    
                    System.out.print("NURSE : ");
                    ob.talk_nurse();
                    if(objective_number==2)
                    {
                        objective_number=3;
                    }
                }
            }

            //movement
            if(n==4 && pc_x!=0 && Thing_P_C[pc_y][pc_x-1].equals("b")==false)
            {
                pc_x-=1;
            }
            if(n==6 && pc_x!=11 && Thing_P_C[pc_y][pc_x+1].equals("b")==false)
            {
                pc_x+=1;
            }
            if(n==8 && pc_y!=1 && Thing_P_C[pc_y-1][pc_x].equals("b")==false)
            {
                pc_y-=1;
            }
            if(n==2 && pc_y!=11 && Thing_P_C[pc_y+1][pc_x].equals("b")==false)
            {
                pc_y+=1;
            }
            ob.pokecentre();
        }
        else if(location.equals("lab_BIRCH"))
        {
            //interaction
            if(n==1)
            {
                //first check if there is a person/thing to be interacted with...
                if((pc_x==5 && pc_y==6) || (pc_x==4 && pc_y==5) || (pc_x==6 && pc_y==5) || (pc_x==5 && pc_y==4))
                {                    
                    //System.out.print("BIRCH : ");
                    ob.talk_Birch();
                    if(objective_number==4)
                    {
                        objective_number=5;
                    }
                }
            }

            //movement
            if(n==4 && pc_x!=0 && Thing_LAB[pc_y][pc_x-1].equals("b")==false)
            {
                pc_x-=1;
            }
            if(n==6 && pc_x!=11 && Thing_LAB[pc_y][pc_x+1].equals("b")==false)
            {
                pc_x+=1;
            }
            if(n==8 && pc_y!=1 && Thing_LAB[pc_y-1][pc_x].equals("b")==false)
            {
                pc_y-=1;
            }
            if(n==2 && pc_y!=11 && Thing_LAB[pc_y+1][pc_x].equals("b")==false)
            {
                pc_y+=1;
            }
            ob.lab_BIRCH();
        }
    }

    public void map()throws IOException
    {
        System.out.println("\f");

        //reinitialisation of poke centre variables
        pc_x=5;
        pc_y=10;

        location="map";

        if((posX>=0 && posX<=10) && (posY>=0 && posY<=10))
        {
            System.out.println("           LITTLE ROOT TOWN            ");
        }
        if((posX>10) || (posY>10))//there needs to be change here
        {
            System.out.println("            THE GRASSLANDS            ");
        }
        System.out.println("---------------------------------------");

        for(int i=posY;i<=posY+12;i++)
        {
            for(int j=posX;j<=posX+12;j++)
            {                
                if(i==posY+6  && j==posX+6)
                {                    
                    if(Thing_World[i][j].equals("g"))
                    {
                        System.out.print(",?,");
                    }
                    if(Thing_World[i][j].equals("r"))
                    {
                        System.out.print("_?_");
                    }
                    if(Thing_World[i][j].equals("p"))
                    {
                        ob.pokecentre();
                    }
                    if(Thing_World[i][j].equals("l"))
                    {
                        ob.lab_BIRCH();
                    }
                }
                else                
                {
                    System.out.print(World[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");

        ob.move();  
    }

    public void pokecentre()throws IOException
    {
        System.out.println("\f");

        location="pokecentre";

        for(int i=0;i<12;i++)
        {
            for(int j=0;j<12;j++)
            { 
                if(i==pc_y  && j==pc_x)
                {
                    if(pc_y==11 && pc_x==5)
                    {
                        posY+=1;
                        ob.map();
                    }                    
                    else if(pc_x==0)
                    {
                        System.out.print("|?_"); 
                    }
                    else if(pc_x==11)
                    {
                        System.out.print("_?|"); 
                    }
                    else
                    {
                        System.out.print("_?_"); 
                    }
                }
                else
                {
                    System.out.print(P_C[i][j]);
                }
            }
            System.out.println();
        }

        ob.move();
    }
    
    public void lab_BIRCH()throws IOException
    {        
        System.out.println("\f");

        location = "lab_BIRCH";
        
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<12;j++)
            { 
                if(i==pc_y  && j==pc_x)
                {
                    if(pc_y==11 && pc_x==5)
                    {
                        posY+=1;
                        ob.map();
                    }                    
                    else if(pc_x==0)
                    {
                        System.out.print("|?_"); 
                    }
                    else if(pc_x==11)
                    {
                        System.out.print("_?|"); 
                    }
                    else
                    {
                        System.out.print("_?_"); 
                    }
                }
                else
                {
                    System.out.print(LAB_BIRCH[i][j]);
                }
            }
            System.out.println();
        }

        ob.move();
    }

    public void talk_SHARVAI()throws IOException
    {
        if(objective_number==1)
        {
            String s="\"Hi! My name is SHARVAI OPTIMUS MAXIMUS........ but you can call me NAPOLEON!";
            ob.displayline(s);

            s="This is the world of Pokemon!";
            ob.displayline(s);

            s="The thing that you see to our right is a PokeCentre.";
            ob.displayline(s);

            s="Its a place where trainers like you and me take their Pokemon to rest them.";
            ob.displayline(s);

            s="Go and check it out! I'll meet you later!\"";
            ob.displayline(s);
        }
        if(objective_number==3)
        {
            String s="\"You've checked the PokeCentre out?";
            ob.displayline(s);

            s="Well go and checkout Dr.Birch in his lab.";
            ob.displayline(s);            
        }
        if(objective_number==5)
        {
            String s="\"Hi! You've talked to Dr.Birch? Great!";
            ob.displayline(s);

            s="Oh... so you've come to fight a match with me?!";
            ob.displayline(s);        
            
            s="He he he! Let's do it!\"";
            ob.displayline(s);             
            
            ob1.fightSharvai1();
        }
    }
    
    public void talk_Birch()throws IOException
    {
        if(objective_number==4)
        {
            String s="BIRCH : \"Hi! My name is Professor Birch and welcome to my lab!";
            ob.displayline(s);

            s="I do a lot of research on pokemon!";
            ob.displayline(s);

            s="Your very own pokemon journey is about to begin!! So sit tight and bracce yourself!!";
            ob.displayline(s);

            s="I have found out, in my research that is, that there are over 700 different kinds of Pokemon in this world!!";
            ob.displayline(s);

            s="I have captured these 4 starter Pokemon from different regions.";
            ob.displayline(s);
            
            s="You need to choose one of these pokemon... but choose wisely since your starter pokemon is very important!";
            ob.displayline(s);
            
            s="Here are the choices.\nCHOICES:";
            ob.displayline(s);
            
            s="1.BULBASAUR.";
            ob.displayline(s);
            
            s="2.CHICKORITA.";
            ob.displayline(s);
            
            s="3.SQUIRTLE.";
            ob.displayline(s);
            
            s="4.TOTODILE.\"";
            ob.displayline(s);
            
            ob1.receive_pokemon_Birch();
            
            s="BIRCH : \"Hmm... Interesting choice.";
            ob.displayline(s);
            
            s="Now that you have your first pokemon with you, you might as well take this.\"";
            ob.displayline(s);
            
            s="COMMENTARY : You received the POKEDEX!";
            ob.displayline(s);
            
            ob1.receive_pokedex_Birch();
            
            s="BIRCH : \"Wait don't run, you need these to capture those pokemon out there!!\"";
            ob.displayline(s);
            
            s="COMMENTARY : You received 5 POKEBALLS.";
            ob.displayline(s);
            
            ob1.receive_pokeballs_Birch();
            
            s="BIRCH : \"Go now! The World is ready to face you.\"";
            ob.displayline(s);
        }
        if(objective_number!=4)
        {
            String s="COMMENTARY : Dr.Birch seems to be busy!";
            ob.displayline(s);

            s="Better get going.";
            ob.displayline(s);            
        }
    }
    
    public void talk_nurse()throws IOException
    {
        int choice=0;

        String s="\"Hello! Welcome to the Pokecentre!";
        ob.displayline(s);

        s="Here, we rest your pokemon so that their strength is regained.";
        ob.displayline(s);

        s="Would you like to rest your pokemon?";
        ob.displayline(s);

        s="Enter 1 if you want to else, press 0.";
        ob.displayline(s);

        System.out.print("CHOICE-->");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            s="This won't take more than a few moments!";
            ob.displayline(s);

            s=".....................................";
            ob.displayline(s);

            s="Done! Your pokemon are completely restored.";
            ob.displayline(s);

            s="Thank you! Hope to see you next time! Bye!";
            ob.displayline(s);
        }
        else
        {
            s="Oh. Well.... see you next time!";
            ob.displayline(s);
        }

    }

    public void pc_lake_talk()throws IOException
    {
        String s="\"Its a beautiful lake.";
        ob.displayline(s);

        s="But you can't swim in it as it seems to being managed by the pokecentre.\"";
        ob.displayline(s);       

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