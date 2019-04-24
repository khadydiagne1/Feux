package etat;

public class Vert extends FeuxDeSignalisation {
	
	
	public Vert(FeuxContext context) {
		super(context);
		
	}

	@Override
	public void Traitement() {
	
		State();
	}

	@Override
	public void State() {
		Feux.vert.setText(String.valueOf(Feux.v));
		Feux.v--;
		Feux.orange.setText(null);
		Feux.orange.setEnabled(false);
		Feux.vert.setEnabled(true);
	}

}
