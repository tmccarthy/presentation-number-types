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

---

# Floating point numbers

<span style="color:#F18F01">sign</span> ⨯ <span style="color:#048BA8">fraction</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">exponent</sup>

* `0` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">0</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">0</sup>
* `1` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">1</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">0</sup>
* `-4` = <span style="color:#F18F01">-1</span> ⨯ <span style="color:#048BA8">1</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">2</sup> (sorta)
* `0.5` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">1</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">-1</sup>

<div data-marpit-fragment>

![](images/1180px-Float_example.svg.png)

---

# Floating point numbers

![](images/FloatingPointPrecisionAugmented.png)

---

# Floating point numbers

### ✅ Good when

* 

### ❌ Avoid when

* 

### ⚠️ Watch out!

* 

---

# Decimals

<span style="color:#F18F01">sign</span> ⨯ <span style="color:#048BA8">fraction</span> ⨯ <span style="color:grey">10</span> <sup style="color:#91171F">exponent</sup>

* `0` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">0</span> ⨯ <span style="color:grey">10</span> <sup style="color:#91171F">0</sup>
* `1` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">1</span> ⨯ <span style="color:grey">10</span> <sup style="color:#91171F">0</sup>
* `-4` = <span style="color:#F18F01">-1</span> ⨯ <span style="color:#048BA8">4</span> ⨯ <span style="color:grey">10</span> <sup style="color:#91171F">0</sup>
* `0.5` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">5</span> ⨯ <span style="color:grey">10</span> <sup style="color:#91171F">-1</sup>
* `1,234,000` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">1234</span> ⨯ <span style="color:grey">10</span> <sup style="color:#91171F">3</sup>
* `0.333333` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">333333</span> ⨯ <span style="color:grey">10</span> <sup style="color:#91171F">-6</sup>

* ⅓ = ???
* $\pi$ = ???

---

# Decimals

### ✅ Good when

*

### ❌ Avoid when

*

### ⚠️ Watch out!

*

---

# Rational numbers

$$\frac{numerator}{denominator}$$

* $0 = \frac{0}{1}$
* $1 = \frac{1}{1}$
* $0.5 = \frac{1}{2}$
* $0.1 = \frac{1}{10}$
* $⅓ = \frac{1}{3}$

* $\pi$ = ???

---

# Questions? Comments? Contributions?