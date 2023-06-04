import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        // Виведення введеного масиву
        System.out.println("\nВведений масив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        // Розрахунок кількості додатніх елементів масиву
        int countPositive = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                countPositive++;
            }
        }

        System.out.println("\nКількість додатніх елементів масиву: " + countPositive);

        // Розрахунок суми елементів після останнього нульового елементу
        double sumAfterLastZero = 0;
        boolean foundLastZero = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                foundLastZero = true;
                sumAfterLastZero = 0;
            } else if (foundLastZero) {
                sumAfterLastZero += array[i];
            }
        }
        if(foundLastZero){
            System.out.println("\nСума елементів після останнього нульового елементу: " + sumAfterLastZero);
        }
        else{
            System.out.println("\nНулів не знайдено!");
        }

        // Перетворення масиву
        System.out.println("\nПеретворений масив, таким чином, що спочатку розташовуються елементи <1, а потім - усі інші:");
        for (int i = 0; i < n; i++) {
            if (array[i] <= 1) {
                System.out.print(array[i] + " ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
