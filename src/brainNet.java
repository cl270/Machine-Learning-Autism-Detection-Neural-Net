import java.util.List;

public class brainNet {
	
	private List<neuron> inputlayer, layer1, outputlayer;
	dataReader rd;
	
	brainNet(String file){
		initialize();
		this.rd = new dataReader(file);
		this.rd.skipFluff();
	}
	
	private void initialize() {
		String[] s = rd.getCurrentLineData();
		
		for(int i = 0; i< 10; i++) {
			neuron n = new neuron(1,1);
			n.addInitialInput(Double.parseDouble(s[i]));
			inputlayer.add(n);
		}
		
		for(int i = 0; i< 10; i++) {
			neuron n = new neuron(1,1);
			n.addInitialInput(Double.parseDouble(s[i]));
			inputlayer.add(n);
		}
	}
}
