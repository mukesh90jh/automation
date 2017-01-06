package concepts.src.miscellaneous;
import java.util.Scanner;

public class AddDiagonal
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

System.out.print("Enter a 4 by 4 matrix row by row: ");
double[][] m = new double[3][3];

for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++)
m[i][j] = input.nextDouble();
}
System.out.print("Sum of the elements in the major diagonal is " +
sumMajorDiagonal(m));
}

public static int sumMajorDiagonal(double[][] m) {
int sum = 0;

for (int i = 0; i < m.length; i++) {
sum = (int)(sum + m[i][i]);
}
return sum;
}
}

