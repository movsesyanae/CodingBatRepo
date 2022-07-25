public class CodingBat {
// Each function in this class is from a coding bat problem


    // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

// We can also see that sleepIn has no ties to the CodingBat class - since all that it needs to work is
// the values that are input, the method can be made static

    public static boolean sleepInStaticVersion(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }





}
