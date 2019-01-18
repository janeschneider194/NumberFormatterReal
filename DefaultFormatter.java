import java.util.ArrayList;

public class DefaultFormatter implements NumberFormatter
{
	private String newStr;
	
	public DefaultFormatter(int a) 
	{
		this.newStr = "" + a;
	}
	public String format(int n)
	 {
		String str = "";
		newStr = "" + n;
		ArrayList<Character> nums = new ArrayList<Character>();
		//no array, substring
		for(int i = 0; i < newStr.length(); i++)
		{
			nums.add(newStr.charAt(i));
		}
		for(int i = nums.size()-3; i >= 0; i = i - 3)
		{
			nums.add(i, ',');
		}
		for(int i = 0; i < nums.size(); i++)
		{
			str += "" + nums.get(i);
		}
		return str;
	 }
}
