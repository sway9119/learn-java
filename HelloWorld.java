import java.util.*;


public class HelloWorld { 
  public static void main(String[] args) {

    int i = 10;

    Integer obj = Integer.valueOf(i);

    List<Integer> list = new ArrayList<>();
    list.add(obj);

    int i2 = obj.intValue();
    
    System.out.println(i2);


  }
}
