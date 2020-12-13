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

}
