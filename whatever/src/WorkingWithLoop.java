
public class WorkingWithLoop {

	public static void main(String[] args) {
		int countLoop = 0;
		while(true) {
			System.out.println(countLoop);
			if(countLoop > 4) { 
				break;
			}
			countLoop ++;
		}
	}

}
