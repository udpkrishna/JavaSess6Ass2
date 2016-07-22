package Session6_2;

public class ElectricGuitar extends StringedInstrument {
	public ElectricGuitar(){
		super.instName = "Electric Guitar";
		super.numberOfStrings = 4;
	}
	
	@Override
    public void play(){
 		System.out.println("Playing "+super.instName);
 		System.out.println("No of strings in Electric Guitar "+super.numberOfStrings);
    }
}
