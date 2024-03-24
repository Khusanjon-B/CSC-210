#Dictionaries

#Dictionaries are special structures that allows us to store information in key value pairs

#You can create a lot of key value pairs and when you want to refer to it you can just call upon its key

#Program that can turn Jan-> January

#Dicationaries are inside {} and the left is the key and right is the value. You cannot have duplicate keys, and your pairs have to be separated by commas

monthConversions = {

    "Jan" : "January",
    "Feb" : "February",
    "Mar" : "March",
    "Apr" : "April",
    "May" : "May",
    "Jun" : "June",
    "Jul" : "July",
    "Aug" : "August",
    "Sep" : "September",
    "Oct" : "October",
    "Nov" : "November",
    "Dec" : "December"

}

#Accessing Dicationary

    #Method 1 - referring to dictionary and calling on key - value will be displayed
print(monthConversions["Nov"])

    #Method 2 - You can have a get function and on the left will be key, and if that key is invalid, you can set a default value next to it
print(monthConversions.get("Dec","Not a valid month"))

print(monthConversions.get("Ced","Not a valid month"))