package Session6_2;

public class ElectricBassGuitar extends StringedInstrument {
	public ElectricBassGuitar(){
		super.instName = "Electric Bass Guitar";
		super.numberOfStrings = 3;
	}
	
	@Override
    public void play(){
 		System.out.println("Playing "+super.instName);
 		System.out.println("No of strings in Electric Bass Guitar "+super.numberOfStrings);
    }
}
