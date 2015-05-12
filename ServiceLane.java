import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ServiceLane {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String segTc = input.nextLine();
		String[] segTcArray = segTc.split(" ");
		int segment = Integer.parseInt(segTcArray[0]);
		int testCaseNum = Integer.parseInt(segTcArray[1]);
		String[] width = input.nextLine().split(" ");
		int[] widthInt = new int[segment];
		for(int j = 0 ; j< segment ; j++){
			widthInt[j] = Integer.parseInt(width[j]);
		}
		int[] result = new int[testCaseNum];
		Arrays.fill(result,0);
		for(int i = 0 ; i < testCaseNum ; i++){
			String[] test = (input.nextLine()).split(" ");
			int initialSeg = Integer.parseInt(test[0]);
			int finalSeg = Integer.parseInt(test[1]);
			int[] segSection = new int[finalSeg - initialSeg + 1];
            int pointer = initialSeg;
            for (int j = 0 ; j < (finalSeg-initialSeg +1 ) ; j++){
                segSection[j] = widthInt[pointer];
                pointer++;
            }
			Arrays.sort(segSection);
            result[i] = segSection[0];
			}
			
	input.close();
for(int l = 0 ; l < testCaseNum ; l++){
	System.out.println(result[l]);
}
	}		
			
		}

