# Mortgage Calculator (Java)

##  Description
This is a simple Java console application that calculates the monthly mortgage payment based on user input.

The program asks the user to enter:
- Principal loan amount
- Annual interest rate
- Number of years

It then calculates and displays the monthly mortgage payment formatted as currency.

---

##  Formula Used

The program uses the standard mortgage formula:

M = P * ( r(1+r)^n ) / ( (1+r)^n - 1 )

Where:
- **P** = Principal loan amount
- **r** = Monthly interest rate (Annual rate / 12 / 100)
- **n** = Total number of payments (years × 12)
- **M** = Monthly mortgage payment

---

## 🛠 Technologies Used
- Java
- Scanner (for user input)
- Math.pow() (for exponent calculations)
- NumberFormat (for currency formatting)

---

## ▶ How to Run

1. Compile the program:
