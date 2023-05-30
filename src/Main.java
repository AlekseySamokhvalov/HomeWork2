
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 6.");
        //Задача 6. Иничиализация переменных.
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var totalMass = firstFighter + secondFighter;
        var massDifference = Math.abs(firstFighter - secondFighter);
        //выод переменных в консоль
        System.out.println("Масса первого бойца = " + firstFighter);
        System.out.println("Масса второго бойца = " + secondFighter);
        System.out.println("Суммарная самма бойцов = " + totalMass);
        System.out.println("Разница масс бойцов = " + massDifference);
    }
}