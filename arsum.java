class arsum{
     
    public static void main(String args[])
    {
        int[] arr=new int[] {10,20,30,40,50};
        int sum=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(arr[i]>max)
            {
                max=arr[i];
            }
            
        }
        System.out.println("The sum is:"+sum);
        System.out.println("the maximum no:"+max);
        
        
    }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  /*  
    
    
    
class Arsum {
    public static void main(String args[]) {
        int[] arr = new int[] {10, 20, 30, 40, 50}; // Correct array initialization
        int sum = 0;
        
        // Loop through the array and sum the elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        System.out.println(sum); // Output the sum
    }
}
*/
