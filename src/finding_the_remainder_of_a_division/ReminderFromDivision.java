package finding_the_remainder_of_a_division;

/*
Demonstration of the use of the operation %
 */
public class ReminderFromDivision {
    public static void main(String[] args) {
        int iResult, iReminder;
        double dResult, dReminder;
        iResult = 10 / 3;
        iReminder = 10 % 3;
        dResult = 10.0 / 3.0;
        dReminder = 10.0 % 3.0;
        System.out.println("Result of division: 10 / 3 = " + iResult +
                " , reminder from division: 10 % 3 = " + iReminder);
        System.out.println("Result of division: 10 / 3 = " + dResult +
                " , reminder from division: 10 % 3 = " + dReminder);
    }
}
