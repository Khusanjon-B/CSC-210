#List Functions

lucky_numbers = [1,1,2,3,5,8,13]

friends = ["Levin", "Mevin", "Jim", "Oscar", "Toby"]

print(friends)

#extend functions allows you to append lists

friends.extend(lucky_numbers)

print(friends)

#This function adds the indicated value to the end of the list
friends.append("Larry")
print(friends)

#insert function - first parameter is index at which you want to insert value, and then the value you want to add
#Everything else is moved to the right by one
friends.insert(1,"Kelly")
print(friends)

#This function allows you to remove any element you want from your list
friends.remove("Jim")
print(friends)

#This pop function removes the last element of the list
friends.pop()
print(friends)

#This function checks and returns index for search element
#However it will return an error if the value you search up is not in the list
print(friends.index("Oscar"))

#This function counts how many times a value shows up in the list
friends.append("Toby")
print(friends.count("Toby"))

#You can also sort the list in ascending order
friends = ["Levin", "Mevin", "Jim", "Oscar", "Toby"]
friends.sort()
print(friends)

#This function reverses a list
lucky_numbers.reverse()
print(lucky_numbers)

#You can copy one list onto another
friends2 = friends.copy()
print(friends2)

#This function clears the list
friends.clear()
print(friends)