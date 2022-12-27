public class Bagaglio {
	private static final MAX_WEIGHT=20.00;
	private static final MAX_HEIGHT_HAND=55;
	private static final MAX_LENGTH_HAND=40;
	private static final MAX_WIDTH_HAND=20;
	private static final MAX_DIMENSION_HOLD=158;
	private double weight, height, length, width;
	private String type;

	public Bagaglio() {
		this.weight = 0.0;
		this.height = 0.0;
		this.length = 0.0;
		this.width = 0.0;
		this.type = "undefined";
	}

	public Bagaglio(double w, double h, double l, double wid, String t) {
		this.weight = 0.0;
		this.height = 0.0;
		this.length = 0.0;
		this.width = 0.0;
		this.type = "undefined";
		setWeight(w);
		setType(t);
		setWidth(wid);
		setHeight(h);
		setWeight(l);
	}

	private void setType(String t) {
	}

	public void setWeight(double v) {
		if (v > 0) {
			this.weight = v;
		}/* else {
			this.weight = 0;
		}*/
	}

	public void setHeight(double h) {
		if (h > 0) {
			this.height = h;
		}/* else {
			this.height = 0;
		}*/
	}

	public void setLength(double h) {
		if (h > 0) {
			this.length = h;
		}/* else {
			this.length = 0;
		}*/
	}

	public void setWidth(double h) {
		if (h > 0) {
			this.width = h;
		}/* else {
			this.width = 0;
		}*/
	}

	public void setType(boolean h) {
		if (h) {
			this.type = "Bagaglio a mano";
		} else {
			if (h) {
				this.type = "Bagaglio da stiva";
			} else {
				this.type = "undefined";
			}
		}
	}

	public boolean dimensioniBMano(){
	 	return (this.getLength<=MAX_LENGTH_HAND&&this.getHeight<=MAX_HEIGHT_HAND&&this.getWidth<=MAX_WIDTH_HAND)
	}

	public boolean dimensioniBHold(){
		return (this.getLength+this.getWidth+this.getHeight<=MAX_DIMENSION_HOLD)
	}

	public double getWeight() {
		return this.weight;
	}

	public double getLength() {
		return this.length;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWidth() {
		return this.width;
	}

	public boolean sovrapprezzoW() {
		return (this.weight > MAX_WEIGHT);
	}

	public boolean sovrapprezzoD() {
		if (this.type.equals("Bagaglio a mano")) {
			return this.dimensioniBMano();
		} else if (this.type.equals("Bagaglio da stiva")) {
			return this.dimensioniBHold();
		}

	}

	public String toString() {
		String out = "";
		out += " il bagaglio pesa: " + this.weight + " kg";
		out += "il tipo di bagaglio è: " + this.type;
		out += "le dimensioni del Bagaglio sono: " + this.height + "h, " + this.getLength + "l, " + this.getWidth + "w";
		return out;
	}
}
