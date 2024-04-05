public class TestExceptions
{
        public static void main(String[] args) {
            
            int myArr[] = new int[10];
            int x, y, z;
            x = 0;
            y = 10;
        try{
            z = y/x;
        }
        catch(ArithmeticException e){
            System.err.println("Cannot divide a number by 0!");
        }
            
        try{
            myArr[10] = 0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index out of bounds!");
        }
        }
}