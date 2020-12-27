import java.util.ArrayList;
import java.util.Random;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  private int indexOf(T index){
    for (int i = 0; i < size(); i++){
      if (index.compareTo(get(i)) <= 0)
        return i;
    }
    return size();
  }

  public boolean add(T element){
    if (element != null)
      super.add(indexOf(element), element);
    else
      throw new IllegalArgumentException();
    return true;
  }

  public void add(int index, T element){
    add(element);
  }

  public T set(int index, T element){
    if (element != null){
      T temp = remove(index);
      add(element);
      return temp;
    }
    else
      throw new IllegalArgumentException();
  }

  public static void main(String[] args){
    OrderedArrayList<Double> a = new OrderedArrayList<Double>();
    Random r = new Random();
    a.add(1.0);
    for (int i = 0; i < 40; i++)
      a.add(Math.random()*10000);
    a.set(0, 8.0);
    System.out.println(a);

    OrderedArrayList<Double> b = new OrderedArrayList<Double>();
    b.add(17.0);
    b.add(18.0);
    for (int i = 0; i < 40; i++)
      b.add(0, Math.random()*10000);
    System.out.println(b);
  }
}
