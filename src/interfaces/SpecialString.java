package interfaces;

public abstract class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = funkifyText();
	}
	

	public String funkifyText(String s) {
		
		return null;
	}

	public String toString() {
		return s;
	}
}
