import java.util.ArrayList;
import java.util.Random;

public class java_hw_lesson3 {
    public static void main(String[] args) {
        int size = 20;
        ArrayList <Integer> list = new ArrayList<>();
        CreatorRandomList(size, list);
        SeeIt(list);
        ChargeList(list);
        SeeIt(list);
    }

        public static void CreatorRandomList (int size, ArrayList<Integer> array){
            Random num = new Random();
            for (int i = 0; i < size; i++) {
                array.add(num.nextInt(1,100));
            }

        }
        public static void SeeIt(ArrayList<Integer> array){
            for (int i = 0; i < array.size() ; i++) {
                System.out.print(array.get(i) + " ");
            }
            System.out.println();
        }
        public static void ChargeList(ArrayList<Integer> array){
            for (int i = 0; i < array.size(); i++) {
                if(array.get(i) % 2 == 1){
                    array.remove(i);
                    i--;
                }

            }
        }
}
