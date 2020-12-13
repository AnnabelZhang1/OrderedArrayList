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
  
}
