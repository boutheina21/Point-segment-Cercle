package ficheTD3;


public class PointA extends Point{

 public PointA (double x, double y)
    {
        super (x,y); //appelle  constructeur class mère(Point) avec deux  paramètre x et y
    }
    
    public PointA (double x){
        super (x); // appelle  constructeur class mère(Point) avec un seul paramètre x
    }
    
    public PointA (){
           // appelle impmecite du constructeur par defaut de la class mère(Point) 
    }
    
    @Override
//polymorphisme redefinition
	public String afficheCoord() {
		return "(" + getX() + ", " + getY() + ")";
	}
    
    }
