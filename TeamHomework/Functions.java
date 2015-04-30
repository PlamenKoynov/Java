public class Functions {

	public static void main(String[] args) {
		try{
			LinearFunction first = new LinearFunction(1,1);
			LinearFunction second = new LinearFunction(-1,1);
			//second.print();
			LinearFunction result = new LinearFunction();
			result = first.plus(second);
			//result.print();
			//double find = second.findFunction(3);
			//System.out.println(find);
			FractionFunction firstFr = new FractionFunction(first, result);
			FractionFunction secondFr = new FractionFunction(second, first);
			//FractionFunction result = firstFr.move(3);
			result.print();
		}
		catch(java.lang.IllegalStateException ise){
			System.out.println("It is not linear!");
		}
		catch(java.lang.ArithmeticException ae){
			System.out.println("The divisor should not be 0!");
		}
	}

}
