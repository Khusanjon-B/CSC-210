#Can call functions when needed - same as methods in java and functions in javascript


#You need def keyword to make a function in python, and the colon : is to indicate the body of the function that follows
#If you do not indent then it is not considered inside function's body
def say_hi():
    print("Hello user!")

#Calling function:
say_hi()

#Parameters
def say_hi_name(name, age):
    print("Hello " + name)
    print("You are " + str(age))

say_hi_name("Mike!", 18)