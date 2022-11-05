import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sweet birdmilk = new BirdMilk("Пташине молоко", "Чорно-білий", 77, 1, 49);
        Sweet karakum = new Karakum("Каракум","Чорний", 198, 2, 27);
        Sweet cow = new Cow("Корівка","Жовтий", 84, 3, 0);
        List<Sweet> present = new List<Sweet>(){birdmilk, karakum, cow}
        for (Sweet sweet: present) {
            sweet.writesweet();
        }
        System.out.println(' ');
        SortingAndChoosing newtext = new SortingAndChoosing(present);
        newtext.Sorting();
        List finaltext = newtext.getList();
        for (Object list: finaltext) {
            System.out.println(list);
        }
        Scanner firstnum = new Scanner(System.in);
        Scanner secondnum = new Scanner(System.in);
        for (Sweet object: present) {
            int string = object.getContainchokolate();
            if(string > firstnum.nextInt() && string < secondnum.nextInt()){
                System.out.println(object.getName());
            }
            else {
                System.out.println("У такому диапазоні немає цукерок");
            }
        }
    }
}
