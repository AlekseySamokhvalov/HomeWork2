
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 7.");
        //Задача 7. Иничиализация переменных.
        var firstFighter = 78.2;
        var secondFighter = 82.7;

        //выод переменных в консоль
        System.out.println("Масса первого бойца = " + firstFighter);
        System.out.println("Масса второго бойца = " + secondFighter);
        var massDifference = secondFighter - firstFighter;
        System.out.println("Разница масс бойцов 1м способом = " + massDifference);
        massDifference = secondFighter % firstFighter;
        System.out.println("Разница масс бойцов 2м способом = " + massDifference);
    }
}