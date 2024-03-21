#Creates new line
print("Giraffe\nAcademy")

#Creates quotation mark
print("Giraffe\"Academy")

#Acts as regular backslash
print("Giraffe\Academy")

phrase = "Giraffe Academy"

print(phrase)

#Concatenation
print(phrase + " is cool")

#variable name . gives a lot of new function that can be used
print(phrase.lower())
print(phrase.upper())

#THis function returns boolean vlaue on whether or not the variable is in upper case
print(phrase.isupper())

#This function converts variable into upper case then returns boolean value on whether or not the value is upper case
print(phrase.upper().isupper())

#Prints how many the length in characters of the variable's value
print(len(phrase))

#This function give you the option to return the value of a certain index of the stored value
print(phrase[0])

#Index function where a character is located in the variable's stored value
print(phrase.index("a"))
#This one returns index at which the whole parameter starts in the stored variable value
#If we have a value that is not in string then error is returned
print(phrase.index("Academy"))

#This function replaces parts of string with indicated values
print(phrase.replace("Giraffe", "Elephant"))