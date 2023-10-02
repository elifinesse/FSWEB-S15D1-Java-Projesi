import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        List<String> shoppingCart = new LinkedList<>();
        System.out.println("Alışveriş listem: " + shoppingCart);
        Scanner scanner = new Scanner(System.in);
        String action;
        while(true){
            try{
                System.out.println("Ne yapmak istiyorsunuz?");
                action = scanner.next();
                if(action.equals("0")){
                    break;
                } else if(action.equals("1")){
                    scanner.nextLine();
                    Scanner add = new Scanner(System.in);
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String additions = add.nextLine();
                    addItems(shoppingCart, additions);
                    printSorted(shoppingCart);
                } else if(action.equals("2")){
                    Scanner remove = new Scanner(System.in);
                    System.out.println("Silinmesini istediğiniz elemanları giriniz.");
                    String deletions = remove.nextLine();
                    deleteItems(shoppingCart, deletions);
                    printSorted(shoppingCart);
                } else {
                    System.out.println("0,1 veya 2 giriniz.");
                    printSorted(shoppingCart);
                }
            } catch(Exception exception){
                System.out.println("0,1 veya 2 giriniz.");
            }
        }    
        
    }

    public static void addItems(List<String> shoppingCart, String additions){
        String[] additionsArr = additions.split(",", -1);
        for(String addition: additionsArr){
            if(!shoppingCart.contains(addition.trim().toLowerCase())){
                shoppingCart.add(addition.trim().toLowerCase());
            }
        } 
    }

    public static void deleteItems(List<String> shoppingCart, String additions){
        String[] additionsArr = additions.split(",", -1);
        for(String addition: additionsArr){
            if(shoppingCart.contains(addition.trim().toLowerCase())){
                shoppingCart.remove(addition.trim().toLowerCase());
            }
        } 
    }

    public static void printSorted(List<String> shoppingCart){
        Collections.sort(shoppingCart);
        System.out.println(shoppingCart);
    }

    /* public boolean checkItemIsInList(List<String> shoppingCart, String addition){
        String[] additionsArr = additions.split(",", -1);
        for(String addition: additionsArr){
            if(shoppingCart.contains(addition.trim().toLowerCase())){
                shoppingCart.add(addition.trim());
            }
        } 
    } */
}
