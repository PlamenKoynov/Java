import java.util.Scanner; //вкарваме си скенерчето, че да може да четем от клавиатурата по - лесно
public class Forces {

	public static void main(String[] args) {//тука почва основната функция
		Scanner in = new Scanner(System.in);//in се казва порменливата, с която ще четем, насочваме входа към скенера
		
		try{
			byte numberOfPoints = in.nextByte();//това ни е броят на точките (n от условието)
			double [][] points = new double[numberOfPoints][2];//едно двумерно масивче, за да запазваме точките в него
			for(byte i = 0; i <= numberOfPoints - 1; i++){//цикъл за обхождане на всички точки
				points[i][0] = in.nextDouble();//вземаме х - компонентата на точката
				points[i][1] = in.nextDouble();//вземаме у - компонентата на точката
			}
			double [] angles = new double[numberOfPoints];//масивче за ъглите на силите
			short [] forces = new short[numberOfPoints];//масивче за големините на силите
			for(byte i = 0; i <= numberOfPoints - 1; i++){//обхождаме всяка точка
				angles[i] = in.nextDouble();//за всяка точка въвеждаме ъгъл на силата в тази точка
				forces[i] = in.nextShort();//и големина на силата
			}
			
			double sumOfForces = forces[0], last;//променливи за сумата от силите (в началото е първата сила) и сумата на силите преди да я променяме
			double firstAngle = angles[0];//ъгълът на първия вектор, който ще ни е първо рамо 
			double secondAngle, middleAngle;//ъгълът на втория вектор, който ще ни е второто рамо, както и ъгълът между двете сили 
			boolean swap = false;//флаг, за да видим дали разменяме първото и второто рамо
			for(int i = 1; i <= numberOfPoints - 1; i++){//обхождаме всяка точка
				secondAngle = angles[i];//ъгълът на втория вектор
				if(firstAngle < secondAngle){//проверяваме кой от двата ъгъла е по - голям
					double temp = firstAngle;//ако първият ъгъл е по - малък, разменяме ъглите
					firstAngle = secondAngle;
					secondAngle = temp;
					swap = true;//вдигаме флага, че сме ги сменили
				}
				middleAngle = 180 - (firstAngle - secondAngle);//изчисляваме ъгълът между двата вектора
				last = sumOfForces;//последната сума (преди промяната)
				sumOfForces = Math.sqrt(Math.pow(sumOfForces, 2) + Math.pow(forces[i], 2) - 2 * sumOfForces * forces[i] * Math.cos(Math.toRadians(middleAngle)));//косинусова теорема за изчислване на големината на равнодействащата
				if(!swap){//ако не сме разменяли рамена
					firstAngle = firstAngle + Math.asin((sumOfForces * Math.sin(Math.toRadians(middleAngle)) /  last));//изчисляваме ъгълът на равнодействащия вектор
				}
				else{
					firstAngle = firstAngle + Math.asin((last * Math.sin(Math.toRadians(middleAngle)) /  sumOfForces));
				}
				swap = false;//сваляме флага
			}
			System.out.printf("The sum of all forces is %.2fN\n", sumOfForces);//извеждаме големината на силата с 2 знака след запетаята
			findPoint(1.0, 1.0, (short)1, 0.0);//функцията на студент 2, само трябва да се оправи как се въвеждат точките
		}
		catch(java.util.InputMismatchException ime){//ако сме въвели нещо различно от число на входа
			System.err.println("Error!You should enter a number!");//извеждаме съобщение за грешка
		}
		catch(java.lang.IndexOutOfBoundsException ioob){//ако сме въвели число, което не може да е размер на масив (например 0, -213 и т.н)
			System.err.println("Error! Wrong number of points");
		}
		
	}
	
	private static void findPoint(double x, double y, short length, double angle){//функцията на студент 2
		double sideX, sideY;//координатите на втората точка
		sideY = y + length * Math.sin(Math.toRadians(angle));//синусова теорема, за да намерим с колко да съберем у
		sideX = x + length * Math.sin(Math.PI / 2 - Math.toRadians(angle));//синусова теорема, за да намерим с колко да съберем х
		System.out.println("The coordinates of the end point are (" + sideX + " ; " + sideY + ")");//извеждаме съобщение
	}

}
