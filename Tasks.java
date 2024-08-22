package Homework3;

import java.util.Scanner;

    public class Tasks {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод размера массива
            System.out.print("Введите размер массива: ");
            int arraySize = scanner.nextInt();

            // Выбор способа заполнения
            System.out.println("Выберите способ заполнения массива:");
            System.out.println("1. Случайными числами");
            System.out.println("2. Вручную");
            System.out.print("Введите номер варианта: ");
            int choice = scanner.nextInt();

            int[] array = new int[arraySize];

            // Заполнение массива
            if (choice == 1) {
                fillArrayRandomly(array);
            } else if (choice == 2) {
                fillArrayManually(array, scanner);
            } else {
                System.out.println("Неверный выбор.");
                return;
            }

            // Вывод элементов в прямом и обратном порядке
            System.out.println("Элементы массива в прямом порядке:");
            printArray(array);
            System.out.println("Элементы массива в обратном порядке:");
            printArrayReverse(array);

            // Поиск минимального и максимального элементов
            int min = findMin(array);
            int max = findMax(array);
            System.out.println("Минимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);


            // Задача 3
            int minIndex = findMinIndex(array);
            int maxIndex = findMaxIndex(array);
            System.out.println("Индекс минимального элемента: " + minIndex);
            System.out.println("Индекс максимального элемента: " + maxIndex);

            // Задача 4
            int countZeroes = countZeroes(array);
            if (countZeroes > 0) {
                System.out.println("Количество нулевых элементов: " + countZeroes);
            } else {
                System.out.println("Нулевых элементов нет.");
            }

            // Задача 5
            swapElements(array);
            System.out.println("Массив после перестановки элементов:");
            printArray(array);

            // Задача 6
            if (isIncreasingSequence(array)) {
                System.out.println("Массив является возрастающей последовательностью.");
            } else {
                System.out.println("Массив не является возрастающей последовательностью.");
            }

            // Задача 7
            System.out.print("Исходный массив: ");
            printArray(array);
            addOneToNumber(array);
            System.out.print("Массив после добавления единицы: ");
            printArray(array);

        }

        // Заполнение массива случайными числами
        private static void fillArrayRandomly(int[] array) {
            for (int i = 0; i < array.length; i++) {
                // Генерируем случайные числа от 0 до 99
                array[i] = (int) (Math.random() * 100);
            }
        }

        // Заполнение массива вручную
        private static void fillArrayManually(int[] array, Scanner scanner) {
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < array.length; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
        }

        // Вывод массива в прямом порядке
        private static void printArray(int[] array) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Вывод массива в обратном порядке
        private static void printArrayReverse(int[] array) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        // Поиск минимального элемента
        private static int findMin(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        // Поиск максимального элемента
        private static int findMax(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }


        private static int findMinIndex(int[] array) {
            int minIndex = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            return minIndex;
        }

        private static int findMaxIndex(int[] array) {
            int maxIndex = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            return maxIndex;
        }

        // Задача 4: найти количество нулевых элементов
        private static int countZeroes(int[] array) {
            int count = 0;
            for (int element : array) {
                if (element == 0) {
                    count++;
                }
            }
            return count;
        }

        // Задача 5: поменять местами элементы массива
        private static void swapElements(int[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }

        // Задача 6: проверить возрастающую последовательность
        private static boolean isIncreasingSequence(int[] array) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] <= array[i - 1]) {
                    return false;
                }
            }
            return true;
        }

        // Задача 7: добавить единицу к числу, представленному массивом
        private static void addOneToNumber(int[] array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] < 9) {
                    array[i]++;
                    return; // Выход из функции, если добавление единицы успешно
                } else {
                    array[i] = 0;
                }
            }
            // Если дошли до сюда, значит все цифры были 9, нужно добавить новый разряд
            int[] newArray = new int[array.length + 1];
            newArray[0] = 1;
            System.arraycopy(array, 0, newArray, 1, array.length);
            array = newArray;
        }
    }