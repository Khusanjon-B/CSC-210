employee_file = open('Python/Lesson 25 & 26 Reading and Writing Files/employees.txt','r')

print(employee_file.read())

employee_file.close()

#New employee joined - if you run it multiple times you will be adding the same thing multiple times
employee_file = open('Python/Lesson 25 & 26 Reading and Writing Files/employees.txt','a')

employee_file.write("Toby - Human Resources")

employee_file.write("\nKelley - Customer Service")

employee_file.close()

#Doing the following will replaces everything in the selected file with the content that you express

'''
employee_file = open('Python/Lesson 25 & 26 Reading and Writing Files/employees.txt','w')

employee_file.write("\nKelley - Customer Service")

    So now kelley is the only employee that you have

employee_file.close()

'''
#if I open a file that in a folder that I have not made yet, python will make it for you, so now you can a employeesNew.txt file
employee_file = open('Python/Lesson 25 & 26 Reading and Writing Files/employeesNew.txt','w')

employee_file.write("Toby - Human Resources")

employee_file.write("\nKelley - Customer Service")

employee_file.close()

#You can also create and add in an html files and other files

