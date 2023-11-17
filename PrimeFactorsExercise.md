# Prime Factorization

---

> A prime factor is a natural number, other than 1, whose only factors are 1 and itself. The first few prime numbers are actually 2, 3, 5, 7, 11, and so on. Now we can also use what’s called prime factorization for numbers which actually consist of using factor trees. Prime factorization is a process of writing all numbers as a product of primes. So, for example, say if we have something like the number 20. We can break that down into two factors. We can say, “well, that’s 4 times 5.” And notice, 5 is a prime number. 4 is not a prime number. That’s called a composite number. But if we break these things down, then we‘ve got 2 times 2 equals 4, and these 2’s are actually prime numbers, so we can circle those. So, we can say the prime factorization of 20 actually equals 2 times 2 times 5. And you don’t always have to do the 4 times 5. You could break 20 down into 2 times 10. Whichever way you’d like is fine. So, notice 2 times 10, that 2 is prime, whereas the 10 is composite. So we can break that down into 2 times 5. So we’re circling all the prime numbers that we see. And, again, we’ve got 2 times 2 times 5 equaling 20. So that’s prime factorization.

---

**List of some Prime Numbers**
>2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, and so on...
> >Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11. By contrast, numbers with more than 2 factors are call composite numbers.

**Examples**

        4         |        8            |      100                  
    2       2     |    2       4        |   2       50              
                  |        2       2    |       2        25         
                  |                     |            5         5    
                  |                     |                           
                  |                     |                           
    4 => 2 * 2    |   8 => 2 * 2 * 2    |  100 => 2 * 2 * 5 * 5

**The Process**
> 1. Is the number divisible by 2?
> 2. If true, then divide by 2.
>   - if false, increase the divisor and try again.
> 3. Repeat

**Instruction**
> You'll now write a java program for Prime factorization.
> 1. Write a java program that would get the prime factors of any input number.
> 2. The user should have an option to be able to enter another number or end the program.
> > **Tip:** _Follow the process_.

   >**Example Output:**
   >
   > ```shell
   > Please enter a number: 4
   > The prime factor for 4 are: 2 , 2
   > Would you like to continue? Yes[1] No[0]
   > > 1
   > Please enter a number: 8
   > The prime factor for 8 are: 2 , 2 , 2
   > Would you like to continue? Yes[1] No[0]
   > > 1
   > Please enter a number: 100
   > The prime factor for 100 are: 2 , 2 , 5 , 5 
   > Would you like to continue? Yes[1] No[0]
   > > 0
   > 
   > [Exit]
   > ```