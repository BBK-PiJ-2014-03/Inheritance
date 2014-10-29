public class SmartPhone extends MobilePhone {
    
    public SmartPhone() {
        super();
    }
    
    public void browseWeb(String website) {
        System.out.println("Going to website " + website);
    }
    
    public int findPosition() {
        return 12;
    }
}