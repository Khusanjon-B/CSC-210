#Month Create Command
months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]


def month_files():
    for index in range(len(months)):
        month_file = open('Python - Intermediate/Misc/Month ' + str((index + 1)) + ' - ' + months[index] + '.py' ,'w')
        month_file.write("#This is the file for the month of " + months[index])
        month_file.close()

month_files()