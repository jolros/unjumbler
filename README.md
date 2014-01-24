# unjumbler

unjumbler is a Clojure library that helps you solve [Jumble](http://en.wikipedia.org/wiki/Jumble) puzzles (and find anagrams in general).

## Usage

```clojure
(findwords "span")
=> ("span" "snap" "pans" "naps")

(findwords "span" "and" "pan")
=> (("span" "snap" "pans" "naps") ("and") ("pan" "nap"))
```
