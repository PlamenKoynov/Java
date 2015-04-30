public class FractionFunction {
	
	private LinearFunction chislitel, znamenatel;
	
	//конструктор за дроб
	public FractionFunction(LinearFunction chislitel, LinearFunction znamenatel){
		if(znamenatel.getA() == 0 && znamenatel.getB() == 0){
			throw new java.lang.ArithmeticException();
		}
		this.chislitel = chislitel;
		this.znamenatel = znamenatel;
	}
	
	private LinearFunction getChislitel(){
		return chislitel;
	}
	
	private LinearFunction getZnamenatel(){
		return znamenatel;
	}
	
	//метод за събиране на дробни функции
	public FractionFunction sum(FractionFunction g){
		LinearFunction left = new LinearFunction();
		LinearFunction right = new LinearFunction();
		left = getChislitel().multiply(g.getZnamenatel());
		right = getZnamenatel().multiply(g.getChislitel());
		
		double coefA, coefB, coefC;
		coefA = left.getCoefSecond() + right.getCoefSecond();
		coefB = left.getA() + right.getA();
		coefC = left.getB() + right.getB();
		
		LinearFunction ch = new LinearFunction(coefB, coefC, coefA);
		LinearFunction zn = getZnamenatel().multiply(g.getZnamenatel());
		FractionFunction newFunc = new FractionFunction(ch, zn);
		return newFunc;
	}
	
	//метод за изваждане на дробни функции
	public FractionFunction diff(FractionFunction g){
		LinearFunction left = new LinearFunction();
		LinearFunction right = new LinearFunction();
		left = getChislitel().multiply(g.getZnamenatel());
		right = getZnamenatel().multiply(g.getChislitel());
		
		double coefA, coefB, coefC;
		coefA = left.getCoefSecond() - right.getCoefSecond();
		coefB = left.getA() - right.getA();
		coefC = left.getB() - right.getB();
		
		LinearFunction ch = new LinearFunction(coefB, coefC, coefA);
		LinearFunction zn = getZnamenatel().multiply(g.getZnamenatel());
		FractionFunction newFunc = new FractionFunction(ch, zn);
		return newFunc;
	}
	
	//метод за отместване на дробни функции
	public FractionFunction move(double a){
		LinearFunction ch = getChislitel();
		LinearFunction zn = getZnamenatel();
		ch = ch.moveFunction(a);
		zn = zn.moveFunction(a);
		FractionFunction newFunc = new FractionFunction(ch, zn);
		return newFunc;
	}
	
	//метод за принтиране на дробни функции
	public void print(){
		LinearFunction ch = getChislitel();
		LinearFunction zn = getZnamenatel();
		System.out.print("Chislitel: ");
		ch.print();
		System.out.print("Znamenatel: ");
		zn.print();
	}
}
