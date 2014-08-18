package plane;

import java.util.ArrayList;
import java.util.LinkedList;


public class Airport {
	
	
	public static Plane buildPlane(PlaneType model){
		
		Plane plane = null;
		
		
		switch(model){
		
		case PASSANGER:
			plane = new PassangerPlane();
			break;
			
		case FREIGHT:
			plane = new FreighterPlane();
			break;
			default :
				
			
			
		}
		return plane;
		
		
	}
	
	
}
	
	
	
	
	
	

	/*	private ArrayList<Airliner> airliners;
		private ArrayList<Freighter> freighters;
		private static Airport instance;
		
		
		public static synchronized Airport getAirportInstance() {
			if (instance == null) {
				instance = new Airport();
			}
			return instance;

		}
		
		private Airport(){
			
		}

		public ArrayList<Freighter> getFreighters() {
			return freighters;
		}

		public void setFreighters(ArrayList<Freighter> freighters) {
			this.freighters = freighters;
		}

		public ArrayList<Airliner> getAirliners() {
			return airliners;
		}

		public void setAirliners(ArrayList<Airliner> airliners) {
			this.airliners = airliners;
		}
		*/
//}
