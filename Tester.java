import java.util.ArrayList;
import java.util.Random;

public class Tester{
  public static void main(String[] args){

    NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();
    for (int i = 100; i > 90; i--){
      a.add(i);
    }
    System.out.println(a); //expected [100, 99, 98, 97, 96, 95, 94, 93, 92, 91]

    NoNullArrayList<Integer> b = new NoNullArrayList<Integer>();
    for (int i = 0; i < 40; i++){
      Random rand = new Random();
      int cap = 50;
      b.add(rand.nextInt(cap));
    }
    System.out.println(b); //expected 40 different integers from 0-50

    NoNullArrayList<Integer> c = new NoNullArrayList<Integer>();
    c.add(17);
    for (int i = 0; i < 40; i++){
      Random rand = new Random();
      int cap = 50;
      c.add(0, rand.nextInt(cap));
    }
    System.out.println(c);  //expected last integer to be 17
  }

}
