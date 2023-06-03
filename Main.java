import java.util.Scanner;  
class Main{  
public static void main(String args[]){  
//int a[]={7,6,2,2,5,4,11,1};//declaration, instantiation and initialization  
//printing arr ]
  //reading the number of elements from the that we want to enter 
int n;  
Scanner sc=new Scanner(System.in); 
System.out.println("enter the length of array");
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
int temp;
  int i;
  int j;
  for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {  if(array[i]<array[j])
      {
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
      }

      
      }
       if(i==1)
       {  
           
       
        break;
       
       }
        }
  System.out.println("the second highest element is "+ array[i]);
  
}
}
 
