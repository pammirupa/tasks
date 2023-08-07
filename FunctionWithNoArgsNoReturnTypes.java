// write a program functions with no arguments and no return types
class FunctionWithNoArgsNoReturnTypes {
    public static void sum() {          // no arguments , and no return types , here void is default return type
        int a = 5, b = 6, sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String args[]) {
        sum();
    }
}
