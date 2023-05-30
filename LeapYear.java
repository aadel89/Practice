/* Program for printing out leap years between given start and end date (valid from 1582, the first year of Gregorian calendar)
 * missing function: change condition for endYear form static to the current year"
*/

public class LeapYear {

    public static void main(String[] args) {
        
        leapYearPrinter(1882, 1900);

    }

    public static void leapYearPrinter (int startYear, int endYear) {
        
        if (startYear < 1582 && endYear > 2023) {
            System.out.println("Invalid start and end years. Please, give a start and an end year between 1582 (the first year of the Gregorian calendar) and the current year!");
        } else if (startYear < 1582 && endYear <= 2023) {
            System.out.println("Invalid start year. Please, give a year between 1582 (the first year of the Gregorian calendar) and the current year!");
        }  else if (endYear > 2023 && startYear >= 1582) {
            System.out.println("Invalid end year. Please, give a year between 1582 (the first year of the Gregorian calendar) and the current year!");
        } else if (endYear < startYear) {
            System.out.println("The given end year is a smaller number than the start year. Please, check your input data!");
        } else {

            int numLeapYears = 0; 

        for (int i = startYear; i <= endYear; i++) {
            if (i % 400 == 0) {
                System.out.println(i + ": is a LEAP YEAR");
                numLeapYears++;
            } else if (i % 100 == 0) {
                System.out.println(i + ": is a LEAP YEAR");
                numLeapYears++;
            } else if (i % 4 == 0) {
                System.out.println(i + ": is a LEAP YEAR");
                numLeapYears++;
            } else {
                System.out.println(i + " is not a leap year");
            }
        }

        if (numLeapYears > 1) {
            System.out.println("There are " + numLeapYears + " leap years between " + startYear + " and " + endYear);
        } else if (numLeapYears == 1) {
            System.out.println("There is 1 leap year between " + startYear + " and " + endYear);
        } else {
            System.out.println("There isn't any leap year between " + startYear + " and " + endYear);
        }

    }
    }

    }

