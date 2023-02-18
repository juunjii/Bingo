public class bingoCard {

    public void bingoCards() {
        int card[][] = new int[5][5]; // Initialize 5x5 bingoCard for player1
        // Fill bingoCard for player1
        card[0][0] = 4;
        card[0][1] = 26;
        card[0][2] = 44;
        card[0][3] = 53;
        card[0][4] = 65;
        card[1][0] = 2;
        card[1][1] = 20;
        card[1][2] = 35;
        card[1][3] = 58;
        card[1][4] = 70;
        card[2][0] = 15;
        card[2][1] = 22;
        card[2][2] = 0;
        card[2][3] = 51;
        card[2][4] = 74;
        card[3][0] = 7;
        card[3][1] = 17;
        card[3][2] = 37;
        card[3][3] = 56;
        card[3][4] = 67;
        card[4][0] = 3;
        card[4][1] = 30;
        card[4][2] = 40;
        card[4][3] = 50;
        card[4][4] = 62;

        int card2[][] = new int[5][5]; // Initialize 5x5 bingoCard for player2
        // Fill bingoCard for player2
        card2[0][0] = 6;
        card2[0][1] = 24;
        card2[0][2] = 37;
        card2[0][3] = 49;
        card2[0][4] = 66;
        card2[1][0] = 12;
        card2[1][1] = 21;
        card2[1][2] = 39;
        card2[1][3] = 46;
        card2[1][4] = 73;
        card2[2][0] = 15;
        card2[2][1] = 22;
        card2[2][2] = 0;
        card2[2][3] = 48;
        card2[2][4] = 74;
        card2[3][0] = 14;
        card2[3][1] = 23;
        card2[3][2] = 36;
        card2[3][3] = 47;
        card2[3][4] = 75;
        card2[4][0] = 13;
        card2[4][1] = 19;
        card2[4][2] = 44;
        card2[4][3] = 55;
        card2[4][4] = 72;

        // printout bingoBoard for player1
        System.out.println();
        System.out.println();
        System.out.println("Player 1's Bingo Card\n");

        System.out.printf("-----------------------------------------------------------------------------------\n");
        System.out.println("|\tB\t|\tI\t|\tN\t|\tG\t|\tO\t|");
        System.out.printf("-----------------------------------------------------------------------------------\n");
        // For loop to fill each row(j) and column(t) with random numbers generated from
        // 1-75
        for (int j = 0; j < 5; j++) {
            for (int t = 0; t < 5; t++) {
                System.out.printf("|\t%d\t", card[j][t]);
                if (t == 4) {
                    System.out.printf("|");
                    System.out.printf(
                            "\n----------------------------------------------------------------------------------- ");
                }
            } // end for t
            System.out.println();
        } // for j

        // printout bingoBoard for player2
        System.out.println();
        System.out.println();
        System.out.println("Player 2's Bingo Card\n");
        System.out.printf("-----------------------------------------------------------------------------------\n");
        System.out.println("|\tB\t|\tI\t|\tN\t|\tG\t|\tO\t|");
        System.out.printf("-----------------------------------------------------------------------------------\n");
        // For loop to fill each row(j) and column(t) with random numbers generated from
        // 1-75
        for (int j = 0; j < 5; j++) {
            for (int t = 0; t < 5; t++) {
                System.out.printf("|\t%d\t", card2[j][t]);
                if (t == 4) {
                    System.out.printf("|");
                    System.out.printf(
                            "\n----------------------------------------------------------------------------------- ");
                }
            } // end for t
            System.out.println();
        } // for j

    }

}
