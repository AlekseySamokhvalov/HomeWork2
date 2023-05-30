
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 8.");
        //Задача 8. Иничиализация переменных.
        var workingHours = 640;
        var employeeHours = 8;

        //вывод результатов операции

        System.out.println("Всего работников в компании - " + workingHours/employeeHours + " человек");

        System.out.println("Если в компании работает " + (workingHours/employeeHours + 94) +
                " человек(а), то всего " + (workingHours + employeeHours * 94) + " часа(ов) работы может быть поделено между сотрудниками");
    }
}