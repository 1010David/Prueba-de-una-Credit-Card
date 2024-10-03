Credit Card Purchase System
This is a simple Java program that simulates purchases made with a credit card. It allows users to specify a credit limit, make purchases, and view a summary of their transactions, including a list of purchases sorted in ascending order by amount.

Features
Set a credit card limit.
Make purchases and verify if they are within the available credit limit.
Automatically track and display the remaining balance after each purchase.
Display a summary of all purchases, sorted from smallest to largest.
How It Works
The user enters a credit limit.
The user can make purchases as long as there is enough available balance on the card.
After making all desired purchases, the program displays a summary of the purchases and the remaining balance.
Usage
Start the Program: The user inputs the credit limit when prompted.

Example:

Introduce el límite de tu tarjeta de crédito: 1000
Make a Purchase: After setting the limit, the user can input a purchase amount.

Example:

Introduce el valor de la compra: 150
If the purchase is within the remaining balance, it will be accepted, and the balance will be updated. If not, an error message will be displayed.

View Summary: After finishing all purchases, the program will display a summary of the purchases, sorted from lowest to highest, and show the remaining balance.

Example of Execution
markdown
Copy code
Introduce el límite de tu tarjeta de crédito: 500
Menu:
1. Realizar una compra
0. Salir y mostrar resumen de compras
Elige una opción: 1
Introduce el valor de la compra: 100
Compra realizada exitosamente.

Menu:
1. Realizar una compra
0. Salir y mostrar resumen de compras
Elige una opción: 1
Introduce el valor de la compra: 450
Saldo insuficiente para realizar esta compra.

Menu:
1. Realizar una compra
0. Salir y mostrar resumen de compras
Elige una opción: 0

Resumen de compras realizadas (ordenadas de menor a mayor):
Compra de $100.0
Saldo restante en la tarjeta: $400.0
Code Structure
Main.java
The Main class manages user input and the program's flow, including the menu options for making purchases and viewing the summary.

TarjetaCredito.java
The TarjetaCredito class handles the credit limit, available balance, and stores the list of purchases. It includes the following methods:

realizarCompra(double monto): Attempts to make a purchase if there is sufficient balance.
mostrarCompras(): Displays the summary of purchases in ascending order and shows the remaining balance.
getSaldo(): Returns the current balance.
Technologies
Java
Standard libraries: java.util.Scanner, java.util.ArrayList, java.util.Collections
How to Run
Make sure you have a Java Development Kit (JDK) installed.
Compile the program using the following command:

javac Main.java TarjetaCredito.java
Run the program:
java Main
Future Enhancements
Add functionality to remove or modify purchases.
Implement error handling for invalid input types.
Provide a graphical interface for user interaction.
