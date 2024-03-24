#Translating to different language

'''
Giraffe Language

vowels -> g

dog -> dgg

cat -> dgt

'''

def translate(word):

    translation = ""

    for letter in word:

        if letter in "AEIOUaeiou": #This checks if letter is inside of this string

            #You can technically havea shortcut because you can do: if letter.lower in "aeiou"

            if letter.isupper(): #this checks to see if the letter is upper case to keep format
                translation = translation + "G"
            else:
                translation = translation + "g"

        else:

            translation = translation + letter

    return translation


print(translate(input("Enter a phrase to be turned into giraffe language: \n")))