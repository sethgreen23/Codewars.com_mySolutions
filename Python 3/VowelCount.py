def getCount(inputStr):
    num_vowels = 0
    num_vowels = inputStr.count("a") + inputStr.count("e") + inputStr.count("i") + inputStr.count("u") + inputStr.count("o")
    return num_vowels
