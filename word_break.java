import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public void wordBreak(String sentence,String[] dictionary,int n)
    {
        wordBreakUtil(sentence,dictionary,n,"");
    }
    
    public void wordBreakUtil(String sentence,String[] dictionary,int n,String result)
    {
        for(int j=1;j<=n;j++)
        {
            String prefix=sentence.substring(0,j);
            if(isDictionarryContain(prefix,dictionary))
            {
                
                if(j==n)
                {
                    result=result+prefix;
                    System.out.print("("+result+")");
                    return;
                }
                wordBreakUtil(sentence.substring(j,n),dictionary,n-j,result+prefix+" ");
            }
        }
    }
    private boolean isDictionarryContain(String prefix,String []dictionary)
    {
        for(int i=0;i<dictionary.length;i++)
        {
            if(prefix.equals(dictionary[i]))
                return true;
        }
        return false;
    }
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int test=sc.nextInt();
	    while(test>0)
	    {
	    GFG obj=new GFG(); 
	    int n=sc.nextInt();
	    String dictionary[]=new String[n];
	    for(int i=0;i<n;i++)
	        dictionary[i]=sc.next();
	    String sentence=sc.next();
	    obj.wordBreak(sentence,dictionary,sentence.length());
	    System.out.println();
	    test--;
	        
	    }
	 }
}
