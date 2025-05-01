import java.util.*;
public class Rockpapersis{


    /* ------------------------------Dual player logic---------------------------------------------- */
   public static void Dualplayer(){
    //input gathering part
    Scanner scan =new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    System.out.println(" Enter the Wining point:");
    int win=scan.nextInt();
    System.out.println();
    //mainn llogic
    int user1point=0;
    int user2point=0;
    while( user1point !=win && user2point !=win){
        System.out.println(" Enter the choice (rock/paper/Scissor) -User1 :");
        String user1=s.nextLine().toLowerCase();
    
        System.out.println(" Enter the choice (rock/paper/Scissor) -User2 :");
        String user2=s.nextLine().toLowerCase();
        if(user1.equals(user2)){
            System.out.println(".....tie no point!.....");
        }
        else if(user1.equals("rock")){
            if(user2.equals("paper")){
                user2point++;
                System.out.println("User 2 - Got a point \n user1 point : "+user1point+" \n user1 point : "+user2point);
            }
            else if(user2.equals("Scissor")){
                user1point++;
                System.out.println("User 1 - Got a point \n user1 point : "+user1point+" \n user2 point : "+user2point);
            }
            else{
                System.out.println("......Conform with your user 2 -spelling!........");
            }
        }
        else if(user1.equals("paper")){
            if(user2.equals("Scissor")){
                user2point++;
                System.out.println("User 2 - Got a point \n user1 point : "+user1point+" \n user1 point : "+user2point);
            }
            else if(user2.equals("rock")){
                user1point++;
                System.out.println("User 1 - Got a point \n user1 point : "+user1point+" \n user2 point : "+user2point);
            }
            else{
                System.out.println("......Conform with your user 2 -spelling!........");
            }
        }
        else if(user1.equals("Scissor")){
            if(user2.equals("rock")){
                user2point++;
                System.out.println("User 2 - Got a point \n user1 point : "+user1point+" \n user1 point : "+user2point);
            }
            else if(user2.equals("paper")){
                user1point++;
                System.out.println("User 1 - Got a point \n user1 point : "+user1point+" \n user2 point : "+user2point);
            }
            else{
                System.out.println("......Conform with your user 2 -spelling!........");
            }
        }
        else{
            System.out.println("......Conform with your user 1 and 2 -spelling!........");
        }
    }
    if(user1point==win){
        System.out.println("!!!!!!!!!!!!!! USER1 is the winner !!!!!!!!!!!!!!!!");
    }
    else{
        System.out.println("!!!!!!!!!!!!!! USER2 is the winner !!!!!!!!!!!!!!!!"); 
    }
   }
   /* -------------------------------------------------------------------------------------------- */

   /* ---------------------------------------with computer---------------------------------------- */
   public static void botplayer(){

    //input gathering part
    Scanner scan =new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    System.out.println(" Enter the Wining point:");
    int win=scan.nextInt();
    System.out.println();
    //mainn llogic
    int user1point=0;
    int user2point=0;
    while( user1point !=win && user2point !=win){
        System.out.println(" Enter the choice (rock/paper/Scissor) -User1 :");
        String user1=s.nextLine().toLowerCase();
        String computer[]={"rock","paper","Scissor"};
        Random random=new Random();
        int randindex=random.nextInt(computer.length);
        String user2=computer[randindex].toLowerCase();
        if(user1.equals(user2)){
            System.out.println(".....tie no point!.....");
        }
        else if(user1.equals("rock")){
            if(user2.equals("paper")){
                user2point++;
                System.out.println("User 2 - Got a point \n user1 point : "+user1point+" \n user1 point : "+user2point);
            }
            else if(user2.equals("Scissor")){
                user1point++;
                System.out.println("User 1 - Got a point \n user1 point : "+user1point+" \n user2 point : "+user2point);
            }
            else{
                System.out.println("......Conform with your user 2 -spelling!........");
            }
        }
        else if(user1.equals("paper")){
            if(user2.equals("Scissor")){
                user2point++;
                System.out.println("User 2 - Got a point \n user1 point : "+user1point+" \n user1 point : "+user2point);
            }
            else if(user2.equals("rock")){
                user1point++;
                System.out.println("User 1 - Got a point \n user1 point : "+user1point+" \n user2 point : "+user2point);
            }
            else{
                System.out.println("......Conform with your user 2 -spelling!........");
            }
        }
        else if(user1.equals("Scissor")){
            if(user2.equals("rock")){
                user2point++;
                System.out.println("User 2 - Got a point \n user1 point : "+user1point+" \n user1 point : "+user2point);
            }
            else if(user2.equals("paper")){
                user1point++;
                System.out.println("User 1 - Got a point \n user1 point : "+user1point+" \n user2 point : "+user2point);
            }
            else{
                System.out.println("......Conform with your user 2 -spelling!........");
            }
        }
        else{
            System.out.println("......Conform with your user 1 and 2 -spelling!........");
        }
    }
    if(user1point==win){
        System.out.println("!!!!!!!!!!!!!! USER1 is the winner !!!!!!!!!!!!!!!!");
    }
    else{
        System.out.println("!!!!!!!!!!!!!! computer is the winner !!!!!!!!!!!!!!!!"); 
    }
   }

   /*-------------------------------------------------------------------------------------------------*/

    public static void main(String args[]){
    System.out.println("...Please Enter you Mode : ( 1.dual / 2.single(with computer) :");
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();  
    switch (choice) {
        case 1:
           Dualplayer();
            break;
        case 2:
        botplayer();
        break;
        default:
           System.out.println("......please enter 1 or 2.you enter wrong one!...");
            break;
    }
    }
}