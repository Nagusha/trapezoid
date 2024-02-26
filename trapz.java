import java.util.Scanner;
public class trapz {
        public static void main(String[] args) {
            // Given value
            int value = 10;
            // Given factor
            int h = 3;
            
            // Multiply the given value by h
            int result = multiplyByH(value, h);
            
            // Print the result
            System.out.println("Result of multiplying " + value + " by " + h + ": " + result);
        }
        
        public static int multiplyByH(int num, int h) {
            return num * h;
        }
    }
    
