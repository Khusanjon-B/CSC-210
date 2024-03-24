# Reading Files

#Reading from external files using python read command

#For the left section type / to get window where you can browse files

#the right section "r" give the command to just read to file

#Another option is "w" which is write, which means you can change the file

#"a" means append, you can add more stuff, but you can't change stuff

#"r+" give you the method of reading and writing

employee_file = open('./employees.txt', 'r')

#How to check if a file is readable - the function below returns a boolean value
print(employee_file.readable())


#whenever you open a file, you also want to close it
employee_file.close()