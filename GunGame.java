import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.xml.transform.Result;
class name
{
    String p1,p2;
    public name()
    {}
    
    public name(String p1,String p2)
    {
        this.p1=p1;
        this.p2=p2;
        System.out.println("Player1 name is:"+p1);
        System.out.println("Player2 name is:"+p2);
    }

}
class weapon extends name
{
    int w;
    public weapon()
    {}
    public weapon(int w)
    {
        this.w=w;
     if(w==1)
        {
            System.out.println("Player select a Gun");
        }
        else if(w==2)
        {
            System.out.println("Player select a Sword");
        }
        else
        {
            System.out.println("Try Again");

        }
    }
}
 class  Attack extends weapon
 {
    static int x,y;
    public Attack()
    {}
    public Attack(int w,int x,int y)
    {
        this.w=w;
        this.x=x;
        this.y=y;
    }
    
    void display()
    {
        int i=1;
        
       while(x>0 && y>0){
       {
        if(i%2!=0){
        if(w==1)
        {
            y=y-20;
            System.out.println("Hit a gun redune health 20");
            System.out.println("Health:"+y);
            break;
        }
        else if(w==2)
        {
            y=y-10;
            System.out.println("Hit a Sword redune health 10");
            System.out.println(" Health:"+y);
            break;
        }
        i++;
        
        
       
    }
        else if(i%2==0)
        {
            if(w==1)
            {
                x=x-20;
                System.out.println("Hit a gun redune health 20");
                System.out.println("Health:"+x);
                break;
            }
                
            else if(w==2)
            {
                x=x-10;
                System.out.println("Hit a Sword redune health 10");
                System.out.println("Health:"+x);
                break;
            }
            i++;
        
           
        }
        
        }
        
    }

    }
    int health(int p)
    {
        return p;
    }
}
public class GunGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Gun Game");
        System.out.println("Select A Players Name");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select A Player 1 Name");
        String p1 = sc.nextLine();
        System.out.println("Select A Player 2 Name");
        String p2 = sc.nextLine();
        name n = new name(p1, p2);
        System.out.println("Start A Game");
        System.out.println("Players select a Weapons");
        System.out.println("1)Hit a gun redune health 20");
        System.out.println("2)Hit a Sword redune health 10");
        int i=1;
        int x=100,y=100;
        while(x>0 && y>0)
        {
        if(i%2!=0){
        System.out.println("Player 1 Attack");
        System.out.println("Select a Weapon");
        int w=sc.nextInt();
        weapon W= new weapon(w);
        Attack a= new Attack(w,x,y);
        a.display();
        int e=a.health(y);
        i++;
        }
        else if(i%2==0)
        {
            System.out.println("Player 2 Attack");
            System.out.println("Select a Weapon");
                int w=sc.nextInt();
                weapon W= new weapon(w);
                Attack a= new Attack(w,x,y);
                a.display();
                int e=a.health(x);
                i++;
        }
        

    }
    
}
    }

