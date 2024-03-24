#Exponents

#2^3
print(2**3)

def raise_to_power(num, exp):
    result = 1
    for index in range(exp):
        result = result * num
    return result

print(raise_to_power(4,2))