import java.io.*;

public class Lesson1 {


    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int in = Integer.parseInt(reader.readLine());
            System.out.println(method(in));

            if (in == -1) {
                break;
            }
        }


    }

     /*Сделать светофор с выводом цвета в консоль. Вы вводите минуту (от нуля до n)
    и получаете какой свет горит на светофоре. Первые две минуты красный, потом
    три минуты желтый и пять минут зеленый.*/

    private static String method(int time) {
        if (time % 10 >= 0 && time % 10 < 2)
            return "Red";
        else if (time % 10 >= 2 && time % 10 < 5) {
            return "Yellow";
        } else  /*(time % 10 >= 5 && time % 10 < 10)*/ {
            return "Green";
        }
    }


}
