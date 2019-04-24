package etat;

public abstract class FeuxDeSignalisation {
	private FeuxContext context ;


	public FeuxDeSignalisation(FeuxContext context) {
		super();
		this.context = context;
	}
	
	
	public FeuxContext getContext() {
		return context;
	}

	public void setContext(FeuxContext context) {
		this.context = context;
	}

	public  abstract void Traitement();
	public  abstract void State();

	

}
