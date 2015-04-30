import java.util.Scanner; 

public class SerejaAndDima_381A {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int s = 0, d = 0, sIndex, eIndex;
		int n = in.nextInt();
		int [] array = new int [n];
		
		for(int i = 0; i <= n - 1; i++){
			array[i] = in.nextInt();
		}
		
		sIndex = 0;
		eIndex = n - 1;
		
		while(sIndex <= eIndex){
			int plus;
			if(array[sIndex] > array[eIndex]){
				plus = array[sIndex];
				sIndex += 1;
			}
			else{
				plus = array[eIndex];
				eIndex -= 1;
			}
			
			s += plus;
			
			if(sIndex > eIndex){
				break;
			}
			if(array[sIndex] > array[eIndex]){
				plus = array[sIndex];
				sIndex += 1;
			}
			else{
				plus = array[eIndex];
				eIndex -= 1;
			}
			
			d += plus;
		}
		
		System.out.println(s + " " + d);
	}

}
