public class SmartPhone extends MobilePhone {
    
    public SmartPhone(String brand) {
        super(brand);
    }
    
    public void call(String number) {
        if (number.charAt(0) == '0' && number.charAt(1) == '0') {
            System.out.println("Calling " + number + " through the internet to save money");
        }
        else {
            super.call(number);
        }
    }
    
    /*
    *
    *   Overrides the playGame() method, increasing its visibility
    *   calls the printGame() method from the SmartPhone super class, MobilePhone
    *
    */
    public void playGame(String game) {
        super.printGame(game);
    }
    
    public void browseWeb(String website) {
        System.out.println("Going to website " + website);
    }
    
    public int findPosition() {
        return 12;
    }
}