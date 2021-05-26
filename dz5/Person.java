package dz5;

   //     Cоздать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
   //     Конструктор класса должен заполнять эти поля при создании объекта;
   //     Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
   //     Создать массив из 5 сотрудников:
   //     Пример:
   //     Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
   //     persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000,
   //     30); // потом для каждой ячейки массива задаем объект
   //     persArray[1] = new Person(...);
   //     ...
   //     persArray[4] = new Person(...);
   //     С помощью цикла вывести информацию только о сотрудниках старше 40 лет;


public class Person {
    private String fullName;
    private String position;
    private String email;
    private String  telephoneNumber;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String telephoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Person(){

    }

    public int getAge() {
        return age;
    }

    public void printInfo(){
        System.out.print("ФИО: " + fullName +"\n" +"Должность: " + position +"\n");
        System.out.print("Email: " + email +"\n" + "Телефон: " +telephoneNumber + "\n");
        System.out.print("Зарплата: " +salary +"\n" + "Возраст: " +age + "\n" +"\n");
    }

}
