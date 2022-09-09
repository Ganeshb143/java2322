import java.util.Scanner;
public class operator
{
public static void main(String[] args )
{
System.out.print("Enter two numbers: \n");
Scanner obj= new Scanner(System.in);
double first = obj.nextDouble();
double second = obj.nextDouble();
System.out.print("Enter an operator (+, -, *, /): \n");
char operator = obj.next().charAt(0);
double result;
switch(operator)
{
case '+':
result = first + second;
break;
case '-':
result = first - second;
break;
case '*':
result = first * second;
break;
case '/':
result = first / second;
break;
default:
System.out.printf("Error!operator is not correct");
return;
}
System.out.printf("%.1f %c %.1f =%.1f", first, operator, second, result);
}
}