#If statements used to make decisions

is_male = False

#If is_male is True the body of the if statement will be executed
#else is your otherwise statement
if is_male:
    print("You are a male")
else:
    print("You are not a male")

is_tall = True
print("_____________________")

#multiple conditions, you can use AND or OR operators
if is_male or is_tall:
    print("You are male, tall, or both")
else:
    print("You are neither male or tall")

print("_____________________")
#and operator
if is_male and is_tall:
    print("You are a tall male")
else:
    print("You are either not male or not tall")

print("_____________________")

#else if statement addition and not operator
if is_male and is_tall:
    print("You are a tall male")
elif is_male and not(is_tall):
    print("You are a short male")
elif is_tall and not(is_male):
    print("You are not male but you are tall")
else:
    print("You are either not male or not tall")

