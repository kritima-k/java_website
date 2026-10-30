package additional_questions ;
public class Q21 
{
public static void main(String[] st)
{
int arr[] ={10,20,30,40,50};
int max = arr[0];
for(int i = 1 ; i< arr.length;i++)
{
if (arr[i]> max)
{
max = arr[i];

}    
}  

System.out.println("Largest element: " + max);  
}    
}