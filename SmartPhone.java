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
        
    
    public void browseWeb(String website) {
        System.out.println("Going to website " + website);
    }
    
    public int findPosition() {
        return 12;
    }
}