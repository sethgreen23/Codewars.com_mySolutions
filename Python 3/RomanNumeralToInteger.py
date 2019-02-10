def solution(roman):
    romanNumerals = {"I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000}
    sum = 0
    for i in range(len(roman)):
        value = romanNumerals[roman[i]]
        if i+1 < len(roman) and romanNumerals[roman[i+1]] > value:
            sum -= value
        else: 
            sum += value
    return sum
