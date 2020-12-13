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

  public T set(int index, T element){
    if (element != null){
      super.set(index, element);
      return element;
    }
    else
      throw new IllegalArgumentException();
  }

  public static void main(String[] args){
    NoNullArrayList<String> test1 = new NoNullArrayList<String>();
    test1.add("longan");
    test1.add("starfruit");
    test1.add(1, "grape");
    test1.set(0, "apple");
    System.out.println(test1); //expected: [apple, grape, starfruit]
  }
}
