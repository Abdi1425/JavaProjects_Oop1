# Modified Mortgage Calculator (Java)

##  Description
This Java console application calculates the **monthly mortgage payment** based on user input.  

Compared to the basic version, this modified version **validates user input** to ensure values are within reasonable limits.

The program asks the user for:
- Principal loan amount (between 10,000 and 1,000,000)  
- Annual interest rate (between 30% and 45%)  
- Number of years (less than 9 years)  

It then calculates and displays the monthly mortgage payment formatted as currency.

---

##  Formula Used

The program uses the standard mortgage formula:

M = P * ( r(1+r)^n ) / ( (1+r)^n - 1 )

Where:
- **P** = Principal loan amount  
- **r** = Monthly interest rate (Annual rate ÷ 12 ÷ 100)  
- **n** = Total number of payments (years × 12)  
- **M** = Monthly mortgage payment  

---

## 🛠 Technologies Used
- Java  
- Scanner (for user input)  
- Math.pow() (for exponent calculations)  
- NumberFormat (for currency formatting)  

---

##  Input Validation
- Principal must be between **10,000** and **1,000,000**  
- Annual interest rate must be between **30%** and **45%**  
- Number of years must be **less than 9**  

This prevents invalid inputs and ensures the calculation makes sense.

---

## ▶ How to Run

1. Compile the program:

```bash
javac Main.java