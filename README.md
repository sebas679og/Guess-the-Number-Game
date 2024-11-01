# Juego de Adivina el Número en Java

Este es un juego de consola en Java en el que el usuario debe adivinar un número secreto. El programa ofrece dos modos de juego:

1.  **Juego por defecto**: El número aleatorio se genera entre 1 y 100, y el usuario tiene intentos ilimitados para adivinarlo.
2.  **Juego personalizado**: El usuario puede definir el rango en el que se generará el número aleatorio y establecer un límite de intentos para adivinarlo.

El objetivo es adivinar el número antes de que se agoten los intentos. Al final, el juego indica si el usuario ganó o perdió.

## ¿Qué herramientas se utilizaron?

-   **Librerías**:
    -   `Random` para generar el número aleatorio.
    -   `Scanner` para leer las entradas del usuario.
-   **Estructuras de control**:
    -   `switch` para gestionar las opciones del juego.
    -   Bucles para permitir que el usuario continúe jugando hasta acertar o quedarse sin intentos.
    -   Condicionales para determinar si el intento fue "demasiado alto", "demasiado bajo" o "correcto".
## Requerimientos del Juego
**"Guess the Number Game"**

**Description:** Write a program that generates a random number between 1 and 100. The user should try to guess the number, and after each guess, the program should indicate whether the guess was too high, too low, or correct. The game should continue until the user guesses the correct number.

**Requirements:**

1.  The program should generate a random number between 1 and 100.
2.  The user should be prompted to enter their guess.
3.  If the user's guess is too high, the program should print "Too high, try again!".
4.  If the user's guess is too low, the program should print "Too low, try again!".
5.  If the user guesses correctly, the program should print "Congratulations! You guessed the number in X attempts" (where X is the number of attempts).
6.  The program should keep track of the number of attempts made by the user.

**Hint:** You can use a random number generator from your language's standard library. For example, in Python, you can use the `random` module.

### **Things to Consider:**

-   You are encouraged to ask questions at any point if you get stuck or need clarification. Feel free to reach out for help whenever needed.
-   The use of AI tools to generate or complete the code is strictly prohibited. This exercise is meant to help you build your programming skills and solve problems independently.
-   You can enhance the game with additional features, like limiting the number of attempts, offering hints, or allowing the user to choose the range of numbers.

