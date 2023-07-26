class Reverse {
    public static void main(String[] args) {
        String s = "dog bites man";
        StringBuilder reversedString = new StringBuilder(s).reverse();
        System.out.println("Reverse string: " + reversedString.toString());
    }
}

