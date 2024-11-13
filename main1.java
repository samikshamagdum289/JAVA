import math.MathPackage;
import math.convert.ConvertPackage;

public class main1 {
    public static void main(String[] args) {
        // Testing mathematical operations
        System.out.println("Factorial of 5: " + MathPackage.factorial(5));
        System.out.println("Cube of 3: " + MathPackage.cube(3));
        
        // Testing conversions
        int decimal = 42;
        String binary = ConvertPackage.decimalToBinary(decimal);
        String octal = ConvertPackage.decimalToOctal(decimal);
        String hex = ConvertPackage.decimalToHex(decimal);
        
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hex: " + hex);
        
        int convertedDecimal = ConvertPackage.binaryToDecimal(binary);
        System.out.println("Converted Binary to Decimal: " + convertedDecimal);
    }
}
