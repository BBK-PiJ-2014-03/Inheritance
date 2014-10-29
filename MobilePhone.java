public class MobilePhone extends OldPhone {
    
    /* private NumberQueue lastNumber; */
    private String[] lastNumbers;
    
    private int position = 0;
    
    public MobilePhone() {
        super();
        
        lastNumbers = new String[9];
        
        /* lastNumber = new NumberQueue(); */
    }
    
    public void call(String number) {
        super.call(number);
        
        if (lastNumbers[0] == null) {
            lastNumbers[0] = number;
        }
        else {
            String[] newStringArray = new String[9];
            for (int count = 0; count < lastNumbers.length-1; count++) {
                newStringArray[count+1] = lastNumbers[count];
            }
            newStringArray[0] = number;
            lastNumbers = newStringArray;
        }
    }
        
        
        /* NumberDialed newNumber = new NumberDialed(number, position);
        lastNumber.insert(newNumber); */

    
    
    public void ringAlarm(String alarm) {
        System.out.println(alarm + " has gone off.");
    }
    
    public void playGame(String game) {
        System.out.println("You are playing " + game);
    }

    public void printLastNumbers() {
        for (int count = 0; count < lastNumbers.length-1; count++) {
            System.out.println(lastNumbers[count]);
        }
    
        /* lastNumber.printNumbers(); */
    }
}