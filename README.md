# hf-kotlin-griffiths
Practical part of the "Head First Kotlin" book.


## Chapter 1. Getting started: A Quick Dip

Key points:
- Use `fun` to define a function.
- Every application needs a function named main.
- Use `//` to denote a single-lined comment.
- A String is a string of characters. You denote a String value by enclosing its characters in double quotes.
- Code blocks are defined by a pair of curly braces `{ }`.
- The assignment operator is one equals sign `=`.
- The equals operator uses two equals signs `==`.
- Use var to define a variable whose value may change.
- Use val to define a value whose value will stay the same.
- A while loop runs everything within its block so long as the conditional test is true.
- If the conditional test is false, the while loop code block won’t run, and execution will move down to the code immediately after the loop block.
- Put a conditional test inside parentheses `( )`.
- Add conditional branches to your code using if and else. The else clause is optional.
- You can use if as an expression so that it returns a value. In this case, the else clause is mandatory.


## Chapter 2. Basic types and variables: Being a Variable

Key points:
- In order to create a variable, the compiler needs to know its name, its type, and whether it can be reused.
- If the variable’s type isn’t explicitly defined, the compiler infers it from its value.
- A variable holds a reference to an object.
- An object has state and behavior. Its behavior is exposed through its functions.
- Defining the variable with var means the variable’s object reference can be replaced. Defining the variable with val means the variable holds a reference to the same object forever.
- Kotlin has a number of basic types: `Byte`, `Short`, `Int`, `Long`, `Float`, `Double`, `Boolean`, `Char` and `String`.
- Explicitly define a variable’s type by putting a colon after the variable’s name, followed by the type: `var tinyNum: Byte`
- You can only assign a value to a variable that has a compatible type.
- You can convert one numeric type to another. If the value won’t fit into the new type, some precision is lost.
- Create an array using the arrayOf function: `var myArray = arrayOf(1, 2, 3)`
- Access an array’s items using, for example, myArray[0]. The first item in an array has an index of 0.
- Get an array’s size using `myArray.size`.
- The compiler infers the array’s type from its items. You can explicitly define an array’s type like this: `var myArray: Array<Byte>`
- If you define an array using val, you can still update the items in the array.
- String templates provide a quick and easy way of referring to a variable or evaluating an expression from inside a String.


## Chapter 3. Functions: Getting Out of Main

Key points:
- Use functions to organize your code and make it more reusable.
- A function can have parameters, so you can pass more than one value to it.
- The number and type of values you pass to the function must match the order and type of the parameters declared by the function.
- A function can return a value. You must define the type of value (if any) it returns.
- A `Unit` return type means that the function doesn’t return anything.
- Choose for loops over while loops when you know how many times you want to repeat the loop code.
- The `readLine()` function reads a line of input from the standard input stream. It returns a `String` value, the text entered by the user.
- If the input stream has been redirected to a file and the end of the file has been reached, the `readLine()` function returns `null`. `null` means it has no value, or it’s missing.
- `&&` means “and”. `||` means “or”. `!` means “not”.
