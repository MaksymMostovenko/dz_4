public class Main {
	    public static void main(String[] args) {
	        Value val = new Value(67);
	        System.out.println(decorateOuput(val.getValue()));
	    }
	    
	    public static String decorateOuput(String str) {
			return "~~~"+str+"~~~";
		}
}