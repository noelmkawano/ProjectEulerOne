/**
 * Created by NOEL on 2/3/2015.
 */
public class ProjectEulerOne {
  public static void main(String[] args) {
    int i2=0;
    int x2=0;
    int y2=0;
    for(int i=0; i<1000; i=i+3){
      i2=i+i2;
      //System.out.println(i2);
    }
    for(int x=0; x<1000; x=x+5){
      x2=x+x2;
      //System.out.println(x2);
    }
    for(int y=0; y<1000; y=y+15){
      y2=y+y2;
    }
    int z=i2+x2-y2;
    System.out.print(z);
  }
}
