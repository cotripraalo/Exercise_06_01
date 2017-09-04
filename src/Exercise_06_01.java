/*
(Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2 for
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
Write a method with the following header that returns a pentagonal number:

public static int getPentagonalNumber(int n)

Write a test progam that uses this method to display the first 100 pentagonal
numbers with 10 numbers on each line.
*/
public class Exercise_06_01 {
/** Main Method
     * @param args */
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONALS = 100; //Display the first 100 pentagonal
        final int NUMBER_PER_LINE = 10; //Display 10 number per line
        
        // Display the first 100 pentagol numbers
        System.out.println("The first 100 pentagonal numbers, ten per line: ");
        for(int i=1; i<= NUMBER_OF_PENTAGONALS; i++){
            // Print ten numbers per line
            if(i % NUMBER_PER_LINE == 0)
                System.out.println("%7d\n", getPentagonalNumber(i));
            else
                System.out.println("%7d", getPentagonalNumber(i));
        }
    }
    
    /** Return a pentagonal number
     * @param n
     * @return  */
    public static int getPentagonalNumber(int n) {
        return(n *(3*n -1))/2;
    }
        }
    
    

