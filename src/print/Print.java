package print;

import java.util.ArrayList;
import java.util.LinkedList;

import plane.Airliner;
import plane.Freighter;

public class Print {

	public Print(){	}
	
	public void getInfo(ArrayList<Airliner> airliners, ArrayList<Freighter> freighters){
		
		for (Airliner plane: airliners){
			System.out.println(plane.toString());
		}
		
		for (Freighter plane : freighters){
			System.out.println(plane.toString());
		}
	}
}
