Task 

You and your friends have decided to start exercising together every week. But
before you could even get started the discussion about what shoes are the best
surfaced. As your friends knows that you “know computers” they asked you to
create a program that could keep track of different pairs of shoes.

Create the program according to the following requirements:

1) Create a base class called Shoe that stores the brand of the shoe as a String
and the size of the shoe as a double. Create a constructor that takes two
parameters, the brand and the size. Make the instance variables public and
final.

2) Create one subclass to Shoe that is called Walking, this subclass shall have
a boolean instance variable called goreTex. The constructor shall set the
goreTex variable from a parameter value. The instance variable shall be
declared public and final. The constructor shall also take the parameters
necessary to call the constructor of the superclass.

3) Create a second subclass to Shoe called Running. This class shall work
exactly like the Walking subclass but the instance variable shall be named
weight and be a double.

4)Create three pair of shoes in the main method, two pairs of walking shoes
and one pair of running shoes. Make sure the objects store the following
data:

Brand     Size      Gore-tex      Weight
Nike       43                       250
Hanwag     43,5       Yes
Merrell    42         No

5) Store the three objects in an array.

6) Use a loop and the array to print all the information about the three pair of
shoes without using a toString method. The information shall be printed
using the following format:


Nike      size   43,0     250 grams / shoe
Hanwag    size   43,5     Gore-Tex
Merrell   size   42,0     No Gore-Tex


7) It is very important that the output is formatted correctly.

The program must use at least:

Four classes (the main class + three other)
The final keyword

An array

A loop

The instanceof keyword
