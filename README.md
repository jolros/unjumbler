# unjumbler

unjumbler is a Clojure library that helps you solve [Jumble](http://en.wikipedia.org/wiki/Jumble) puzzles

## Usage

```clojure
(findwords "span")
=> ("span" "snap" "pans" "naps")

(findwords "span" "and" "pan")
=> (("span" "snap" "pans" "naps") ("and") ("pan" "nap"))
```
