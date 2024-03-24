#For loops

#letter is a variable that you declare

#below, for every letter in Giraffe Academy -> prints it out

for letter in "Giraffe Academy":
    print(letter)

for i in "Giraffe Academy":
    print(i)

#Both for loops do the exact same thing

#The for loop below prints a friends for each friend in friends list
friends = ["Jim", "Karen", "Kevin"]

for friend in friends:
    print(friend)

#The for loop in python already predetermines the type of elements in given value to assign to each for loop run

#the following for loops has the predefined function range, and it goes from 0 to 10, but not including 10
for index in range(10):
    print(index)

for index in range(3,10):
    print(index)

#You can use for loops to call upon each value in list

for index in range(len(friends)):
    print(friends[index])


#if statement inside of for loop
for index in range(len(friends)):
    if (index == 0):
        print("This is my best friend: " + friends[index])
    else:
        print("This is my friend: " + friends[index])
    