'''def generate_sequence(n):
    # Initialize the sequence with first two terms
    sequence = [1, 2]

    # Generate subsequent terms using the given recurrence relation
    for i in range(2, n):
        next_term = (sequence[i - 1] * sequence[i - 2]) ** 0.5
        sequence.append(next_term)

    return sequence

# Generate the first 30 terms
first_30_terms = generate_sequence(30)

# Print the first 30 terms
print("The first 30 terms of the sequence are:")
print(first_30_terms)

'''

import random

def generateRandomNumbers():

    numberFile = open('CSC 210 Work - Java/Testing Out of CSC 110/numbers2.txt',"w")

    for index in range(0,10):

        numberFile.write(str(random.randint(0,100)) + "\n")

    print(numberFile)
    
    numberFile.close()


generateRandomNumbers()

