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




#This allows for you to create a list with multiple of the same elements
myNewList = [1] * 5

print(myNewList)

myList2 = [1,2,3,4,5,7,8,9]

#This creates a list that concatenates the lists
new_list = myNewList + myList2

print(new_list)

#Slicing - this allows access to subparts of list using : which separates the start and stop indices but excluding the last index

a = myList2[2:6]

print(a)

#:5 - starts all the way from beginning
#5: - goes all the way to the end

# ::1 - goes from beginning to end by 1 index jumps
# ::2 - goes from beginning to end by 2 index jumps

# ::-1 reverses list

list_org = ["banana", "cherry", "apple"]

list_cpy = list_org
# If you do the above then whatever change you make to the copy then you also change the original list

#better to use the following methods

list_cpy = list_org.copy()
list_cpy = list(list_org)
list_cpy = list_org[:] #Takes everything from original list

#List comprehension
#fast way to create new list from existing list

b = [1,2,3,4,5,6,7]
#This squares the values in b and then assigns it to list c
c = [i*i for i in b]