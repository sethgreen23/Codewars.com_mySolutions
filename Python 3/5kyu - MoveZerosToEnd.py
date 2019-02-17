def move_zeros(array):
    rest = []
    zeros = []
    for i in range(len(array)):
        if array[i] == 0 or array[i] == 0.0:
            if type(array[i]) == int or type(array[i]) == float:
                zeros.append(array[i])
            else:
                rest.append(array[i])
        else:
            rest.append(array[i])
    return rest + zeros
