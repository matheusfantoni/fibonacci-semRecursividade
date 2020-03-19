
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        
        int a = 1;
        int b = 0;
        int aux;
        
        long tempo1 = System.currentTimeMillis();
        
        System.out.println("Tempo inicial = " + tempo1);
        
        for (int i = 0; i < 5000000; i++){
            
            System.out.println(a);
            aux = a;
            a += b;
            b = aux;
            
        }
        
        
        long tempo2 = System.currentTimeMillis();
        System.out.println("Tempo final = " + tempo2);
        
        System.out.println(tempo2 - tempo1);
        
    }
    
}
