
public class StringManipulator {
	public String trimAndConcat(String string, String anotherString) {
		return string.trim().concat(anotherString.trim());
	}
	
	public Integer getIndexOrNull(String input, char c) {
		if(input.indexOf(c) == -1) {
			return null;
		}
		return input.indexOf(c);
	}
	
	public Integer getIndexOrNull(String input, String sub) {
		if(input.indexOf(sub) == -1) {
			return null;
		}
		return input.indexOf(sub);
	}
	
	public String concatSubstring(String input, int first, int second, String replaced) {
		String substr;
		try{
			substr = input.substring(first, second);
		} catch(Exception e) {
			System.out.println(String.format("Exception caught: %s", e));
			substr = "Oops";
		}
		return substr.concat(replaced);
	}
}
