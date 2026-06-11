//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> на полях.
public class Main {
    public static void main(String[] args) {

        //Q1

        var dog = 8.0;
        var cat = 3.6;
        var paper = 76378;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Q2

        dog = dog + 4 ;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Q3

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Q4

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Q5

        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Q6

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer1 - boxer2);

        //Q7

        boxer1 = 78.2;
        boxer2 = 82.7;
        var result = boxer2 % boxer1;
        System.out.println("Остаток от деления boxer2 на boxer1 = " + result);

        //Q8

        var workTime = 640;
        var peopleWork = 8;
        var people = workTime / peopleWork;
        var newWork = 94;
        System.out.println("Всего работников в компании — " + people + " человек");
        System.out.println("Если в компании работает " + (people + newWork) + " человек, то всего " + (people + newWork) * peopleWork  + " часов работы может быть поделено между сотрудниками");







    }
}