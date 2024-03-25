# Reading Files

#Reading from external files using python read command

#For the left section type / to get window where you can browse files

#the right section "r" give the command to just read to file

#Another option is "w" which is write, which means you can change the file

#"a" means append, you can add more stuff, but you can't change stuff

#"r+" give you the method of reading and writing

employee_file = open('Python/Lesson 25 & 26 Reading and Writing Files/employees.txt', 'r')

#How to check if a file is readable - the function below returns a boolean value
print(employee_file.readable())

print(employee_file.readline()) #This reads the first line in the file
print(employee_file.readline()) #This reads the second line, because the first line was already read

print(employee_file.readlines()) #This reads all the lines in the file, but puts them as a list

print(employee_file.readlines()[1]) #This gives the second line in the file

print(employee_file.read()) #This line reads and spits out all of the information in the called file

for employee in employee_file.readlines():
    print(employee)

#whenever you open a file, you also want to close it
employee_file.close()
