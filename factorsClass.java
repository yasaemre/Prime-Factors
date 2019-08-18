package Lab2a;
public class factorsClass{	
public static int factors(int num)
{  
	
    factors(num, 2);
    
	return num;

} 


public static void factors(int num, int count)
{  
    if (num == 1)
        return;

    if((num%count)==0)
    {
        System.out.print(count);
        factors(num/count, count);
    }
    else 
        factors(num,count+1);
    }
}