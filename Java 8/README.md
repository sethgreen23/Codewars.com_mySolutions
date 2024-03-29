# MakeNegative
In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

# CountPositivesSumNegatives
Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
If the input array is empty or null, return an empty array.

# ExpandedForm
You will be given a number and you will need to return it as a string in Expanded Form. For example:
- Kata.expandedForm(12); # Should return "10 + 2"
- Kata.expandedForm(42); # Should return "40 + 2"
- Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

NOTE: All numbers will be whole numbers greater than 0.

# TrippleDouble
- Return 1, if first long containts a digit 3 times in a row and the second long contains that digit 2 times
- Return 0, if not

# IntToRomanNumeral
Write a method which takes a int as parameter and returns a String which represents the result as roman numeral.

# AgePrediction
My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!
In honor of my grandfather's memory we will write a function using his formula!
- Take a list of ages when each of your great-grandparent died.
- Multiply each number by itself.
- Add them all together.
- Take the square root of the result.
- Divide by two.

# Accumulation_Mumbling
This time no story, no theory. The examples below show you how to write function accum:
- accum("abcd") -> "A-Bb-Ccc-Dddd"
- accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
- accum("cwAt") -> "C-Ww-Aaa-Tttt"

# AddTwo
Description:
Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value. The indices of these items should then be returned in an array like so: [index1, index2].
For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

# PigLatin
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

# Stocklist
A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5 or more capitals letters. The 1st letter of a code is the capital letter of the book category. In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0) which indicates the quantity of books of this code in stock.

# HumanReadableTime
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
- HH = hours, padded to 2 digits, range: 00 - 99
- MM = minutes, padded to 2 digits, range: 00 - 59
- SS = seconds, padded to 2 digits, range: 00 - 59

The maximum time never exceeds 359999 (99:59:59)

# SortTheOdd
You have an array of numbers. Your task is to sort ascending odd numbers but even numbers must be on their places.
Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

# SudokuValidator
Write a function validSolution/ValidateSolution/valid_solution() that accepts a 2D array representing a Sudoku board, and returns true if it is a valid solution, or false otherwise. The cells of the sudoku board may also contain 0's, which will represent empty cells. Boards containing one or more zeroes are considered to be invalid solutions.
