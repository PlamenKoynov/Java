import java.util.Scanner; //�������� �� ����������, �� �� ���� �� ����� �� ������������ �� - �����
public class Forces {

	public static void main(String[] args) {//���� ����� ��������� �������
		Scanner in = new Scanner(System.in);//in �� ����� ������������, � ����� �� �����, ��������� ����� ��� �������
		
		try{
			byte numberOfPoints = in.nextByte();//���� �� � ����� �� ������� (n �� ���������)
			double [][] points = new double[numberOfPoints][2];//���� �������� �������, �� �� ��������� ������� � ����
			for(byte i = 0; i <= numberOfPoints - 1; i++){//����� �� ��������� �� ������ �����
				points[i][0] = in.nextDouble();//������� � - ������������ �� �������
				points[i][1] = in.nextDouble();//������� � - ������������ �� �������
			}
			double [] angles = new double[numberOfPoints];//������� �� ������ �� ������
			short [] forces = new short[numberOfPoints];//������� �� ���������� �� ������
			for(byte i = 0; i <= numberOfPoints - 1; i++){//��������� ����� �����
				angles[i] = in.nextDouble();//�� ����� ����� ��������� ���� �� ������ � ���� �����
				forces[i] = in.nextShort();//� �������� �� ������
			}
			
			double sumOfForces = forces[0], last;//���������� �� ������ �� ������ (� �������� � ������� ����) � ������ �� ������ ����� �� � ���������
			double firstAngle = angles[0];//������ �� ������ ������, ����� �� �� � ����� ���� 
			double secondAngle, middleAngle;//������ �� ������ ������, ����� �� �� � ������� ����, ����� � ������ ����� ����� ���� 
			boolean swap = false;//����, �� �� ����� ���� ��������� ������� � ������� ����
			for(int i = 1; i <= numberOfPoints - 1; i++){//��������� ����� �����
				secondAngle = angles[i];//������ �� ������ ������
				if(firstAngle < secondAngle){//����������� ��� �� ����� ����� � �� - �����
					double temp = firstAngle;//��� ������� ���� � �� - �����, ��������� ������
					firstAngle = secondAngle;
					secondAngle = temp;
					swap = true;//������� �����, �� ��� �� �������
				}
				middleAngle = 180 - (firstAngle - secondAngle);//����������� ������ ����� ����� �������
				last = sumOfForces;//���������� ���� (����� ���������)
				sumOfForces = Math.sqrt(Math.pow(sumOfForces, 2) + Math.pow(forces[i], 2) - 2 * sumOfForces * forces[i] * Math.cos(Math.toRadians(middleAngle)));//���������� ������� �� ���������� �� ���������� �� ����������������
				if(!swap){//��� �� ��� ��������� ������
					firstAngle = firstAngle + Math.asin((sumOfForces * Math.sin(Math.toRadians(middleAngle)) /  last));//����������� ������ �� ��������������� ������
				}
				else{
					firstAngle = firstAngle + Math.asin((last * Math.sin(Math.toRadians(middleAngle)) /  sumOfForces));
				}
				swap = false;//������� �����
			}
			System.out.printf("The sum of all forces is %.2fN\n", sumOfForces);//��������� ���������� �� ������ � 2 ����� ���� ���������
			findPoint(1.0, 1.0, (short)1, 0.0);//��������� �� ������� 2, ���� ������ �� �� ������ ��� �� �������� �������
		}
		catch(java.util.InputMismatchException ime){//��� ��� ������ ���� �������� �� ����� �� �����
			System.err.println("Error!You should enter a number!");//��������� ��������� �� ������
		}
		catch(java.lang.IndexOutOfBoundsException ioob){//��� ��� ������ �����, ����� �� ���� �� � ������ �� ����� (�������� 0, -213 � �.�)
			System.err.println("Error! Wrong number of points");
		}
		
	}
	
	private static void findPoint(double x, double y, short length, double angle){//��������� �� ������� 2
		double sideX, sideY;//������������ �� ������� �����
		sideY = y + length * Math.sin(Math.toRadians(angle));//�������� �������, �� �� ������� � ����� �� ������� �
		sideX = x + length * Math.sin(Math.PI / 2 - Math.toRadians(angle));//�������� �������, �� �� ������� � ����� �� ������� �
		System.out.println("The coordinates of the end point are (" + sideX + " ; " + sideY + ")");//��������� ���������
	}

}
