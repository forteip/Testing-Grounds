public class classic_light implements lights {
	int state = 0;

	public void lightswitch(int newstate){
		state = newstate;
	}
	void printState() {
		String state_text;
		if (state == 1) {
			state_text = "on";
		}
		else {
			state_text = "off";
		}
		
		System.out.println("The light is currently " + state_text);
	}

}