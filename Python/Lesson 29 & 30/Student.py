#Everything indented it a part of student

#initilization: def __init__(self):

    #Student has a name, a major, a gpa, and a boolean value on probation status

class Student:
    def __init__(self, name, major, gpa):
        self.name = name
        self.major = major
        self.gpa = gpa
    def on_honor_roll(self):
        if self.gpa >= 3.5:
            return True
        else:
            return False
    