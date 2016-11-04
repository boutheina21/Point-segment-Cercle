package ficheTD3;


public class PointNom extends PointA{ // erreur dans la relation d'heritage 

 private String name;
    
    public PointNom (String name, double x, double y){
        super (x,y);
        this.name = name;        
    }
    
    
   @Override
	public String toString() { //le but est de définir une méthode qu'on va reféfinir au niveau de la classe fille 
		return "(" + getX() + ", " + getY() + ")";
	}
    
    public void setName(String name){
    this.name = name;
    }
    public String getName(){
    return name;
    }
  }
