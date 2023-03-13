import java.util.ArrayList;
import java.util.List;

public class java_hw_lesson3_01 {
    public static void main(String[] args) {

//        Дан список ArrayList<String>. Удалить из него все строки, которые являются числами Пример:
//        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
//        ["string", "s", "my_value"]


        ArrayList<String> list = new ArrayList<>(List.of("soap", "long", "17", "22", "snow", "4", "45874", "s"));
        System.out.println(list + " \n Это изначальный список ! \n");

        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
                i--;
            }
            catch (Exception e) {
            }


        }
        System.out.println(list + " \n Это список без цифр! ");
    }
}
