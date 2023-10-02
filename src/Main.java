

public class Main {
    public static void main(String[] args) {

        MobilePhone mp = new MobilePhone("123456");
        Contact c1 = new Contact("elif", "654321");
        Contact c2 = new Contact("person", "987654");
        Contact c3 = new Contact("kisi", "987432");
        Contact c4 = new Contact("another", "000");

        mp.addNewContact(c1);
        mp.addNewContact(c3);
        mp.addNewContact(c4);
        mp.updateContact(c1, c2);
        System.out.println(mp.findContact("kisi"));
        System.out.println(mp.findContact(c1));
        mp.removeContact(c4);
        mp.printContact();


        System.out.println(mp.getMyContacts());
    }
}