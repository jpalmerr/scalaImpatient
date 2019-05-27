// checks for vowels
def isVowel(ch: Char) = "aeiou".contains(ch)
isVowel('a')
isVowel('b')

// write function that given string returns string of
// all its vowels

def vowels(s: String) = {
  var result = ""
  for (ch <- s) {
    if (isVowel(ch)) result += ch
  }
  result
}

vowels("hello")

// much more scala solution
def vowels2(s: String) =
  for (ch <- s if isVowel(ch)) yield ch

vowels2("hello")

// recursive

// define return type since recursive
def vowels3(s: String) : String = {
  if (s.length == 0) ""
  else {
    val ch = s(0)
    val rest = vowels3(s.substring(1))
    if (isVowel(ch)) ch + rest else rest
  }
}

vowels3("hello")

// default arguments
def isVowel2(ch: Char, vowelChars: String) = vowelChars.contains(ch)

def vowels4(s: String, vowelChars: String = "auiou", ignoreCase: Boolean = true) =
  for (ch <- (if (ignoreCase) s.toLowerCase else s) if isVowel2(ch, vowelChars)) yield ch

vowels4("Mississippi")