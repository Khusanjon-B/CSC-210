#Learning about return statement

#If you call a function and then try to use output without a return statement then you will not get the right thing

def cube(num):
    return pow(num,3)

print(cube(4))

#This stores the returned value if you want it like that
result = cube(4)
print(result)

#Anything after the return statement will be ignored