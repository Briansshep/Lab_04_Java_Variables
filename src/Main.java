class main {
 static void main(String[] args) {
   int intOperandA = 2;
   int intOperandB = 5;
   int intSum = 16;
   int intProduct = 41;
   int intDifference = 6;
   int intQuotient = 32;
   int intModulo = 3;

   double doubleOperandA = 2.77;
   double doubleOperandB = 12.21;
   double doubleSum = 1.11;
   double doubleProduct = 6.33;
   double doubleDifference = 3.14;
   double doubleQuotient = 5.32;

   intSum = intOperandA + intOperandB; //Assignment using the arithmetic operator +
   System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

   intDifference = intOperandA - intOperandB; // Assignment using the arithmetic operator -
    System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " +intDifference);

    intProduct = intOperandA * intOperandB; // Assignment using the arithmetic operator *
     System.out.println("The product using ints of " + intOperandA + "and " + intOperandB + " is " + intProduct);

    intQuotient = intOperandA / intOperandB; // Assignment using the arithmetic operator /
     System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

   intModulo = intOperandA % intOperandB; //Assignment using the arithmetic operator %
     System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

   doubleSum = doubleOperandA + doubleOperandB; // Assignment using the arithmetic operator +
     System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

   doubleDifference = doubleOperandA - doubleOperandB; //Assignment using the arithmetic operator -
     System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

   doubleProduct = doubleOperandA * doubleOperandB; //Assignment using the arithmetic operator *
     System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

   doubleQuotient = doubleOperandA / doubleOperandB; // Assignment using the arithmetic operator /
     System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + "is " +doubleQuotient);

    }
}
