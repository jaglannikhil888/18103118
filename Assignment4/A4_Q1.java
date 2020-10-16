import java.util.*;

class Q1 {
	
	public static int replant(String[] crops){
	
		
		int count=0;
		
		char[][] crops_char_array = new char[crops.length][];
		for(int i=0;i<crops_char_array.length;i++)
		{
			crops_char_array[i] = new char[crops[i].length()];
			for(int j=0;j<crops[i].length();j++)
			{
				crops_char_array[i][j] = crops[i].charAt(j);
			}
		}
		
		
		for(int i=0;i<crops_char_array.length;i++)
		{
			for(int j=0;j<crops_char_array[i].length;j++)
			{
				
				//checked if left element or top element is same as the current element then current element changed
				if(j-1>=0 && i-1>=0)
				{
					if(crops_char_array[i][j-1] == crops_char_array[i][j] || crops_char_array[i-1][j] == crops_char_array[i][j])
					{
						//increased the count and changed the element
						count++;
						crops_char_array[i][j]='A';
					}
				}
				//checked if right element or bottom element is same as the current element then current element changed
				else if(j+1<crops[i].length() && i+1<crops_char_array.length)
				{
					if((crops_char_array[i][j] == crops_char_array[i+1][j]) && (crops_char_array[i][j] == crops_char_array[i][j+1]))
					{
						//increased the count and changed the element
						count++;
						crops_char_array[i][j]='A';
					}
				}
				else if(j-1>=0)
				{
					if(crops_char_array[i][j-1] == crops_char_array[i][j])
					{
						count++;
						crops_char_array[i][j]='A';
					}
				}
				else if(i-1>=0)
				{
					if(crops_char_array[i-1][j] == crops_char_array[i][j])
					{
						count++;
						crops_char_array[i][j]='A';
					}
				}
				
			}
		}

			return count;
		}
	
		public static void main(String[] args){
			
			int n;
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			in.nextLine();
			
			String[] crops = new String[n];
			
			for (int i=0;i<n;i++){
				crops[i]=in.nextLine().trim();
			}
		
			System.out.print(replant(crops));
		}

}