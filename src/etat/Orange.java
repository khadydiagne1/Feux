package etat;

public class Orange extends FeuxDeSignalisation {

	
	
	public Orange(FeuxContext context) {
		super(context);
		
	}

	@Override
	public void Traitement() {
		State();	
    
	}

	@Override
	public void State() {
		
        Feux.orange.setText(String.valueOf(Feux.o));
        Feux.o--;
        Feux.rouge.setText(null);
        Feux.rouge.setEnabled(false);
        Feux.orange.setEnabled(true);
        
        
	}



}
