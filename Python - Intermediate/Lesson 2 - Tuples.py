#Lesson 2 - Tuples

# Tuples - ordered, immutable, allows duplicate elements
#Cannot be changed after its creation

#Elements separated by commas

myTuple = "Max",(28, "Boston") #The parentheses are optional, so they would still be tuple
print(myTuple)

#If you have a tuple with only one element you have to put a comma after the element or else it will not be recognized as a tuple but whatever datatype the element is

#Another way of creating tuple

xTuple = tuple(["mac", 28, "France"])

type(myTuple) #This gives you the datatype

print(myTuple)

item = myTuple[0] #You have to refer to tuple elements using brackets
item = myTuple[-1] # This is the last item in teh list

for i in myTuple:
    print(i)

if "mac" in myTuple:
    print("Yes")

#How many elements you have in tuple
len(myTuple)

myTuple.count("1") #This counts how many of the values indicated are in your tuple

#Finding index of indicated value:
myTuple.index("Max")

#Conversion between list and tuples

my_list = list(myTuple)
print(my_list)

myTuple2 = tuple(my_list)
print(myTuple2)


#Slicing with tuples works with the same syntax as lists

#Unpacking - kind of similar to dictionaries

newTuple = "Max", 28, "Boston"

name, age, city = newTuple

print(name)
print(age)
print(city)

secondTuple = tuple(range(5)) #This creates a tuple from elements 0-number

print(secondTuple)

i1, *i2, i3 = secondTuple

print(i1) #This is the first value
print(i2) #This is now everything in between first and last, and put into a list
print(i3) #This is the last value

#######################################

#Tuples are more efficient than lists

import sys

myList = [0,1,2, "Hellow", True]
testTuple = (0,1,2, "Hellow", True)
print(sys.getsizeof(myList), "bytes")
print(sys.getsizeof(testTuple), "bytes")

import timeit

print(timeit.timeit(stmt= "[0,1,2,3,4,5,6]", number=10000000))
print(timeit.timeit(stmt= "(0,1,2,3,4,5,6)", number=10000000))