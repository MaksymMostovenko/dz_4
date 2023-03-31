public class Value {
	private int value;
	
	public Value(int value) {
        this.value = value;
    }

    public Value() {
		this.value = 42;
	}
	
	public String getValue() {
		return decorateValue();
	}
	
	public void printValue() {
		System.out.println(this.decorateValue());
	}
	
	private String decorateValue() {
		String sVal = "---<" + String.valueOf(this.value) + ">---";
		return sVal;
	}
}
