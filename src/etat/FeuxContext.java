package etat;

public class FeuxContext {

		private FeuxDeSignalisation stateRouge;
		private FeuxDeSignalisation stateOrange;
		private FeuxDeSignalisation stateVert;

		
		
		
		
		
		public FeuxContext(FeuxDeSignalisation stateRouge, FeuxDeSignalisation stateOrange,
				FeuxDeSignalisation stateVert) {
			super();
			this.stateRouge = stateRouge;
			this.stateOrange = stateOrange;
			this.stateVert = stateVert;
		}
		
		
		

		public FeuxContext() {
			super();
		
			stateRouge = new Rouge(this);
	        stateOrange = new Orange(this);
	        stateVert = new Vert(this);
			
		}

		
      /*
		public void service() {
			   this.stateRouge.Traitement();
		   }
		
		
		public void service1() {
			   this.stateOrange.Traitement();
		   }
		
		public void service2() {
			   this.stateVert.Traitement();
		   }
		
		public FeuxDeSignalisation getStateRouge() {
			return stateRouge;
		}
*/
		public void setStateRouge(FeuxDeSignalisation stateRouge) {
			this.stateRouge = stateRouge;
		}

		public FeuxDeSignalisation getStateRouge() {
			return stateRouge;
		}




		public FeuxDeSignalisation getStateOrange() {
			return stateOrange;
		}

		public void setStateOrange(FeuxDeSignalisation stateOrange) {
			this.stateOrange = stateOrange;
		}

		public FeuxDeSignalisation getStateVert() {
			return stateVert;
		}

		public void setStateVert(FeuxDeSignalisation stateVert) {
			this.stateVert = stateVert;
		}

}
