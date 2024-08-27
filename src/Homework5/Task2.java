package Homework5;

    import java.util.Arrays;
    /*
    Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String 8x8.
     С помощью циклов задать элементам массива значения B(Black) или W(White).
     */

    public class Task2 {
        public static void main(String[] args) {
            String[][] array = new String[8][8];
            int counter = 1;
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    if (counter  % 2 == 0){
                        array[i][j] = "B";
                    } else {
                        array[i][j] = "W";
                    }
                    counter++;
                }
                counter++;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array[i]));
            }
        }

    }

