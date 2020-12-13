import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  private int indexOf(T index){
    for (int i = 0; i < size(); i++){
      if (get(i).equals(index))
        return i;
    }
    return size();
  }

  public boolean add(T element){
    if (element != null){
      super.add(indexOf(element), element);
      return true;
    }
    else
      throw new IllegalArgumentException();
  }

  public void add(int index, T element){
    if (element != null)
      super.add(index, element);
    else
      throw new IllegalArgumentException();
  }
  
  public T set(int index, T element){
    if (element != null){
      remove(index);
      add(index, element);
      return remove(index);
    }
    else
      throw new IllegalArgumentException();
  }

  public static void main(String[] args){
    OrderedArrayList<Integer> a = new OrderedArrayList<Integer>();
    for (int i = 0; i < 5; i++)
      a.add(i);
    System.out.println(a); //expected [1, 2, 3, 4]
    a.set(0, 20);
    a.add(1, 21);
    System.out.println(a); //expected [20, 21, 2, 3, 4]
  }
}
