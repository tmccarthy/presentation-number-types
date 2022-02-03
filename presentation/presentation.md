# Number types!

---

# Signed integers

| Type name           | Number of bits | Min                         | Max                           |
|---------------------|----------------|-----------------------------|-------------------------------|
| `i8` or `byte`      | 8              | -128 (-2⁷)                  | 127 (2⁷ - 1)                  |
| `i16` or `short`    | 16             | -32768 (-2¹⁵)               | 32767 (2¹⁵ - 1)               |
| `i32` or `int`      | 32             | -2147483648 (-2³¹)          | 2147483647 (2³¹ - 1)          |
| `i64` or `long`     | 64             | -9223372036854775808 (-2⁶³) | 9223372036854775807 (2⁶³ - 1) |

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

| Type name           | Number of bits | Min | Max                  |
|---------------------|----------------|-----|----------------------|
| `u8` or `ubyte`     | 8              | 0   | 255 (2⁸ - 1)         |
| `u16` or `ushort`   | 16             | 0   | 65535 (2¹⁶ - 1)      |
| `u32` or `uint`     | 32             | 0   | 4294967295 (2³² - 1) |
| `u64` or `ulong`    | 64             | 0   | 18446744073709551615 (2⁶⁴ - 1) |

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

<div data-marpit-fragment/>

| Type name                   | Exponent length | Fraction length | Sign length | Total length |
|-----------------------------|-----------------|-----------------|-------------|--------------|
| single precision (`float`)  | 8 bits          | 23 bits         | 1 bit       | 32 bits      |
| double precision (`double`) | 11 bits         | 52 bits         | 1 bit       | 64 bits      |

![](images/1180px-Float_example.svg.png)

---

# Floating point numbers

* `0` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">0</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">0</sup>
* `1` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">1</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">0</sup>
* `-4` = <span style="color:#F18F01">-1</span> ⨯ <span style="color:#048BA8">1</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">2</sup> (sorta)
* `0.5` = <span style="color:#F18F01">1</span> ⨯ <span style="color:#048BA8">1</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">-1</sup>
* `0.1` = ???

---

# Floating point numbers

<div data-marpit-fragment/>

## `MiniFloat`

<span style="color:#F18F01">sign</span> ⨯ <span style="color:#048BA8">fraction</span> ⨯ <span style="color:grey">2</span> <sup style="color:#91171F">exponent</sup>

* Fraction between 2 and -2
* Exponent between -1 and 2

---

# Floating point numbers

![](images/FloatingPointPrecisionAugmented.png)

---

# Floating point numbers

### ✅ Good when

* Data for real-world measurements (temperature, length, mass etc)
* When you need _really fast_ calculations

### ❌ Avoid when

* Numbers are always integers
* Cases where the exact value is important and can't be expressed by a float (money)

---

# Floating point numbers

### ⚠️ Watch out!

* Sometimes (eg Javascript) you have no other options, so be careful!
* `NaN` can be unintuitive
* Sometimes you need to lookout for `-0`
* Overflows don't throw exceptions
* For very big values, floats don't behave how you'd expect

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