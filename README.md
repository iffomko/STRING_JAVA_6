# STRING (BEFORE JAVA 7)
 I practiced implementing strings, which uses in versions before java 7. This method of implementing strings is the most time-efficient, but takes up more memory. More time-efficient achieved by immutable classes (design-pattern).


- constructor MyString gets in arguments "strings" or variable with type of string and initialize values of object
- method .setStr() gets in argiments "strings" or variable with type of strings and initialize values of object
- method .println() print string on screen with a transfer to another line
- method .print() print string on screen without a transfer to another line
- method .length() returns a length of string
- method .substr(), which gets in first argument begin position and the second argument final position, returns object with type of MyString which contains substring value
- method .append(), which gets in arguments "string" or variable with type of String, insert new string from the arguments in end of value of string in this object
- method .prepend(), which gets in arguments "string" or variable with type of String, insert new string from the arguments in begin of value of string in this object
- method .charAt(), which gets in arguments index of symbol, returns symbol by this position
