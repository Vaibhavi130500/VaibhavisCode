#### **JAVA 8 Functional Interfaces combined example**

public static void main (String\[] args) throws java.lang.Exception

&nbsp;	{

&nbsp;		Predicate<Integer> predicate = x -> x % 2 == 0;  

&nbsp;		Function<Integer, Integer> function = x -> x \* x;

&nbsp;		Consumer<Integer> consumer = x -> System.out.println(x);

&nbsp;		Supplier<Integer> supplier = () -> 100;

&nbsp;		

&nbsp;		if(predicate.test(supplier.get()))

&nbsp;		{

&nbsp;		    consumer.accept(function.apply(supplier.get()));

&nbsp;		}

&nbsp;		

&nbsp;	}





###### **Explanation:**



**Definitions:**

Predicate<Integer> predicate: Checks if a number is even (x % 2 == 0).

Function<Integer, Integer> function: Squares a number (x \* x).

Consumer<Integer> consumer: Prints the input to the console.

Supplier<Integer> supplier: Provides the constant value 100.

**Conditional Check:**

The if statement calls supplier.get(), which returns 100.

predicate.test(100) evaluates if 100 is even. Since 100 % 2 == 0 is true, the code inside the block executes.

**Operation and Output:**

Inside the block, supplier.get() is called again, returning 100.

function.apply(100) calculates 100 \* 100, which equals 10,000.

consumer.accept(10000) executes System.out.println(10000), printing the final result.

