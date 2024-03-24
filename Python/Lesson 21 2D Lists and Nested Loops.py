#Lists within lists

number_grid = [
    [1,2,3],
    [4,5,6],
    [7,8,9],
    [0]]

#This print statement first picks the outside list index then the inside list index, so index 0 of outside and index 0 of inside of outside
print(number_grid[0][0])

print(number_grid[2][2])

#Nested for loops

for row in number_grid:
    print(row)

#Using rows and columns because the number_grid list setup above looks like matrix with rows and columns
for row in number_grid:
    for col in row:
        print(col)