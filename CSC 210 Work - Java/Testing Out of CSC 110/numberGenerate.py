#Generates 100 random numbers, which are written one number per line to the external file

import random

def generateRandomNumbers():

    numberFile = open('CSC 210 Work - Java/Testing Out of CSC 110/numbers.txt',"w")

    for index in range(0,100):

        numberFile.write(str(random.randint(0,100)) + '\n')
    
    numberFile.close()

generateRandomNumbers()