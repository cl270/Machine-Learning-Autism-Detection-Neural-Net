
public class sigmoidFunction {
	double output;
	
	sigmoidFunction(Object input){
		this.output = 1.0/(1.0+Math.pow(Math.E,(double)input));
	}
	
	public double getSig() {
		return this.output;
	}
}
