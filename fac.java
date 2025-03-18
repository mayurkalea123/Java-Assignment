public class fac{

  
    public int fa(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * fa(n - 1)); 
        }
    }

    public static void main(String[] args) {
        fac obj = new fac(); 
        System.out.println("Factorial of 5 is: " + obj.fa(5)); 
    
}}

