# Disclaimer
This is my folder where I collect my code and solutions for the codewars coding challenges for JavaScript.
I just started learning JS, so the difficulty of it will increase.

# KeepHydrated
Nathan loves cycling. Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling. You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

# SmallestInteger
Return smallest integer in array.

# ReversedString
Takes a String as parameter and returns it reversed.

# ComplementaryDNA
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

# CountingDoubles
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
- Example: "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)

# JadenCasingStrings
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them. Example:
- Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
- Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

# EqualSidesOfArray
You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.

# MiddleCharacter
Write a function which returns the middle character of a string if the string has a odd length - and the middle two chars if it has even length.

# FindOddInt
Given an array, find the int that appears an odd number of times. There will always be only one integer that appears an odd number of times.

# OddOrEven
Return "Odd" if the given int is odd or "Even" if the given int is even.

# VowelCount
Count vowel-letter appearance (vowel: a, e, i, o, u) - Capital

# Highest&Lowest
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

# ShortestWord
Simple, given a string of words, return the length of the shortest word(s). String will never be empty and you do not need to account for different data types.

# ValidParentheses
Write a function called that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return true if the string is valid, and false if it's invalid.

# SortArrayByStringLength
Write a function that takes an array of strings as an argument and returns a sorted array containing the same strings, ordered from shortest to longest.
- For example, if this array were passed as an argument: ["Telescopes", "Glasses", "Eyes", "Monocles"]
- Your function would return the following array: ["Eyes", "Glasses", "Monocles", "Telescopes"]

All of the strings in the array passed to your function will be different lengths, so you will not have to decide how to order multiple strings of the same length.

# OddOrEvenArraysum
Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even. Give your answer in string format as 'odd' or 'even'.

# WhoLikesIt
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item. It must return the display text as shown in the examples:
- likes [] // must be "no one likes this"
- likes ["Peter"] // must be "Peter likes this"
- likes ["Jacob", "Alex"] // must be "Jacob and Alex like this"
- likes ["Max", "John", "Mark"] // must be "Max, John and Mark like this"
- likes ["Alex", "Jacob", "Mark", "Max"] // must be "Alex, Jacob and 2 others like this"

# TribonacciSequence
Well met with Fibonacci bigger brother, AKA Tribonacci. As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next. And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(

- So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature), we have this sequence: [1, 1 ,1, 3, 5, 9, 17, 31, ...]

But what if we started with [0, 0, 1] as a signature? As starting with [0, 1] instead of [1, 1] basically shifts the common Fibonacci sequence by once place, you may be tempted to think that we would get the same sequence shifted by 2 places, but that is not the case and we would get:
[0, 0, 1, 1, 2, 4, 7, 13, 24, ...]

# TortoiseRacing
Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.
When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?
More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?
The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.
