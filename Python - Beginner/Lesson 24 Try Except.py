#catching errors in python

#When these situations happen they can crash and stop program

'''
number = int(input("Enter a number: "))

print(number)

'''

#If you enter anything except a number you will get error so you can use try and except blocks

try:
    number = int(input("Enter a number: "))

    print(number)

except:
    print("Invalid Input")
    #the downside for this is that this except block will catch every single error there is
    #so if I put the following
    # value = 10/0 into the try block, then I will get the same invalid input output

#So you can set different error filters for the except blocks

try:

    value = 10/0

    number = int(input("Enter a number: "))

    print(number)

except ZeroDivisionError:
    print("You can't divide by zero")

    '''
        I can also write as follows

            except ZeroDivisionError as err:
                print(err)

        And this will output the default error code that python has for this type of error
    
    '''

except ValueError:
    print("Invalid Input")