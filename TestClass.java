import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] )
    {
        // //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //             // Reading input from STDIN
        // int n=Integer.parseInt(br.readLine());
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<a.length;i++)
        {
           
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            int r=0;
            int k=a[i];
            for(int j=i;j<a.length;j++)
            {
                if(a[j]==k)
                {
                    r++;
                }
            }
            if(r>1)
            {
                c++;
            }
        }
        System.out.println(c);    // Writing output to STDOUT
    }
}
