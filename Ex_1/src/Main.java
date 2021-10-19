class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;
        // Допишите здесь логику так, что будет подсчитано и выведено
        // количество игроков, которые выбывают.
        // Если свет зелёный, то проходят все игроки (0 выбывают).
        // Если свет красный, то выбывает каждый, чья скорость не 0.

        int count = 0;

        if (isGreenLight) {
            if (speedOfPlayer1 == 0) {
                count++;
            }
            if (speedOfPlayer2 == 0) {
                count++;
            }
            if (speedOfPlayer3 == 0) {
                count++;
            }
        } else {
            if (speedOfPlayer1 > 0) {
                count++;
            }
            if (speedOfPlayer2 > 0) {
                count++;
            }
            if (speedOfPlayer3 > 0) {
                count++;
            }
        }
        System.out.println("Количество выбывших игроков: " + count);
    }
}
