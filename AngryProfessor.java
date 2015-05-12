import java.util.*;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		String[] stickStr = (input.nextLine()).split(" ");
		int[] stick = new int[N];
		for (int i = 0; i < N; i++) {
			stick[i] = Integer.parseInt(stickStr[i]);

		}
		Arrays.sort(stick);
		int subtractVal = stick[0];
		int subtractValNext = 0;
		int count = 0;
		while(subtractVal!=0){
		for(int i = 0 ; i < N ; i++){
			if(stick[i]!=0){
		stick[i] = stick[i]-subtractVal;
		count++;
			}
		if(stick[i]==0 && i < (N-1)){
			subtractValNext = stick[i+1]-subtractVal;
		}else if(stick[i]==0 && i == N-1){
			subtractVal = 0;
			subtractValNext = 0;
			
		}
		}
		System.out.println(count);
		count = 0;
	    subtractVal = subtractValNext;
		}
		input.close();
	}

}
