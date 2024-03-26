'''
Program includes a function isDescending that receives a list as an argument and returns True if the list is in descending order, or returns False otherwise,

reads the external file numbers.txt that was created in previous step,

invokes the isDescending function to determine whether or not the numbers in numbers.txt are in descending order, and

outputs the results with a complete and informative sentence.

'''

#This is my isDescending function that takes in a list as input

def isDescending(list):

    #I forgot how to use the sorted function, so I just used for loop to make up for it

    #This variable is to keep track of the truth value of the descending condition in the if-statement
    desc = True

    for index in range(len(list)-1):

        if (list[index] < list[index + 1]):

            desc = False

    #This is returns a truth value of whether or not the list entered was in descending order

    if desc == True:

        return True
    
    else:

        return False

#This assigns the file contents to a variable

numberFile = open('CSC 210 Work - Java/Testing Out of CSC 110/numbers.txt',"r")

#This is a list that I will assign the numbers to
numberList = []

#This for loop assigns the numbers in the text file
for line in numberFile:
    numberList.append(int(line))

#This is just to check if I did the above correctly
print(numberList)

#This is the final ouput in a informative  sentence

if(isDescending(numberList)==True):

    print("The list that you entered is in descending order.")

else:

    print("The list that you entered is not in descending order.")

