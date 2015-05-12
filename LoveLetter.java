import java.util.*;
public class LoveLetter {
	static void palindromeConversionCounter(int t, String[] palindrome)
	{
		int counter = 0 ;
		for(int i = 0 ; i <t ; i++)
		{
			char[] char_array = palindrome[i].toCharArray();
			counter = 0;
			for (int j = 0 ; j < (palindrome[i].length()/2);j++)
				
			{
				int last_position = (palindrome[i].length()-j-1);
				while(char_array[j] != char_array[last_position])
					
				{
					int first = (int)char_array[j];
					int last = (int)char_array[last_position];
					if (first > last)
					{
						first = (first - 1);
						char_array[j] = (char)first;
						counter++;
					}
					else
					{
						last = (last -1);
						char_array[last_position] = (char)last;
						counter++;
					}
					
				}
			}
			System.out.println(counter);			
		}
	}

	
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		String [] palindrome = new String[t];
		input.nextLine();
		for(int i = 0;i <t ; i++)
			palindrome[i] = input.nextLine();
		palindromeConversionCounter(t,palindrome);
		input.close();
			
	}
}
