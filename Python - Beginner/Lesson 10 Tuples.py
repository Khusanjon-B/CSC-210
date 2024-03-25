#Tuples

#A tuple is a type of data structure - container where we can store different values

#Basically a list, but key differences

#Tuples made through () not []

coordinates = (4,5)

coordinates = (4,5), (6,7)

#Tuples are immutable, once we create it you cannot add, change, erase, or anything like that
#You cannot change tuples


#You reference the tuple elements the same way as you would with lists
print(coordinates[1])

#If you try to assign items to tuple then you will get an error message

#You use tuples for data that will not change

#You can turn tuples in to list of tuples

coordinates = [(4,5), (6,7), (80,34)]
print(coordinates)