package sit707_tasks;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;


public class DateUtilTest {
	
	
	@Test
	public void testStudentIdentity() {
		String studentId = "220007878";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Deepak Kumar Khatri";
		Assert.assertNotNull("Student name is null", studentName);
	}

    @Test
    public void testIncrement_LastDayOfMonth() {
        // Test incrementing on the last day of a month
        DateUtil date = new DateUtil(31, 1, 2024);
        date.increment(); // Next day should be 1 February 2024
        assertEquals(1, date.getDay());
        assertEquals(2, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOfLeapYearFebruary() {
        // Test incrementing on the last day of February in a leap year
        DateUtil date = new DateUtil(28, 2, 2024);
        date.increment(); // Next day should be 29 February 2024
        assertEquals(29, date.getDay());
        assertEquals(2, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOfNonLeapYearFebruary() {
        // Test incrementing on the last day of February in a non-leap year
        DateUtil date = new DateUtil(28, 2, 2023);
        date.increment(); // Next day should be 1 March 2023
        assertEquals(1, date.getDay());
        assertEquals(3, date.getMonth());
        assertEquals(2023, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOf30DayMonth() {
        // Test incrementing on the last day of a 30-day month
        DateUtil date = new DateUtil(30, 4, 2024);
        date.increment(); // Next day should be 1 May 2024
        assertEquals(1, date.getDay());
        assertEquals(5, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOfDecember() {
        // Test incrementing on the last day of December
        DateUtil date = new DateUtil(31, 12, 2023);
        date.increment(); // Next day should be 1 January 2024
        assertEquals(1, date.getDay());
        assertEquals(1, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfMonth() {
        // Test decrementing on the first day of a month
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement(); // Previous day should be 31 December 2023
        assertEquals(31, date.getDay());
        assertEquals(12, date.getMonth());
        assertEquals(2023, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfMarchLeapYear() {
        // Test decrementing on the first day of March in a leap year
        DateUtil date = new DateUtil(1, 3, 2024);
        date.decrement(); // Previous day should be 29 February 2024
        assertEquals(29, date.getDay());
        assertEquals(2, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfMarchNonLeapYear() {
        // Test decrementing on the first day of March in a non-leap year
        DateUtil date = new DateUtil(1, 3, 2023);
        date.decrement(); // Previous day should be 28 February 2023
        assertEquals(28, date.getDay());
        assertEquals(2, date.getMonth());
        assertEquals(2023, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfJanuary() {
        // Test decrementing on the first day of January
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement(); // Previous day should be 31 December 2023
        assertEquals(31, date.getDay());
        assertEquals(12, date.getMonth());
        assertEquals(2023, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOfApril() {
        // Test incrementing on the last day of April
        DateUtil date = new DateUtil(30, 4, 2024);
        date.increment(); // Next day should be 1 May 2024
        assertEquals(1, date.getDay());
        assertEquals(5, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfMay() {
        // Test decrementing on the first day of May
        DateUtil date = new DateUtil(1, 5, 2024);
        date.decrement(); // Previous day should be 30 April 2024
        assertEquals(30, date.getDay());
        assertEquals(4, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOfJune() {
        // Test incrementing on the last day of June
        DateUtil date = new DateUtil(30, 6, 2024);
        date.increment(); // Next day should be 1 July 2024
        assertEquals(1, date.getDay());
        assertEquals(7, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfJuly() {
        // Test decrementing on the first day of July
        DateUtil date = new DateUtil(1, 7, 2024);
        date.decrement(); // Previous day should be 30 June 2024
        assertEquals(30, date.getDay());
        assertEquals(6, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOfAugust() {
        // Test incrementing on the last day of August
        DateUtil date = new DateUtil(31, 8, 2024);
        date.increment(); // Next day should be 1 September 2024
        assertEquals(1, date.getDay());
        assertEquals(9, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfSeptember() {
        // Test decrementing on the first day of September
        DateUtil date = new DateUtil(1, 9, 2024);
        date.decrement(); // Previous day should be 31 August 2024
        assertEquals(31, date.getDay());
        assertEquals(8, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOfOctober() {
        // Test incrementing on the last day of October
        DateUtil date = new DateUtil(31, 10, 2024);
        date.increment(); // Next day should be 1 November 2024
        assertEquals(1, date.getDay());
        assertEquals(11, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfNovember() {
        // Test decrementing on the first day of November
        DateUtil date = new DateUtil(1, 11, 2024);
        date.decrement(); // Previous day should be 31 October 2024
        assertEquals(31, date.getDay());
        assertEquals(10, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOfSeptember() {
        // Test incrementing on the last day of September
        DateUtil date = new DateUtil(30, 9, 2024);
        date.increment(); // Next day should be 1 October 2024
        assertEquals(1, date.getDay());
        assertEquals(10, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfOctober() {
        // Test decrementing on the first day of October
        DateUtil date = new DateUtil(1, 10, 2024);
        date.decrement(); // Previous day should be 30 September 2024
        assertEquals(30, date.getDay());
        assertEquals(9, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testIncrement_LastDayOfNovember() {
        // Test incrementing on the last day of November
        DateUtil date = new DateUtil(30, 11, 2024);
        date.increment(); // Next day should be 1 December 2024
        assertEquals(1, date.getDay());
        assertEquals(12, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testDecrement_FirstDayOfDecember() {
        // Test decrementing on the first day of December
        DateUtil date = new DateUtil(1, 12, 2024);
        date.decrement(); // Previous day should be 30 November 2024
        assertEquals(30, date.getDay());
        assertEquals(11, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
   public void testInvalidDate_InvalidDay() {
        // Test with invalid day
        try {
            new DateUtil(32, 1, 2024);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Exception was thrown as expected
        }
    }

    @Test
    public void testInvalidDate_InvalidMonth() {
        // Test with invalid month
        try {
            new DateUtil(31, 13, 2024);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Exception was thrown as expected
        }
    }

    @Test
    public void testInvalidDate_InvalidFebruaryDay_NonLeapYear() {
        // Test with invalid day for February in a non-leap year
        try {
            new DateUtil(29, 2, 2023);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Exception was thrown as expected
        }
    }

    @Test
   public void testInvalidDate_InvalidFebruaryDay_LeapYear() {
        // Test with invalid day for February in a leap year
        try {
            new DateUtil(30, 2, 2024);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Exception was thrown as expected
        }
    }

    @Test
    public void testInvalidDate_InvalidAprilDay() {
        // Test with invalid day for April
        try {
            new DateUtil(31, 4, 2024);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Exception was thrown as expected
        }
    }


    @Test
    public void testToString() {
        // Test generating string representation of date
        DateUtil date = new DateUtil(9, 5, 2024);
        assertEquals("9 May 2024", date.toString());
    }
}
