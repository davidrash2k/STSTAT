package Model;

/**
 *
 * @author aakov-dy
 */
import java.util.Random;
import java.util.ArrayList;

public class Computer extends Player {
    
    
    
     private ArrayList<Coordinates> cList;
     private int x;
     private int y;
    
    public Computer( String name ){
      super( name );
      cList = new ArrayList<Coordinates>();
      x =0;
      y =0;
   }
    
    
   public Coordinates generate(){
       Coordinates coord = new Coordinates();
     x = generateX(); 
     y = generateY();
      if( cList.isEmpty() ){
          coord = new Coordinates ( x , y );
         cList.add( coord );
         return coord;
      }else{
          if(cList.size() != 100){
        do{
             x = generateX(); y = generateY();
         }while ( check(x,y) );
            coord = new Coordinates ( x , y );
         cList.add( new Coordinates ( x , y ) );
         
          }
          
           return coord;
      }
   }

   public int getXcoord(){

      return x;
   }

   public int getYcoord(){
     
      return y;
   }

   public int generateX(){
       Random rnd = new Random();
      x =  rnd.nextInt( 10 );
      
      return x;
   }

   public int generateY(){
         Random rnd = new Random();
      y = rnd.nextInt( 10 );
      return y;
   }

   public boolean check(int x, int y){
      for (int i = 0 ; i < cList.size(); i++){
           Coordinates coord = new Coordinates();
           coord = (Coordinates) cList.get(i);
           
           if(x == coord.getX() && y == coord.getY())
               return true;
            
         }
      
       return false;
      }
   
    public Coordinates attack(){
           return generate();
   }
     

   }
   
   
  

   /*

   public boolean checkCoordinates( int x, int y){
      if( this.x == x & this.y == y )
         return true;
      else return false;
   }
   */







    
