package etat;

public class Rouge extends FeuxDeSignalisation {
	
	
	
	public Rouge(FeuxContext context) {
		super(context);
		
	}
    
	@Override
	public void Traitement() {
		State();
	}
	@Override
	public void State() {
		Feux.rouge.setText(String.valueOf(Feux.r));
        Feux.r--;
	}

}
