def solution(number):
    result = []
    
    list3 = (multipleTillBorder(3, number))
    result += list3

    list5 = (multipleTillBorder(5, number))
    for x in list5:
        if x not in result:
            result.append(x)

    result.sort()
    return sum(result)
    

def multipleTillBorder(x , b):
    result = []
    i = 0
    while x * (i + 1) < b:
        result.append(x * (i + 1))
        i += 1
    return result
