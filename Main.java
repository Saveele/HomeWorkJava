public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иван", "+7 777 777 77 77");
        phoneBook.addContact("Анна", "+7 888 888 88 88");
        phoneBook.addContact("Павел", "+7 666 666 66 66");
        phoneBook.addContact("Анна", "+7 555 555 55 55");
        phoneBook.addContact("Павел", "+7 444 444 44 44");
        phoneBook.addContact("Анна", "+7 333 333 33 33");

        phoneBook.printPhoneBook();
    }
}
