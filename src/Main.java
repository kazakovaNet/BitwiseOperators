public class Main {
    public static void main(String[] args) {
        // Конвертация в двоичную форму с помощью классов-оберток
        int x = 342;
        System.out.println(Integer.toBinaryString(x)); // 101010110

        // ~ - побитовый НЕ
        System.out.println("\n----------- ~ - побитовый НЕ");
        System.out.println(Integer.toBinaryString(x)); // 101010110
        System.out.println(Integer.toBinaryString(~x)); // 11111111111111111111111010101001
        System.out.print("~342 == ");
        System.out.println(~x); // -343

        // & - побитовый И
        System.out.println("\n----------- & - побитовый И");
        System.out.println(Integer.toBinaryString(277)); // 100010101
        System.out.println(Integer.toBinaryString(432)); // 110110000
        System.out.println(Integer.toBinaryString(277 & 432)); // 100010000
        System.out.print("277 & 432 == ");
        System.out.println(277 & 432); // 272

        // | - побитовый ИЛИ
        System.out.println("\n----------- | - побитовый ИЛИ");
        System.out.println(Integer.toBinaryString(277)); // 100010101
        System.out.println(Integer.toBinaryString(432)); // 110110000
        System.out.println(Integer.toBinaryString(277 | 432)); // 110110101
        System.out.print("277 | 432 == ");
        System.out.println(277 | 432); // 437

        // ^ - побитовый XOR (побитовое исключающее ИЛИ)
        System.out.println("\n----------- ^ - побитовый XOR (побитовое исключающее ИЛИ)");
        System.out.println(Integer.toBinaryString(277)); // 100010101
        System.out.println(Integer.toBinaryString(432)); // 110110000
        System.out.println(Integer.toBinaryString(277 ^ 432)); // 10100101
        System.out.print("277 ^ 432 == ");
        System.out.println(277 ^ 432); // 165

        // << - сдвиг битов влево
        System.out.println("\n----------- << - сдвиг битов влево");
        x = 64; // значение
        int y = 3; // количество
        int z = (x << y);
        System.out.println(Integer.toBinaryString(x)); // 1000000
        System.out.println(Integer.toBinaryString(z)); // 1000000000
        System.out.print("64 << 3 == ");
        System.out.println(z); // 512

        y = 26; // количество
        z = (x << y);
        System.out.print("64 << 26 == ");
        System.out.println(Integer.toBinaryString(z)); // 0 - выход за пределы диапазона

        System.out.print("111111111 << 3 == ");
        System.out.println(111111111 << 3); // 888888888

        System.out.print("101101 << 3 == ");
        System.out.println(101101 << 3); // 808808

        System.out.print("1101 << 2 == ");
        System.out.println(1101 << 2); // 4404

        System.out.print("1101 << 4 == ");
        System.out.println(1101 << 4); // 17616
        //  8808
        //     2
        // _____
        // 17616

        // >> - сдвиг битов вправо
        System.out.println("\n----------- >> - сдвиг битов вправо");
        x = 64; // значение
        y = 3; // количество
        z = (x >> y);
        System.out.println(Integer.toBinaryString(x)); // 1000000
        System.out.println(Integer.toBinaryString(z)); // 1000
        System.out.print("64 >> 3 == ");
        System.out.println(z); // 512

//        y = 26; // количество
//        z = (x << y);
//        System.out.print("64 << 26 == ");
//        System.out.println(Integer.toBinaryString(z)); // 0 - выход за пределы диапазона
//
        System.out.print("35 >> 2 == ");
        System.out.println(35 >> 2); // 8
        // 35 : 2 = 17
        // 17 : 2 = 8
    }
}
