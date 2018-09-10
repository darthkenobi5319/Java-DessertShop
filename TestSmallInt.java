import java.util.Scanner;

public class TestSmallInt{
	public static void main(String[] args) {
		Scanner input = null;
		String MAX = SmallInt.MAXVALUE + "";
		System.out.print("Enter an integer number between 0 and ");
		System.out.print(MAX);
		System.out.print(":\n");
		input = new Scanner (System.in);
		
		
		
		SmallInt newSmallInt = new SmallInt(input.nextInt());
		
		
		System.out.println("Print the Decimal Value:");
		System.out.println("" + newSmallInt.getDec());
		System.out.println("Print the Binary Value:");
		System.out.println(newSmallInt.getBin());
		System.out.println("Print the Hex Value:");
		System.out.println(newSmallInt.getHex());
		System.out.println("Test the sameValue method: should always return true with this input");
		System.out.println(newSmallInt.sameValue(newSmallInt.getHex(), newSmallInt.getBin()));
		
		input.close();
	}
}