import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    if (element != null){
      super.add(element);
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
