class ChineseChef:
    
    def make_chicken(self):
        print("The chef makes a chicken")
    
    def make_salad(self):
        print("The chef makes a salad")

    def make_fried_rice(self):
        print("The chef makes fried rice")
    
    def make_special_dish(self):
        print("The chef makes orange chicken")

'''

Instead of copying and pasting the different attirbutes from the previously made chef class I can inherit those attributes by doing the following:

from chef import chef

class ChineseChef(Chef):  <-- This line inherits the normal chef functions

    def make_fried_rice(self):
        print("The chef makes fried rice")

        
    To override the initial chef's special dish you can redeclare the function to create special dish
    
    def make_special_dish(self):
        print("The chef makes orange chicken")

    

'''