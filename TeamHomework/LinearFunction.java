public class LinearFunction {
	
	private double a = 0, b = 0, coefSecond = 0; 
	private boolean operation = false;
	
	public LinearFunction(){
		this.a = 0;
		this.b = 0;
		this.coefSecond = 0;
		this.operation = false;
	}
	
	public LinearFunction(double a, double b){
		this.a = a;
		this.b = b;
		this.coefSecond = 0;
		this.operation = true;
	}
	
	public LinearFunction(double a, double b, double coefSecond){
		this.a = a;
		this.b = b;
		this.coefSecond = coefSecond;
		this.operation = false;
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getCoefSecond(){
		return coefSecond;
	}
	
	public double findFunction(double x){
		if(this.operation == false){
			throw new java.lang.IllegalStateException();
		}
		return getA() * x + getB();
	}
	
	public LinearFunction moveFunction(double a){
		if(this.operation == false){
			throw new java.lang.IllegalStateException();
		}
		LinearFunction newFunc = new LinearFunction(getA(), getB() + a * getA()); 
		return newFunc;
		
	}
	public LinearFunction plus(LinearFunction g){
		if(this.operation == false || g.operation == false){
			throw new java.lang.IllegalStateException();
		}
		double coefA, coefB;
		coefA = getA() + g.getA();
		coefB = getB() + g.getB();
		LinearFunction newFunc = new LinearFunction(coefA, coefB);
		return newFunc;
	}
	
	public LinearFunction minus(LinearFunction g){
		if(this.operation == false || g.operation == false){
			throw new java.lang.IllegalStateException();
		}
		double coefA, coefB;
		coefA = getA() - g.getA();
		coefB = getB() - g.getB();
		LinearFunction newFunc = new LinearFunction(coefA, coefB);
		return newFunc;
	}
	
	public LinearFunction multiply(LinearFunction g){
		if(this.operation == false || g.operation == false){
			throw new java.lang.IllegalStateException();
		}
		double coefA, coefB, coefSecond;
		coefSecond = getA() * g.getA();
		coefA = getA() * g.getB() + getB() * g.getA();
		coefB = getB() * g.getB();
		LinearFunction newFunc = new LinearFunction(coefA, coefB, coefSecond);
		return newFunc;
	}
	
	public LinearFunction superpos(LinearFunction g){
		if(this.operation == false || g.operation == false){
			throw new java.lang.IllegalStateException();
		}
		double coefA, coefB;
		coefA = getA() * g.getA();
		coefB = getB() + getA() * g.getB();
		LinearFunction newFunc = new LinearFunction(coefA, coefB);
		return newFunc;
	}
	public void print(){
		char signFirst = '+';
		char signSecond = '+';
		double coefA = getA();
		double coefB = getB();
		double coefS = getCoefSecond();
		if(coefB < 0){
			coefB = -coefB;
			signFirst = '-';
		}
		if(coefS != 0){
			if(coefA < 0){
				coefA = -coefA;
				signSecond = '-';
			}
			System.out.println("y = " + coefS + "x^2 " + signSecond + " " + coefA + "x " + signFirst + " " + coefB);
		}
		else{
			System.out.println("y = " + coefA + "x " + signFirst + " " + coefB);
		}
	}

}
