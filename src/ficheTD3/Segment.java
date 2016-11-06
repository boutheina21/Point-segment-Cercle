package ficheTD3;

public class Segment {

	public Point A = new Point();//nrmlmnt tu déclare les atributs private est tu n'a pas obligé de initialisé les atributs par new point ()
	public Point B = new Point();

	public Segment(Point A, Point B) {
		this.A = A;
		this.B = B;

	}

	public Segment(Point B) {

		this(new Point(), B);
	}

	public double distance(Point A, Point B) {

		return Math.sqrt(
				(Math.pow((B.getX() - A.getX()), 2) + Math.pow((B.getY() - A.getY()), 2)));
	}

	public Segment symetrie(Point A, Point B) {

		return new Segment((A.symertie()), (B.symertie()));
	}

	@Override
	public String toString() {
		return "" + A.toString() + "" + B.toString() + "";
	}

}
