import java.io.*;
import java.util.*;

public class Onlineshopping {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int pr[]=new int[3];
        int di[]=new int[3];
        int ship[]=new int[3];
        int amt[]=new int[3];
        int i;
        for(i=0;i<3;i++)
        {
            pr[i]=s.nextInt();
            di[i]=s.nextInt();
            ship[i]=s.nextInt();
        }
        for(i=0;i<3;i++)
        {
           amt[i]=(int)(pr[i]-(pr[i]*(di[i]*0.01)))+ship[i];
        }
        System.out.println("In Flipkart: Rs."+amt[0]+"\n"+"In Snapdeal: Rs."+amt[1]+"\n"+"In Amazon: Rs."+amt[2]);
            if(amt[0]<=amt[1] && amt[0]<=amt[2])
                System.out.println("Choose Flipkart");
            else if(amt[1]<=amt[2])
                System.out.println("Choose Snapdeal");
            else 
                System.out.println("Choose Amazon");
                  
    }
}