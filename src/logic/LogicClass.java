package logic;

import java.util.ArrayList;
import java.util.LinkedList;

import plane.*;

public class LogicClass {

	
		private TreeSetWithComparator comparator;
		
		
		public void findPlanesByFuel(ArrayList<Airliner> airliners, ArrayList<Freighter> freighters, 
											int lowValue, int highValue){
					
			for(Airliner airliner: airliners){
				
				if ((airliner.getFuelConsumption()>=lowValue)&&(airliner.getFuelConsumption()<=highValue)){
					System.out.println("Name "+airliner.getName()+" Fuel Consumption: "+airliner.getFuelConsumption());
				}
			}
			
			for(Freighter freighter: freighters){
				
				if ((freighter.getFuelConsumption()>=lowValue)&&(freighter.getFuelConsumption()<=highValue)){
					System.out.println("Name "+freighter.getName()+" Fuel Consumption: "+freighter.getFuelConsumption());
				}
			}
											
		}
		
		public void sortAirliners(ArrayList<Airliner> airliners){
			comparator = new TreeSetWithComparator();
			comparator.sortAirliner(airliners);
		}
		
		public void sortFreighters(ArrayList<Freighter> freighters){
			comparator=new TreeSetWithComparator();
			comparator.sorFreighter(freighters);
		}
		
		public void capacitySeating(ArrayList<Airliner> airliners,
				ArrayList<Freighter> freighters){
			int capacity=0;
			int seating=0;
			
			for (Airliner airliner: airliners){
				seating+=airliner.getSeating();
			}
			
			for (Freighter freighter: freighters){
				capacity+=freighter.getCapacity();
			}
			
			System.out.println("Total seating: "+ seating+" Total capacity: "+ capacity);
		}
		
		public int seating(ArrayList<Airliner> airliners){
			int seating = 0;
			
			for (Airliner airliner: airliners){
				seating+=airliner.getSeating();
			}
			return seating;
		}
		
		public int capacity(ArrayList<Freighter> freighters){
			int capacity =0;
			
			for (Freighter freighter: freighters){
				capacity+=freighter.getCapacity();
			}
			return capacity;
		}
}
