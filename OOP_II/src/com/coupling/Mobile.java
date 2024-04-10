package com.coupling;

public class Mobile {
	private Network network;
	Mobile(Network network){
		this.network = network;
	}
	
	public String getServices(){
		return this.network.getSimName();
	}

}
