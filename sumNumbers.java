System.out.println("Hello, World!");
x
x + 5;
x
x = x + 10;
x
println("your name here!");
println("nathan");
while (i <= 10) {
    System.out.println(i);
    i++;
}
printNumbers();
printNumbers(5);
printNumbers(10);
printNumbers(20);
sumNumbers(5);
sumNumbers(11);
sumNumbers(23);
sumNumbers(5683);
sumNumbers(106839);
sumNumbers(5);
sumNumbers(10);
sumNumbers(20);
sumNumbers(106839);
sumNumbersTo10();
System.out.println("Hello, World!");
x
x + 5;
x
x = x + 10;
x
void println(String s) {
    System.out.println(s);
}
println("your name here!");
println("nathan");
while (i <= 10) {
    System.out.println(i);
    i++;
}
void printNumbers() {
    int i = 1;
    while (i <= 10) {
        System.out.println(i);
        i++;
    }
}
printNumbers();
void printNumbers(int n) {
    int i = 1;
    while (i <= n) {
        System.out.println(i);
        i++;
    }
}
printNumbers(5);
printNumbers(10);
printNumbers(20);
sumNumbers(5);
sumNumbers(11);
sumNumbers(23);
sumNumbers(5683);
sumNumbers(106839);
sumNumbers(5);
sumNumbers(10);
sumNumbers(20);
sumNumbers(106839);
int sumNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum = sum + i;
    }
    return sum;
}
int sumNumbersTo10() {
    return sumNumbers(10);
}
sumNumbersTo10();
int sumNumbersTo13() {
    return sumNumbers(13);
}
sumNumbersTo13();
int addTwoNumber(int x, int y) {
    return (x + y);
}
addTwoNumber(5, 10);
int divideTwoNumbers(int x, int y) {
    return (x / y);
}
int multiplyTwoNumbers(int x, int y) {
    return (x * y);
}
int subtractTwoNumbers(int x, int y) {
    return (x - y);
}
divideTwoNumbers(45, 15);
multiplyTwoNumbers(3, 5);
subtractTwoNumbers(20,5);
isEven(5);
isEven(5);
isEven(5);
isOdd(5);
var x = 5;
var y = 2;
x % y;
boolean isOdd(int x) {
    if (x % 2 == 1) {
        return true;
    } else {
        return false;
    }
}
int i = 1;
while (i <= 10) {
    System.out.println(i + " % 2 = " + i % 2);
    i++;
}
boolean isEven(int x) {
    if (x % 2 == 0) {
        return true;
    } else {
        return false;
    }
}
printOddEven();
printOddEven();
void printOddEven() {
    int i = 1;
    while (i <= 10) {
        if (isEven(i)) {
            System.out.println(i + " is even");
        } else {
            System.out.println(i + " is odd");
        }
        i++;
    }
}