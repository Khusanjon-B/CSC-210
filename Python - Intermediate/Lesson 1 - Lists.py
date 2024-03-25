#Lesson 1 - Lists

#Lists: ordered, mutable, allows duplicate elements

myList = [1,2,3,4,"Five", False, False]

print(myList)

myList2 = list() #Creates an empty list

print(myList2)

#You can assign value to a variable by calling on the list index value - if index too large it gets error
item = myList[3]

print(myList[-1])

for i in myList:
    print(i) #Prints each element separately

#Checking if item is in list
if "Five" in myList:
    print("Yes")
else:
    print("No")

#Prints length of list
print(len(myList))

#Adding to the list
myList.append("Woah")

print(myList)

#Inserting stuff into list into certain index
myList.insert(1, "Neat")
print(myList)

#Pop function returns and also deletes last item in list - kind of like cut and paste
last = myList.pop()
print(last)

print(myList)

#Removing Specific elements, you can specify index or value
myList.remove("Neat")

myListReversed = myList.reverse() #But this reverses your list as well so do the following

newList = sorted(myList)

'''myListSorted = myList.sort()''' #But this only works for number values not strings or boolean values

print(myListReversed)

print(myList)

myList.clear()#This empties your list