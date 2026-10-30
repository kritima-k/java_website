package additional_questions ;
public class Q22
{
public static void main(String[] args)
{
int arr[][]={
{ 3,6,9},
{12,15,18},
{21,24,27}   
};
System.out.println("two dimensional array elements are");
for(int i = 0;i<arr.length ;i++)
{
for(int j =0 ; j<arr[i].length;j++)  
{
System.out.print(arr[i][j] + " ");    
} 
System.out.println(); 
}    
}    
}