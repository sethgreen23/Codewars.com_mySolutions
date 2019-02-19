function even_or_odd(number) {
    if(Math.abs(number)%2 == 1)
        return "Odd";
    else
        return "Even";
}

function even_or_oddAlternative(number) {
  return Math.abs(number) % 2 == 1 ? "Odd" : "Even"
}
