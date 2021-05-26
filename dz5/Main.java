package dz5;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Сидоров Петр Михайлович","Инженер",
                "sidor82@mail.ru","89623456247",35000,41);
        persArray[1] = new Person("Колчев Андрей Игоревич","Дизайнер",
                "kolchev.a@mail.ru","89732456713",40000,33);
        persArray[2] = new Person("Кулешов Виталий Дмитриевич","Технолог",
                "kuleshov.vd@mail.ru","89347556781",32500,31);
        persArray[3] = new Person("Ковтун Виталий Георгиевич","Кладовщик",
                "kovtun@mail.ru","89029986734",29700,43);
        persArray[4] = new Person("Сидонов Сергей Викторович","Главный инженер",
                "sidonov@mail.ru","989613048767",65000,47);

        for (Person person : persArray) {
            if (person.getAge() > 40) person.printInfo();
        }
    }
}
