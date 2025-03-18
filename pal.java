class pal{
    public static void main(String args[])
    {
         int a=2132;
         int b=0;
         int p=1;
         while(a>0)
         {   int c=a%10;
             a=a/10;
             b=c+(b*p);
             p=10;
         }
         System.out.println(b);
         
    }



}
/*















class Pal {
    public static void main(String args[]) {
        int a = 213;    // original number to be reversed
        int b = 0;      // variable to store the reversed number
        int place = 1;  // represents the place value for each digit (1 for ones, 10 for tens, etc.)
        
        // Loop through each digit of 'a' and reverse it
        while (a > 0) {
            int c = a % 10;   // Get the last digit of 'a'
            a = a / 10;       // Remove the last digit from 'a'
            b = c + (b * place);  // Add the digit to 'b' based on its place value
            place = place * 10;    // Update the place value (1 -> 10 -> 100 ...)
        }
        
        // Output the reversed number
        System.out.println(b);  // Output: 312
    }
}
*/

