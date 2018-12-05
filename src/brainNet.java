
public class brainNet {
	
	private neuron[] inputlayer, layer1, layer2, outputlayer;
	dataReader rd;
	
	brainNet(String file){
		initialize();
		rd = new dataReader(file);
	}
	
	private static void initialize() {
		
	}
}
