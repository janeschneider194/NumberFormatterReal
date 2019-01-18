import java.util.ArrayList;

public class DecimalFormatter implements NumberFormatter
{
	private String newStr;
	
	public DecimalFormatter(int n)
	{
		this.newStr = "" + n;
	}
	public String format(int n)
	 {
		String str = "";
		newStr = "" + n;
		ArrayList<Character> nums = new ArrayList<Character>();
		
		for(int i = 0; i < newStr.length(); i++)
		{
			nums.add(newStr.charAt(i));
		}
		for(int i = nums.size(); i >= 0; i = i - 3)
		{
			nums.add(i, '.');
		}
		for(int i = 0; i < nums.size(); i++)
		{
			str += "" + nums.get(i);
		}
		return str;
	 }
}
