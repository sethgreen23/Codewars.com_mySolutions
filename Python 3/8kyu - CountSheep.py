def count_sheeps(arrayOfSheeps):
    counter = 0
    i = 0
    while i < len(arrayOfSheeps):
        if arrayOfSheeps[i] is True:
            counter += 1
        i += 1
    return counter
   
def count_sheeps2(arrayOfSheeps):
    return arrayOfSheeps.count(True)
