#To create lesson pages loop

#List of lessons
intermediate_class = [

    "Lists", "Tuples", "Dictionary", "Sets", "Strings", "Collections", "Itertools", "Lambda Functions", "Exceptions and Errors", "Logging", "JSON"," Random Numbers", "Decorators", "Generators", "Threading vs Multiprocessing", "Multithreading", "Multiprocessing", "Function Arguments", "Shallow vs Deep Copying", "Asteriks Operator", "Context Managers"
    
    ]


#Function that creates a file for each of the elements in the list above
def Create_Lesson_Folders(num):
    for index in range(num):
        class_file = open('Python - Intermediate/Lesson ' + str((index + 1)) + ' - ' + intermediate_class[index] + '.py' ,'w')
        class_file.write("#Lesson " + str((index + 1)) + ' - ' + intermediate_class[index])
        class_file.close()

Create_Lesson_Folders(len(intermediate_class))
