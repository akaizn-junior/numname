package number;

public class NumberName {

	
	public static String read(String numstr)
	{
		return read(Integer.parseInt(numstr));
	}

	public static String read(Integer num){
		
		if(num < 100)
		{
			return lessthan100(num);
		}else if(num < 1000){
			return lessthan1000(num);
		}else if(num < 10000){
			return lessthan10thousand(num);
		}else if(num < 100000){
			return lessthan100thousand(num);
		}else if(num < 1000000){
			return lessthanAmillion(num);
		}else if(num >= 1000000){
			return multipleOfmillion(num);
		}
		
		return null;
	}
	
	public static String romanname(){
		
		return "";
	}
	
	private static String lessthan1000(int num){
		int div = num / 100;
		int mod = num % 100;
		
		if(mod == 0 && div > 0)
		{
			return toString(div)+" hundred";
		}else{
			return toString(div)+" hundred "+lessthan100(mod);
		}
	}
	
	private static String lessthan10thousand(int num){
		int div = num / 1000;
		int mod = num % 1000;
		
		if(mod == 0)
		{
			return toString(div)+" thousand";
		}else if(mod < 100){
			return toString(div)+" thousand, "+lessthan100(mod);
		}else{
			return toString(div)+" thousand, "+lessthan1000(mod);
		}
	}
	
	private static String lessthan100thousand(int num){
		int div = num / 1000;
		int mod = num % 1000;
		
		if(mod == 0)
		{
			return lessthan100(div)+" thousand";
		}else if(mod < 100){
			return lessthan100(div)+" thousand, "+lessthan100(mod);
		}else if(mod < 1000){
			return lessthan100(div)+" thousand, "+lessthan1000(mod);
		}else{
			return lessthan100(div)+" thousand, "+lessthan10thousand(mod);
		}
	}
	
	private static String lessthanAmillion(int num){
		int div = num / 1000;
		int mod = num % 1000;
		
		if(mod == 0)
		{
			return lessthan1000(div)+" thousand";
		}else if(mod < 100){
			return lessthan1000(div)+" thousand, "+lessthan100(mod);
		}else if(mod < 1000){
			return lessthan1000(div)+" thousand, "+lessthan1000(mod);
		}else{
			return lessthan1000(div)+" thousand, "+lessthan10thousand(mod);
		}
	}
	
	private static String multipleOfmillion(int num){
		int div = num / 1000000;
		int mod = num % 1000000;
		
		if(mod == 0){
			if(div >= 100){
				return lessthan1000(div)+" million";
			}else{
				return lessthan100(div)+" million";
			}
		}else if(mod < 100){
			if(div >= 100){
				return lessthan1000(div)+" million "+lessthan100(mod);
			}else{
				return lessthan100(div)+" million "+lessthan100(mod);
			}
		}else if(mod < 1000){
			if(div >= 100){
				return lessthan1000(div)+" million "+lessthan1000(mod);
			}else{
				return lessthan100(div)+" million "+lessthan1000(mod);
			}
		}else if(mod < 10000){
			if(div >= 100){
				return lessthan1000(div)+" million "+lessthan10thousand(mod);
			}else{
				return lessthan100(div)+" million "+lessthan10thousand(mod);
			}
		}else if(mod < 100000){
			if(div >= 100){
				return lessthan1000(div)+" million "+lessthan100thousand(mod);
			}else{
				return lessthan100(div)+" million "+lessthan100thousand(mod);
			}
		}else{
			if(div >= 100){
				return lessthan1000(div)+" million "+lessthanAmillion(mod);
			}else{
				return lessthan100(div)+" million "+lessthanAmillion(mod);
			}
		}
	}
	
	private static String lessthan100(int num){
		int div = num / 10;
		int mod = num % 10;
		
		if(div < 2)
		{
			//0 - 19
			return toString(num);
		}else if(mod == 0)
		{
			//multiple of 10 - eg. 20, 30, 40
			return toString(num);
		}else if(mod > 0)
		{
			//multiple of 10 and rest - eg. 25, 47, 99
			return toString(num-mod)+"-"+toString(mod);
		}
		return null;
	}
	
	private static String toString(int num){
		
		String numStr = null;
		
		switch(num)
		{
			case 0 : numStr = "zero"; break;
			case 1 : numStr = "one"; break;
			case 2 : numStr = "two"; break;
			case 3 : numStr = "three"; break;
			case 4 : numStr = "four"; break;
			case 5 : numStr = "five"; break;
			case 6 : numStr = "six"; break;
			case 7 : numStr = "seven"; break;
			case 8 : numStr = "eight"; break;
			case 9 : numStr = "nine"; break;
			case 10 : numStr = "ten"; break;
			case 11 : numStr = "eleven"; break;
			case 12 : numStr = "twelve"; break;
			case 13 : numStr = "thirteen"; break;
			case 14 : numStr = "fourteen"; break;
			case 15 : numStr = "fifteen"; break;
			case 16 : numStr = "sixteen"; break;
			case 17 : numStr = "seventeen"; break;
			case 18 : numStr = "eighteen"; break;
			case 19 : numStr = "nineteen"; break;
			case 20 : numStr = "twenty"; break;
			case 30 : numStr = "thirty"; break;
			case 40 : numStr = "forty"; break;
			case 50 : numStr = "fifty"; break;
			case 60 : numStr = "sixty"; break;
			case 70 : numStr = "seventy"; break;
			case 80 : numStr = "eighty"; break;
			case 90 : numStr = "ninety"; break;
		}
		return numStr;
	}
	
	
}
