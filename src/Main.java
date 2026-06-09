//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> на полях.
public class Main {
    public static void main(String[] args) {
        var workTime = 640;
        var peopleWork = 8;
        var people = workTime / peopleWork;
        var newWork = 94;
          System.out.println("Всего работников в компании — " + people + " человек");
          System.out.println("Если в компании работает " + (people + newWork) + " человек, то всего " + workTime / (people + newWork)  + " часов работы может быть поделено между сотрудниками");





    }
}