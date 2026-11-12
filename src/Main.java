void main() {
    // 1


//    int n = 10;
//    int sum = 0;
//
//    for (int i = 1; i <= n; i++) {
//        sum += i;
//    }
//
//    double average = (double) sum / n;
//
//    System.out.println(average);


    // 2

//    int n = 27;
//
//        int power = 1;
//
//        while (power * 2 <= n) {
//            power = power * 2;
//        }
//
//        while (power > 0) {
//            if (n >= power) {
//                System.out.print(power + " ");
//                n = n - power;
//            }
//
//            power = power / 2;
//        }


    // 3

//    for (int i = 1; i <= 15; i++) {
//        if (i % 2 == 0 || i == 5 || i == 7 || i == 11) {
//            continue;
//        }
//
//        System.out.println(i);
//    }


    // 4

//    String binary = "1010";
//
//    int decimal = Integer.parseInt(binary, 2);
//
//    System.out.println(decimal);


    // 5

//    int n = 10;
//
//    String binary = Integer.toBinaryString(n);
//
//    System.out.println(binary);


    // 6

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int x = random.nextInt(100) + 1;
    int n = 0;

    while (n != x) {
        System.out.print("გამოიცანი რიცხვი:");
        n = scanner.nextInt();

        if (n < x) {
            System.out.println("რიცხი უფრო დიდია");
        } else if (n > x) {
            System.out.println("რიცხვი უფრო პატარაა");
        } else {
            System.out.println("გამოიცანი!");
        }
    }
}