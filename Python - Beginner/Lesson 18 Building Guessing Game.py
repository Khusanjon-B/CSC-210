#Guessing Game

#Specify secret word, and user will interact with the program until they guess word

secret_word = "Giraffe"

user_guess = ""

guess_limit = 5

guess_list = []

while (user_guess != secret_word) and (len(guess_list) < guess_limit):
    user_guess = input("Enter guess: ")
    guess_list.append(user_guess)


if (guess_list[-1] == secret_word):

    print("You win! Here are the " + str(len(guess_list)) + " guesses you made \n" + str(guess_list))

elif (len(guess_list) <= guess_limit):

    print("Sorry, you have used all " + str(guess_limit) + " guesses. The secret word was " + secret_word + ".")

