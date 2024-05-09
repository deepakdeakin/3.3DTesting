package sit707_tasks;

/**
 * Utility class for handling date operations.
 * Supports finding the next or previous date from a given date.
 * Handles leap years and different month durations.
 * Validates input parameters for day, month, and year.
 * 
 * @author Deepak Kumar Khatri
 */
public class DateUtil {

    // Months in order 0-11 maps to January-December.
    private static final String[] MONTHS = new String[] {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
    };

    private int day, month, year;

    /**
     * Constructs a DateUtil object from given day, month, and year.
     * Validates input parameters for day, month, and year.
     * 
     * @param day   The day of the month.
     * @param month The month (1-12).
     * @param year  The year (1700-2024).
     * @throws IllegalArgumentException If any input parameter is invalid.
     */
    public DateUtil(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Invalid date: " + day + "/" + month + "/" + year);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Validates if a given date is valid.
     * 
     * @param day   The day of the month.
     * @param month The month (1-12).
     * @param year  The year (1700-2024).
     * @return True if the date is valid, false otherwise.
     */
    private boolean isValidDate(int day, int month, int year) {
        if (year < 1700 || year > 2024) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > monthDuration(month, year)) {
            return false;
        }
        return true;
    }

    /**
     * Increment the date to the next day.
     */
    public void increment() {
        if (day < monthDuration(month, year)) {
            // At least 1 day remaining in current month of year.
            day++;
        } else if (month < 12) {
            // Last day of a month AND month is less than December, so +1d is first day of next month.
            day = 1;
            month++;
        } else {
            // Month is December, so +1d is 1st January next year.
            day = 1;
            month = 1;
            year++;
        }
    }

    /**
     * Decrement the date to the previous day.
     */
    public void decrement() {
        if (day > 1) {
            day--;
        } else if (month > 1) {
            month--;
            day = monthDuration(month, year);
        } else {
            month = 12;
            year--;
            day = monthDuration(month, year);
        }
    }

    /**
     * Calculate duration of current month of year.
     * 
     * @param month The month (1-12).
     * @param year  The year (1700-2024).
     * @return The number of days in the month.
     */
    private static int monthDuration(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }

    /**
     * Checks if a given year is a leap year.
     * 
     * @param year The year.
     * @return True if the year is a leap year, false otherwise.
     */
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Get the day of the month.
     * 
     * @return The day of the month.
     */
    public int getDay() {
        return day;
    }

    /**
     * Get the month.
     * 
     * @return The month.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Get the year.
     * 
     * @return The year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Generate a string representation of the date.
     * 
     * @return The string representation of the date.
     */
    @Override
    public String toString() {
        return day + " " + MONTHS[month - 1] + " " + year;
    }
}
