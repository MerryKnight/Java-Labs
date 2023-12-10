
import java.io.Serializable;
public class Main
{
    public static void main(String[] args){
        GenericClass<Integer, Dog, String> myObject = new GenericClass<>(10, new Dog(), "Hello");
        myObject.printnames();

        Integer[] intArray = {101,2,3,5,1};
        MinMax<Integer> minMax = new MinMax<>(intArray);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());
        System.out.println();
        int num1 = 11;
        double num2 = 6.5;
        System.out.println(num1 + " " + num2);
        System.out.println("Sum: " + Calculator.sum(num1, num2));
        System.out.println("Multiplication: " + Calculator.multiply(num1, num2));
        System.out.println("Division: " + Calculator.divide(num1, num2));
        System.out.println("Subtraction: " + Calculator.subtract(num1, num2));

        Integer[][] intMatrix = {{1, 2, 4}, {4, 6, 6}, {7, 3, 9}};
        Matrix<Integer> matrix = new Matrix<>(intMatrix);
        matrix.printMatrix();
    }
    
}
