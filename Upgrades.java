package fedoraclicker;

import java.util.ArrayList;

public class Upgrades {
	public ArrayList<Boolean> upList= new ArrayList<Boolean>();

	Upgrades(){
		for(int i=0; i<10;i++)
			upList.add(false);
	}
	
	boolean get (int n){
		boolean val = false;
		val = upList.get(n);
		return val;
	}
	
	void set (int up, boolean val){
		upList.set(up, val);
	}
}

// 0 = "Stylish Trilby"
// 1 = Top Hat That 