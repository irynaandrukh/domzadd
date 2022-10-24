import java.util.Scanner;

public class bhvhj {
    public class Dz {
        public static  void main(String[] args) {
            //First level: Найдите следующее четное число.
            //Например, вводится 140 -> выводим 142, вводится 93 -> выводим 94.
            //Решить задачу с помощью if

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int next = a % 2;

            if (next == 0){
                System.out.println(a + 2);
            } else {
                System.out.println(a+1);
            }


            //Second level: Джон едет на поезде к Мэри. Шерлок Холмс решил вычислить,
            //где сейчас находится Джон: ближе к нему или к Мэри.
            //Шерлок знает, с какой скоростью едет поезд и сколько часов он уже едет.
            //Также он знает, сколько километров длится полная дорога от него к  Мэри.
            //В программу вводится 3 числа: время в пути, скорость поезда, длина полного пути.
            //Вывести на экран имя персонажа, к которому сейчас ближе Джон

            //я не уверена, что правильно поняла услоовие, насчет полного пути
            //Scanner scanner = new Scanner(System.in);
            //int timeJohn = scanner.nextInt();
            //int peedJohn = scanner.nextInt();
            //int sherWay = scanner.nextInt();

            //if (timeJohn * peedJohn > sherWay) {
            //    System.out.println("Mary");
            //}
            //if (timeJohn * peedJohn <= sherWay) {
            //    System.out.println("Sherlok");
            //}


        }

    }

}
