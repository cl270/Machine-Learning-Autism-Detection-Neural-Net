
public class sigmoidFunction {
	double output;
	
	//Abstracts the range of real numbers to between 0 and 1
	sigmoidFunction(Object input){
		this.output = 1.0/(1.0+Math.pow(Math.E,(double)input));
	}
	
	public double getSig() {
		return this.output;
	}
}
