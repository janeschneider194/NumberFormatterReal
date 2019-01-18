import java.util.ArrayList;

public class BaseTwoFormatter implements NumberFormatter
{	
	int newNum;
	int num;
	public BaseTwoFormatter(int n)
	{
		this.newNum = n;
	}
	public String format(int n)
	 {
		String str = "";
		String newStr = "" + n;
		newNum = n;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		
		for(int a = 0; newNum > 0; a++)
		{
			num = newNum / 2;
			if(newNum - (num * 2) == 1)
				nums.add(1);
			else
				nums.add(0);
			
			newNum = num;
		}
		for(int i = nums.size()-1; i >= 0; i = i - 1)
		{
			str += "" + nums.get(i);
		}
		return str;
	 }
}
