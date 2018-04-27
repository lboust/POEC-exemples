package hello;

public class Car {
	int capaciteReservoirEssence;
	int consommationEssencePar100Km;
	
	public double distanceMaximumTheorique() {
		
		return 1.0*100*capaciteReservoirEssence/consommationEssencePar100Km;
	}
	

}
