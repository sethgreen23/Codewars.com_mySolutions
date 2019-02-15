def sum_two_smallest_numbers(numbers):
    smallest = numbers[0]
    for x in numbers:
        if x < smallest:
            smallest = x
    numbers.remove(smallest)
    secondSmallest = numbers[0]
    for y in numbers:
        if y < secondSmallest:
            secondSmallest = y
    return smallest + secondSmallest
