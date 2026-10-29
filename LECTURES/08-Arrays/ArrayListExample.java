import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //syntax
        ArrayList<Integer> list= new ArrayList<>(10);

        list.add(67);
        list.add(23);
        list.add(54);
        list.add(43);
        list.add(453);
        list.add(3);
        list.add(786);
        System.out.println(list);


        list.set(0 , 99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(3));
    }
}
