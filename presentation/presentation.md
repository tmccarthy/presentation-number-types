# Number types!

---

# Signed integers

### ✅ Good when

* Working with whole numbers

### ❌ Avoid when

* You need fractional numbers
* You don't need to represent negative numbers

### ⚠️ Watch out!

* Pick your range carefully, err on the large side
* Use `addExact` if you need to be careful about overflows and underflows

---

# Unsigned integers

### ✅ Good when

* Working with concepts where negative numbers make no sense (length of an array, count of occurrences)

### ❌ Avoid when

* When you need fractional or negative numbers

### ⚠️ Watch out!

* Overflows and underflows happen silently
* Underflows are a lot closer to the range of values we use day-to-day
* Look for `addExact` if you can

---

# Floating point numbers