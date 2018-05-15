package com.darkside.fb;

public class FizzBuzz {
    /**
     * Method that produces the following for any contiguous range of integers:
     * the number
     * ‘fizz’ for numbers that are multiples of 3
     * ‘buzz’ for numbers that are multiples of 5
     * ‘fizzbuzz’ for numbers that are multiples of 15
     *  If the number contains a three the text ‘lucky’ will be output. This overrides previous behaviour.
     *
     * @param lowerBound lower range number
     * @param upperBound upper range number
     * @return the output String
     */
    public String fizzBuzzness(int lowerBound, int upperBound)
    {
        StringBuilder output = new StringBuilder();

        for (int i = lowerBound; i <= upperBound; i++)
        {
            // Check for special case zero
            if (i == 0)
            {
                output.append(i).append(" ");
            }
            else if (String.valueOf(i).contains("3"))
            {
                output.append("lucky ");
            }
            else if (i % 15 == 0)
            {
                output.append("fizzbuzz ");
            }
            else if (i % 5 == 0)
            {
                output.append("buzz ");
            }
            else if (i % 3 == 0)
            {
                output.append("fizz ");
            }
            else
            {
                output.append(i).append(" ");
            }
        }

        return output.toString().trim();
    }
}
