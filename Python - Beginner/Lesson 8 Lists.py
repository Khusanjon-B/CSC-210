#Lists

#have name for list

friends = ["Levin", "Mevin", "Jim", "Oscar", "Toby"]

#You can also have different datatypes for the list parts
other = ["Levin", 1, False]


print(friends)

#This prints out the values of different indexes of lists
print(friends[0])

#This prints out the last value and indexes work from the list backwards
print(friends[-1])

#This prints out index 1 and all the values after that
print(friends[1:])

#This prints out index 1 and upto but not including index 3
print(friends[1:3])

#you can change index values separately
friends[1] = "Mike"

friends[100] = "woah"