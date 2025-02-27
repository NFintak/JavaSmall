System.out.println("Hello, World!");
System.out.println("Hello, World!");
void println(String s) {
    System.out.println(s);
}
println("your name here!");
println("nathan");
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
sumNumbers(5);
sumNumbersTo10();