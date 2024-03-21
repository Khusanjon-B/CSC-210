#Basic Calculator

#num1 = input("Enter a number: ")

#num2 = input("Enter another number: ")

#result = num1 + num2

#print(result)

#The above gives the wrong answer because when you get input from user Python always converts it into a string, so you have to use int() function to turn input into integers
#integer value cannot accept decimals you will get error
#So instead of int() function, you can use the float() function to convert strings decimals to number decimals

num1 = input("Enter a number: ")

num2 = input("Enter another number: ")

result = float(num1) + float(num2)

print(result)

