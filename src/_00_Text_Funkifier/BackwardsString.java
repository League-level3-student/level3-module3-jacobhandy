package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		StringBuilder x = new StringBuilder();
		x.append(s);
		x = x.reverse();
		s = x.toString();
		return s;
	}

}
