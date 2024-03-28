#Lesson 3 - Dictionary

#Data collection that is unordered and mutable

#Key value pairs

myDictionary = {"Name":"Max", "Age":28, "City":"New York"}

print(myDictionary)

dictionary2 = dict(name = "Mary", age = 27, city = "Boston") #You don't have to use quotes for your keys when making dictionaries using this method

print(dictionary2)

#Accessing values
value = myDictionary["Name"]
print(value)

#Adding key value pairs
myDictionary["email"] = "max@xyz.com"

#Deleting items
del myDictionary["Name"]
print(myDictionary)

myDictionary = {"Name":"Max", "Age":28, "City":"New York"}

myDictionary.pop("Age")
print(myDictionary)

myDictionary = {"Name":"Max", "Age":28, "City":"New York"}

myDictionary.popitem() #Removes last item
print(myDictionary)


myDictionary = {"Name":"Max", "Age":28, "City":"New York"}

#Checking if keys inside dictionary
if "Name" in myDictionary:
    print(myDictionary["Name"])

try:
    print(myDictionary["name"])
except:
    print("Error")

#Looping through dictionaries
for key in myDictionary:
    print(key)

for key in myDictionary.keys(): #This does the exact same thing, but it just does it through a list of keys
    print(key)

for values in myDictionary.values(): #This loops through the list of values
    print(values)

for keys, values in myDictionary.items(): #This allows you to print both
    print(keys, values)

#Copying dictionaries
myDictionaryCopy = myDictionary #If we do this then modifying the copy will modify the original dictionary as well

myDictionaryCopy = myDictionary.copy() #This is better to use because it doesn't change the original one

myDictionaryCopy = dict(myDictionary) #This is also a good choice

#Updating Dictionaries
myDictionary = {"Name":"Max", "Age":28, "Email":"max@xyz.com"}
myDictionary2 = dict(Name = "Mary", Age = 27, City = "Boston")

myDictionary.update(myDictionary2) #This means that the 2 values override the initial values, but new keys are just added on, not removed
print(myDictionary)

#Key Types - The one type that DOES NOT work are lists because they can be changed
myDictionary = {3: 9, 6: 36, 9: 81} #Doing this may be useful, but when later referencing the index of the dictionary, you cannot do it because you are using numbers as your keys
print(myDictionary)

myTuple = (8,7)
myDict = {myTuple: 15} #This means that the tuple is now the key
print(myDict)