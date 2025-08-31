import java.util.Scanner;
class Solution 
{
    public static void pushZerosToEnd(int[] arr) 
    {
        int index=0;
        for(int i=0; i<arr.length ; i++)
        {
            if(arr[i]!=0)
            {
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length)
        {
            arr[index++]=0;
        }
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++)
        {
            arr[i]=obj.nextInt();
        }
        pushZerosToEnd( arr);
        for(int num : arr)
        {
            System.out.print(num+" ");
        }
        obj.close();
    }
}
