public class TestExceptionsNoTry
{
        public static void main(String[] args) {
            
            int myArr[] = new int[10];
            int x, y, z;
            x = 0;
            y = 10;
        
        if (x!=0){
            z = y/x;
        }
        else{
            System.err.println("Cannot divide a number by 0!");
        }
            
        int i = 10;
        if (i>=0 && i<=9){
            myArr[i] = 0;
        }
        else{
            System.err.println("Index out of bounds!");
        }
        }
}