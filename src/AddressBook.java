import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressbook;

    public AddressBook(){
        addressbook = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        addressbook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        addressbook.remove(buddy);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
