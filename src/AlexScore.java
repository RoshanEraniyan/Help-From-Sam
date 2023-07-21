import java.util.*;

class AlexScore
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        while(a!=1)
        {
            if(a%2==0)
            {
                a=a/2;
            }
            else
            {
                a=a-1;
                count++;
            }
        }
        System.out.println(count+1);
    }
}
