class TowerOfHanoi {
    public static void TowerOfHanoi(int n, char src, char aux, char dest) {
        if (n == 1) {
            System.out.println(src + "->" + dest);
            return;
        }
        TowerOfHanoi(n - 1, src, dest, aux);
        TowerOfHanoi(1, src, dest, aux);
        TowerOfHanoi(n - 1, aux, src, dest);
        System.out.println(src + "->"  + dest); 
    }

    public static void main(String[] args) {
        TowerOfHanoi(3, 's', 'a', 'd');
    }
}




