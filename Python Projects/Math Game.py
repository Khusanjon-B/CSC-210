import time
import random

myList = list(range(1000))

gameList = []

gameList2 = []

for i in myList:
    myList[i] += 1

score = 0

streak = 0

timeStart = 0

totalQ = 0

totalR = 0

timer = 0

gameInfo = {"Operator":"N/A", "Numbers":"-"}

print("\nWelcome to the math game!")

userInput = input("Which operation would you like to practice multiplication, division, addition, or subtraction? (M,D,A,S)\n")

gameInfo["Operator"] = userInput

uInput = userInput.upper()

if (uInput == "M") or (uInput == "D"):

    numTVal = 0

    while numTVal != True:

        userInput = input("Enter a number you would like to go upto:\n")

        try:
            
            uInput = int(userInput)

            numTVal = isinstance(uInput, int)
        
        except ValueError:
            
            numTVal = isinstance(uInput, int)

    gameInfo["Numbers"] = uInput

    for i in range(gameInfo["Numbers"]):
        gameList.append(i+1)

elif (uInput == "A") or (uInput == "S"):

    while uInput not in "ONESTENSHUNDREDS":
        
        userInput = input("Would you like to go upto ones, tens, or hundreds? (Ones/Tens/Hundreds)\n")
        
        uInput = userInput.upper()

        gameInfo["Numbers"] = uInput

        if uInput == "ONES":
            for i in range(len(myList)):
                if myList[i] < 10:
                    gameList.append(myList[i])
    
        elif uInput == "TENS":
            for i in range(len(myList)):
                if myList[i] < 100:
                    gameList.append(myList[i])

        elif uInput == "HUNDREDS":
            for i in range(len(myList)):
                if myList[i] < 1000:
                    gameList.append(myList[i])
else:
    while uInput not in "MADS":
        userInput = input("Enter the operator you would like to practice: (M,D,A,S)\n")
        uInput = userInput.upper()

        if (uInput == "M") or (uInput == "D"):
    
            userInput = input("Enter a number you would like to go upto:\n")

            gameInfo["Numbers"] = int(userInput)

            for i in range(gameInfo["Numbers"]):
                gameList.append(i+1)

        elif (uInput == "A") or (uInput == "S"):

            while uInput not in "ONESTENSHUNDREDS":
        
                userInput = input("Would you like to go upto ones, tens, or hundreds? (Ones/Tens/Hundreds)\n")
        
                uInput = userInput.upper()

                gameInfo["Numbers"] = uInput

                if uInput == "ONES":
                    for i in range(len(myList)):
                        if myList[i] < 10:
                            gameList.append(myList[i])
    
                elif uInput == "TENS":
                    for i in range(len(myList)):
                        if myList[i] < 100:
                            gameList.append(myList[i])

                elif uInput == "HUNDREDS":
                    for i in range(len(myList)):
                        if myList[i] < 1000:
                            gameList.append(myList[i])

userInput = input("Do you want a timer? (Yes/No)\n")

uInput = userInput.upper()

while (uInput not in "YESNO"):
    userInput = input("Do you want a timer? (Yes/No)\n")

    uInput = userInput.upper()

if (uInput == "YES"):

    numTVal = 0

    while numTVal != True:

        userInput = input("Enter time in seconds:\n")

        try:
            
            uInput = int(userInput)

            numTVal = isinstance(uInput, int)
        
        except ValueError:
            
            numTVal = isinstance(uInput, int)
    
    timer = uInput

    seconds = timer % 60
    minutes = int(timer / 60) % 60
    hours = int(timer / 3600)
    print("The time you entered was : " + f"{hours:02}:{minutes:02}:{seconds:02}")

    while userInput not in "GoGOgo":
        userInput = input("Type ""Go"" to begin\n")

    for t in range(3, 0, -1):
        seconds = t % 60
        minutes = int(t / 60) % 60
        hours = int(t / 3600)
        print(f"{seconds:02}")
        time.sleep(1)

    timeStart = time.time()

else:
    userInput = input("Type ""Go"" to begin\n")
    while userInput not in "GoGOgo":
        userInput = input("Type ""Go"" to begin\n")
    
    timer = 100000000000000

    for t in range(3, 0, -1):
        seconds = t % 60
        minutes = int(t / 60) % 60
        hours = int(t / 3600)
        print(f"{seconds:02}")
        time.sleep(1)

timeDiff = time.time() - timeStart

while (userInput not in "STOPstopStop") and (timeDiff < timer):
    
    timeDiff = time.time() - timeStart
    
    length = len(gameList)-1

    ranNum1 = random.randint(0, length)

    ranNum2 = random.randint(0, length)

    mode = gameInfo["Operator"].upper()
    
    if (mode == "M"):

        num1 = gameList[ranNum1]

        num2 = gameList[ranNum2]
        
        ans = num1*num2

        totalQ += 1

        userInput = input (str(num1) + " x " + str(num2) + " =       Score: " + str(score) + "   To stop type STOP\n")

        if userInput not in "STOPstopStop":

            if int(userInput) == ans:

                streak +=1

                totalR +=1

                if streak > 20:
                    score += 11
                elif(streak > 15):
                    score += 7
                elif(streak > 10):
                    score += 4
                elif(streak > 5):
                    score += 2
                else:
                    score += 1

                print("That's Right! Score: " + str(score) + "\n")

            else:
            
                streak = 0

                if score != 0:
                
                    score -=1
            
                print("Incorrect. The answer was " + str(ans) + ".  Score: " + str(score) + "\n")
    
    elif (mode == "D"):
        
        num1 = gameList[ranNum1]

        num2 = gameList[ranNum2]

        ans = num1 * num2

        totalQ += 1

        userInput = input (str(ans) + " / " + str(num1) + " =       Score: " + str(score) + "   To stop type STOP\n")
        
        if userInput not in " STOP stop Stop ":

            if int(userInput) == num2:
            
                streak +=1

                totalR += 1

                if streak > 20:
                    score += 11
                elif(streak > 15):
                    score += 7
                elif(streak > 10):
                    score += 4
                elif(streak > 5):
                    score += 2
                else:
                    score += 1

                print("That's Right! Score: " + str(score) + "\n")

            else:
            
                streak = 0

                if score != 0:
                
                    score -=1
            
                print("Incorrect. The answer was " + str(num2) + ".  Score: " + str(score) + "\n")

    elif (mode == "S"):
        
        num1 = gameList[ranNum1]

        num2 = gameList[ranNum2]

        problem = ""

        if num1 > num2:
            
            problem = str(num1) + " - " + str(num2)
            ans = num1 - num2
        
        else:
            
            problem = str(num2) + " - " + str(num1)
            ans = num2 - num1

        totalQ += 1

        userInput = input (problem + " =       Score: " + str(score) + "   To stop type STOP\n")
        
        if userInput not in "STOPstopStop":

            if int(userInput) == ans:
            
                streak +=1

                totalR += 1

                if streak > 20:
                    score += 11
                elif(streak > 15):
                    score += 7
                elif(streak > 10):
                    score += 4
                elif(streak > 5):
                    score += 2
                else:
                    score += 1

                print("That's Right! Score: " + str(score) + "\n")

            else:
            
                streak = 0

                if score != 0:
                
                    score -=1
            
                print("Incorrect. The answer was " + str(ans) + ".  Score: " + str(score) + "\n")

    elif (mode == "A"):
        
        num1 = gameList[ranNum1]

        num2 = gameList[ranNum2]

        ans = num1 + num2

        totalQ += 1

        userInput = input (str(num1) + " + " + str(num2) + " =       Score: " + str(score) + "   To stop type STOP\n")
        
        uInput = userInput.upper()

        if uInput != "STOP":
        
            if int(userInput) == ans:
            
                streak +=1

                totalR += 1

                if streak > 20:
                    score += 11
                elif(streak > 15):
                    score += 7
                elif(streak > 10):
                    score += 4
                elif(streak > 5):
                    score += 2
                else:
                    score += 1

                print("That's Right! Score: " + str(score) + "\n")

            else:
            
                streak = 0

                if score != 0:
                
                    score -=1
            
                print("Incorrect. The answer was " + str(ans) + ".  Score: " + str(score) + "\n")
    
    timeDiff = time.time() - timeStart


if (timeDiff > timer):
    print("Times Up!")

print("Your score is " + str(score) + "!" + " You got " + str(totalR) + " out of " + str(totalQ))


'''________________________________________________________________________________________________________

-------THIS SECTION IS NOT COMPLETE --------------------------------
    
    elif (gameInfo["Operator"] == "ALL"):
    
    '''

''' -------------THIS SECTION IS CODED INCORRECTLY IN TERMS OF WHAT IT IS MEANT TO ACCOMPLISH------------

    elif (userInput == "ALL"):
    
    while userInput not in myList:
        userInput = input("Enter a number you would like to go upto:\n")
        
        gameInfo["Numbers"] = int(userInput) - 1

        for i in range(gameInfo["Numbers"]):
            gameList.append(i+1)

    while userInput not in "OnesTensHundreds":
        
        userInput = input("Would you like to go upto ones, tens, or hundreds? (Ones/Tens/Hundreds)\n")

        if userInput == "Ones":
            for i in myList:
                if myList[i] < 10:
                    gameInfo["Numbers"] = myList[i]
    
        elif userInput == "Tens":
            for i in myList:
                if myList[i] < 100:
                    gameInfo["Numbers"] = myList[i]

        elif userInput == "Hundreds":
            for i in myList:
                if myList[i] < 1000:
                    gameInfo["Numbers"] = myList[i]

'''



'''def timer():
    my_time = int(input("Enter the time in seconds: "))

    for x in range(my_time, 0, -1):
        seconds = x % 60
        minutes = int(x / 60) % 60
        hours = int(x / 3600)
        print(f"{hours:02}:{minutes:02}:{seconds:02}")
        time.sleep(1)

    print("TIME'S UP!")

timer()'''


''' ------------THIS UNNECESSARILY LISTS ALL COMBINATIONS-----------------


myAnswersUpTo20 = []

answers = open("Python Projects/MultiplicationAnswers.txt","w")

for num1 in range(len(myListUpTo20)):
    num1 += 1
    for num2 in range(len(myListUpTo20)):
        num2 += 1
        numList = [num1, num2]
        numAns = num1*num2

        print(str(numList) + " = " + str(numAns))

        #myAnswersUpTo20[num2-1] = [numTuple, numAns]

        answers.write(str(numList) + " = " + str(numAns) + "\n")

'''
