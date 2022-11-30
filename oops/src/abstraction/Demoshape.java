package abstraction;

import java.util.Scanner;

abstract class Shape{
    float area;
    /* double area;*/
    static Scanner scan=new Scanner(System.in);// since it is static we can use it in all the inherited classes
    // loacted ones in static block but can be accessed multiple time
    abstract void acceptInput();// since it has to be overridded we can keep it with nobody and make it abstract 
    abstract void calcArea();// since it has to be overridded we can keep it with nobody and make it abstract
    void dispArea(){
        System.out.println(area);
    }

}

/*class scanner{
	static { Scanner scan=new Scanner(System.in);}  // not correct way until inheritated
}*/
 
class Square extends Shape{
   int side;
    void acceptInput(){
       // Scanner scan=new Scanner(System.in);
        System.out.println("enter side of square");
        this.side=scan.nextInt();
      //  this.side=Shape.scan.nextInt();// can be written like this also 

    }
    void calcArea(){
        this.area=this.side*this.side;

    }
}


class Rectangle extends Shape{
   int length;
   int breadth;
    void acceptInput(){
       // Scanner scan=new Scanner(System.in);
        System.out.println("enter length and breadth of retangle");
        length=scan.nextInt();
        breadth=Shape.scan.nextInt();

    }
    void calcArea(){
        this.area=this.length*this.breadth;

    }
}
class Circle extends Shape{
   float Pi=3.14f;// instead of this we can use math package 
   int radius;
    void acceptInput(){
       // Scanner scan=new Scanner(System.in);
        System.out.println("enter radius of circle");
        this.radius=Shape.scan.nextInt();
        

    }
    void calcArea(){
        this.area=Pi*this.radius*this.radius;
        //this.area=Math.PI*this.radius*this.radius;//
       // Math.PI    used for pi value

    }
}

class Geometry{
  static  void clacArea(Shape s){
        s.acceptInput();
        s.calcArea();
        s.dispArea();
    }
}
class Demoshape{
	//static { Scanner scan=new Scanner(System.in);}// not proper way to do
    public static void main(String []args){
    	
       
    	Shape sq= new Square();
     // Shape sh= new Shape();//        //    can not create object of abstract c
       Rectangle r= new Rectangle();
       Circle c= new Circle();
       
       Geometry.clacArea(sq);
       Geometry.clacArea(r);
       Geometry.clacArea(c);
       
       Geometry.clacArea(new Rectangle());
       //Geometry.clacArea(new Square);
       //Geometry.clacArea(new Circle);


    }

}
