/**
 * Created by Benjamin Ehlers on 1/29/2019.
 */
public class AdditivePersistence {
    private long number;

    public AdditivePersistence(long number) {
        this.number = number;
    }

    public long calculate() {
        int count = 0;
        long numDigits = Math.round(Math.floor(Math.log10(number)) + 1);
        long num = number;
        while(numDigits != 1) {
            long tempNum = num;
            long temp = 0l;
            for(int i = 1; i < numDigits + 1; i++) {
                long digitNum = Math.round(tempNum%(Math.pow(10.0,i + 0.0)));
                temp+= digitNum / Math.pow(10.0, i - 1.0);
                tempNum-=digitNum;
            }
            num = temp;
            numDigits = Math.round(Math.floor(Math.log10(num)) + 1);
            count++;
        }
        return count;
    }
}
