# java-basics-day-1-
## quick notes
	• static initialisation block-used to create n exploit static variables
	• int to string- Integer.toString(int)
	• date and time -LocalDate.of(dd,mm,yyyy)
	• Locale(language,country_name)-currency formatting
 ## Data types
    class has first word capital
    packages first letter small
    float r =2.3f
    int, short, long ,double
## type casting
    widening-automatic
    ** byte -> short-> char-> int-> long-> float-> double **
	boolean cant be type casted
	narrowing-manual(when we go opposite to it)
	floor value will be printed
	in objects-the bigger objects can be type casted to smaller not the vice versa
## stacks
	 In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection,and pop, which removes the last element that was added.
## field modifiers
	ACCESS CONTROL MODIFIERS
	• private-acces. only in class
	• package-acs. in classes in the same package, and the class itself
	• protected-classes in same package ,subclasses of the class and in the class itself
	• public-acs.  anywhere the class is accesible
	STATIC
	• only one copy of the static field exists,shared by all objects of this class
	• can be accessed directly in the class itself
	• access from outside the class must be preceded by the classname-Pencil.nextId
	or via an object belonging to the class
	• from outside the class,non static fields must be accessed through an object reference
	FINAL
	• once initialised,value cant be changed
	• often be used to define named constants
	• static final fields must e initialised when the class is initialised
	• non static final fields must be initialised when an object of the class is constructed
## operators
	ARITHMATIC 
	• precedence(bodmas)
	• c=++b(c=b , b=b+1)
	• c=b++(c=b+1 , b=b+1)
	BITWISE
	• & and
	• | or
	• rightshift-b>>n- shifts n times-value decreses -divide by 2**n
	• left shift-b<<n-value increases -multiply by 2**n
	ASSIGNMENT 
	• =
	• +=
	• -=
	• %=
	• /=
	• *=
	• >>=
	• |=
	COMPARISION
	• ==
	• >= prints boolean
	• <=
	LOGICAL
	• && 
	• ||
	•  !
	CONDITIONAL
	• ==
	• !=
	• >
	• <
	• >=
	• <= 
	condition ?----:------

## strings
	two types of creation-heap area,pool area
	pool area -already created-String varName-by literals
	heap area-new String varName--by objects
	pool area for optimisation.strings are immutable
	• char charAt(int index)
	• int length()-even spaces in string are also counted
	• String substring(int beginIndex)
	• String substring(int beginIndex ,int endIndex)
	• boolean contains(char Sequence s)
	• boolean equals(Object another )
	• boolean isEmpty()
	• String concat(String str)
	• String replace(char old,char new)-making new string-old still present
	• String[] split(String regex)
	• int indexOf(int ch)
	• String toLowerCase()-makes new string
	• String toUpperCase()
	• String trim()-removes trailing spaces
	• StringBuilder to reverse the string
	• compareTo for lexigrapic search
	• String[] string.split([deliminators]+)
	• use try catch for catching wrong syntax
	
	1) \\d{1,2} catches any one or two digit number
	2) (0|1)\\d{2} catches any three digit number starting with 0 or 1.
	3) 2[0-4]\\d catches numbers between 200 and 249.
	4) 25[0-5] catches numbers between 250 and 255.
	Note that \d represents digits in regular expressions, same as [0-9]
	Edit: Replaced "." with "\." as suggested in some of the comments
	• regrex-https://www.vogella.com/tutorials/JavaRegularExpressions/article.html#rules-of-writing-regular-expressions
	
## oops
	• extends keyword for inheritance
	• @override-to ignore compiler problems related to same names-
	When overriding a method, you should precede it with the @Override annotation.
	The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.
	When a method in a subclass overrides a method in superclass,it is still possible to call the overridden method using super keyword.
	If you write super.func() to call the function func(), it will call the method that was defined in the superclass.
	• abstract class-base class -cant create its instances
	• interfaces-can contain only method signatures and fields-used to achieve polymorphism-implements keyword 
	• Iterator class-to iter over collections
	• object of childclass can be type casted to object of parent class
	• while extending the parent clss should have a default constructor




	
	
	





