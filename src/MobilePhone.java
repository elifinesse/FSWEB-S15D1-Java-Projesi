import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts = new ArrayList<>();
    private String myNumber;
    
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(myContacts.contains(oldContact)){
            for(int i = 0; i < myContacts.size(); i++){
                if(myContacts.get(i).equals(oldContact)){
                    myContacts.set(i, newContact);
                    return true;
                }
            }
        } 
        return false;
    }

    public boolean removeContact(Contact toBeRemoved){
        if(myContacts.contains(toBeRemoved)){
            for(int i = 0; i < myContacts.size(); i++){
                if(myContacts.get(i).equals(toBeRemoved)){
                    myContacts.remove(i);
                    return true;
                }
            }
        } 
        return false;
    }

    public int findContact(Contact toBeFound){
        if(myContacts.contains(toBeFound)){
            for(int i = 0; i < myContacts.size(); i++){
                if(myContacts.get(i).equals(toBeFound)){
                    return i;
                }
            }
        } 
        return -1;
    }

    public int findContact(String toBeFound){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(toBeFound)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContact(){
        for(Contact contact: myContacts){
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
