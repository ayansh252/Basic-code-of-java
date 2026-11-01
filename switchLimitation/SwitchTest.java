package switchLimitation;

public class SwitchTest {
    public static void main(String[] args) {
        Status status = Status.OFF;
        switch (status) {
            case OFF:
                status = Status.ON;
                break;
            case ON:
                status = Status.OFF;
                break;

        }
        byte b=10;
        switch (b){
            case 10:
                status = Status.OFF;
        }
    }
}
