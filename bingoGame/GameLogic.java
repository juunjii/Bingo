import java.util.Random;

public class GameLogic {
    // Method for producing random numbers for marking in bingoCards
    public void logic() {
        String winner = "N";
        int round = 0;

        Random rand = new Random();
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

        for (int i = 0; i < 15; i++) {

            ++round;

            int num = rand.nextInt(75) + 1; // Random number from 1-75

            System.out.printf("%nRound %d\nThe number being called is: " + num + "\n", round);

            if (num == card[0][0]) {
                card[0][0] = 0;
                System.out.println("The number 4 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                               // number 4

            }

            if (num == card2[0][0]) {
                card2[0][0] = 0;
                System.out.println("The number 6 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                               // number 6

            }

            if (num == card[0][1]) {
                card[0][1] = 0;
                System.out.println("The number 26 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 26

            }

            if (num == card2[0][1]) {
                card2[0][1] = 0;
                System.out.println("The number 24 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 24

            }

            if (num == card[0][2]) {
                card[0][2] = 0;
                System.out.println("The number 44 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 44

            }

            if (num == card2[0][2]) {
                card2[0][2] = 0;
                System.out.println("The number 37 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 37

            }

            if (num == card[0][3]) {
                card[0][3] = 0;
                System.out.println("The number 53 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 53

            }

            if (num == card2[0][3]) {
                card2[0][3] = 0;
                System.out.println("The number 49 in Player 2's bingo cardhas been marked 0"); // Printout marker for
                                                                                               // number 49

            }

            if (num == card[0][4]) {
                card[0][4] = 0;
                System.out.println("The number 65 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 65

            }

            if (num == card2[0][4]) {
                card2[0][4] = 0;
                System.out.println("The number 66 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 66

            }

            if (num == card[1][0]) {
                card[1][0] = 0;
                System.out.println("The number 2 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                               // number 2

            }

            if (num == card2[1][0]) {
                card2[1][0] = 0;
                System.out.println("The number 12 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 12

            }

            if (num == card[1][1]) {
                card[1][1] = 0;
                System.out.println("The number 20 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 20

            }

            if (num == card2[1][1]) {
                card2[1][1] = 0;
                System.out.println("The number 21 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 21

            }

            if (num == card[1][2]) {
                card[1][2] = 0;
                System.out.println("The number 35 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 35

            }

            if (num == card2[1][2]) {
                card2[1][2] = 0;
                System.out.println("The number 39 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 39

            }

            if (num == card[1][3]) {
                card[1][3] = 0;
                System.out.println("The number 58 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 58

            }
            if (num == card2[1][3]) {
                card2[1][3] = 0;
                System.out.println("The number 46 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 46

            }

            if (num == card[1][4]) {
                card[1][4] = 0;
                System.out.println("The number 70 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 70

            }
            if (num == card2[1][4]) {
                card2[1][4] = 0;
                System.out.println("The number 73 in Player 2's bingo cardhas been marked 0"); // Printout marker for
                                                                                               // number 73

            }

            if (num == card[2][0]) {
                card[2][0] = 0;
                System.out.println("The number 15 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 15

            }
            if (num == card2[2][0]) {
                card2[2][0] = 0;
                System.out.println("The number 15 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 15

            }

            if (num == card[2][1]) {
                card[2][1] = 0;
                System.out.println("The number 22 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 22

            }
            if (num == card2[2][1]) {
                card2[2][1] = 0;
                System.out.println("The number 22 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 2

            }

            if (num == card[2][3]) {
                card[2][3] = 0;
                System.out.println("The number 51 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 51

            }
            if (num == card2[2][3]) {
                card2[2][3] = 0;
                System.out.println("The number 48 in Player 2's bingo cardhas been marked 0"); // Printout marker for
                                                                                               // number 48

            }

            if (num == card[2][4]) {
                card[2][4] = 0;
                System.out.println("The number 74 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 74

            }
            if (num == card2[2][4]) {
                card2[2][4] = 0;
                System.out.println("The number 74 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 74

            }

            if (num == card[3][0]) {
                card[3][0] = 0;
                System.out.println("The number 7 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                               // number 7

            }
            if (num == card2[3][0]) {
                card2[3][0] = 0;
                System.out.println("The number 14 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 14

            }

            if (num == card[3][1]) {
                card[3][1] = 0;
                System.out.println("The number 17 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 17

            }
            if (num == card2[3][1]) {
                card2[3][1] = 0;
                System.out.println("The number 23 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 23

            }

            if (num == card[3][2]) {
                card[3][2] = 0;
                System.out.println("The number 37 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 37

            }
            if (num == card2[3][2]) {
                card2[3][2] = 0;
                System.out.println("The number 36 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 36

            }

            if (num == card[3][3]) {
                card[3][3] = 0;
                System.out.println("The number 56 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 56

            }
            if (num == card2[3][3]) {
                card2[3][3] = 0;
                System.out.println("The number 47 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 47

            }

            if (num == card[3][4]) {
                card[3][4] = 0;
                System.out.println("The number 67 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 67

            }
            if (num == card2[3][4]) {
                card2[3][4] = 0;
                System.out.println("The number 75 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 75

            }

            if (num == card[4][0]) {
                card[4][0] = 0;
                System.out.println("The number 3 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                               // number 3

            }
            if (num == card2[4][0]) {
                card2[4][0] = 0;
                System.out.println("The number 13 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 13

            }

            if (num == card[4][1]) {
                card[4][1] = 0;
                System.out.println("The number 30 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 30

            }
            if (num == card2[4][1]) {
                card2[4][1] = 0;
                System.out.println("The number 19 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 19

            }

            if (num == card[4][2]) {
                card[4][2] = 0;
                System.out.println("The number 40 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 40

            }
            if (num == card2[4][2]) {
                card2[4][2] = 0;
                System.out.println("The number 44 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 44

            }

            if (num == card[4][3]) {
                card[4][3] = 0;
                System.out.println("The number 50 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 50

            }
            if (num == card2[4][3]) {
                card2[4][3] = 0;
                System.out.println("The number 55 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 55

            }

            if (num == card[4][4]) {
                card[4][4] = 0;
                System.out.println("The number 62 in Player 1's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 62

            }
            if (num == card2[4][4]) {
                card2[4][4] = 0;
                System.out.println("The number 72 in Player 2's bingo card has been marked 0"); // Printout marker for
                                                                                                // number 72

            }

            // end switch
        } // end if

        // printout bingoBoard for player1
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------GAME RESULT-------------------------------------");
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

        // determine the winner for player 1
        while (winner == "N") {

            // determine 1st row
            if (card[0][0] == card[0][1])
                if (card[0][1] == card[0][2])
                    if (card[0][2] == card[0][3])
                        if (card[0][3] == card[0][4]) {
                            System.out.printf("\n\tThe winner is player 1. Won horizontally 1st row.\n");
                            winner = "Y"; // Print result of first row for player 1
                        }

            // determine 2nd row
            if (card[1][0] == card[1][1])
                if (card[1][1] == card[1][2])
                    if (card[1][2] == card[1][3])
                        if (card[1][3] == card[1][4]) {
                            System.out.printf("\n\tThe winner is player 1. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of second row for player 1
                        }

            // determine 3rd row
            if (card[2][0] == card[2][1])
                if (card[2][1] == card[2][2])
                    if (card[2][2] == card[2][3])
                        if (card[2][3] == card[2][4]) {
                            System.out.printf("\n\tThe winner is player 1. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of third row for player 1
                        }

            // determine 4th row
            if (card[3][0] == card[3][1])
                if (card[3][1] == card[3][2])
                    if (card[3][2] == card[3][3])
                        if (card[3][3] == card[3][4]) {
                            System.out.printf("\n\tThe winner is player 1. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of fourth row for player 1
                        }

            // determine 5th row
            if (card[4][0] == card[4][1])
                if (card[4][1] == card[4][2])
                    if (card[4][2] == card[4][3])
                        if (card[4][3] == card[4][4]) {
                            System.out.printf("\n\tThe winner is player 1. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of fifth row for player 1
                        }

            // determine 5th row
            if (card[4][0] == card[4][1])
                if (card[4][1] == card[4][2])
                    if (card[4][2] == card[4][3])
                        if (card[4][3] == card[4][4]) {
                            System.out.printf("\n\tThe winner is player 1. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of fifth row for player 1
                        }

            // determine 1st column
            if (card[0][0] == card[1][0])
                if (card[1][0] == card[2][0])
                    if (card[2][0] == card[3][0])
                        if (card[3][0] == card[4][0]) {
                            System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of first column for player 1
                        }

            // determine 2nd column
            if (card[0][1] == card[1][1])
                if (card[1][1] == card[2][1])
                    if (card[2][1] == card[3][1])
                        if (card[3][1] == card[4][1]) {
                            System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of second column for player 1
                        }

            // determine 3rd column
            if (card[0][2] == card[1][2])
                if (card[1][2] == card[2][2])
                    if (card[2][2] == card[3][2])
                        if (card[3][2] == card[4][2]) {
                            System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of third column for player 1
                        }

            // determine 4th column
            if (card[0][3] == card[1][3])
                if (card[1][3] == card[2][3])
                    if (card[2][3] == card[3][3])
                        if (card[3][3] == card[4][3]) {
                            System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of fourth column for player 1
                        }

            // determine 5th column
            if (card[0][4] == card[1][4])
                if (card[1][4] == card[2][4])
                    if (card[2][4] == card[3][4])
                        if (card[3][4] == card[4][4]) {
                            System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of fifth column for player 1
                        }

            // determine left diagonal
            if (card[0][0] == card[1][1])
                if (card[1][1] == card[2][2])
                    if (card[2][2] == card[3][3])
                        if (card[3][3] == card[4][4]) {
                            System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of left diagonal for player 1
                        }

            // determine right diagonal
            if (card[4][0] == card[3][1])
                if (card[3][1] == card[0][0])
                    if (card[0][0] == card[1][3])
                        if (card[1][3] == card[0][4]) {
                            System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                            winner = "Y"; // Print result of right diagonal for player 1
                        }

            // no winner found
            if (winner == "N") {
                System.out.printf("\n\tNo Winner was found!\n");
                winner = "Y";
            }
        } // end while

        // determine the winner for player 2
        while (winner == "N") {

            // determine 1st row
            if (card2[0][0] == card2[0][1])
                if (card2[0][1] == card2[0][2])
                    if (card2[0][2] == card2[0][3])
                        if (card2[0][3] == card2[0][4]) {
                            System.out.printf("\n\tThe winner is player 2. Won horizontally 1st row.\n");
                            winner = "X"; // Print result of first row for player 2
                        }

            // determine 2nd row
            if (card2[1][0] == card2[1][1])
                if (card2[1][1] == card2[1][2])
                    if (card2[1][2] == card2[1][3])
                        if (card2[1][3] == card2[1][4]) {
                            System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                            winner = "X"; // Print result of second row for player 2
                        }
        }

        // determine 3rd row
        if (card2[2][0] == card2[2][1])
            if (card2[2][1] == card2[2][2])
                if (card2[2][2] == card2[2][3])
                    if (card2[2][3] == card2[2][4]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of third row for player 2
                    }

        // determine 4th row
        if (card2[3][0] == card2[3][1])
            if (card2[3][1] == card2[3][2])
                if (card2[3][2] == card2[3][3])
                    if (card2[3][3] == card2[3][4]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of fourth row for player 2
                    }

        // determine 5th row
        if (card2[4][0] == card2[4][1])
            if (card2[4][1] == card2[4][2])
                if (card2[4][2] == card2[4][3])
                    if (card2[4][3] == card2[4][4]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of fifth row for player 2
                    }

        // determine 5th row
        if (card2[4][0] == card2[4][1])
            if (card2[4][1] == card2[4][2])
                if (card2[4][2] == card2[4][3])
                    if (card2[4][3] == card2[4][4]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of fifth row for player 2
                    }

        // determine 1st column
        if (card2[0][0] == card2[1][0])
            if (card2[1][0] == card2[2][0])
                if (card2[2][0] == card2[3][0])
                    if (card2[3][0] == card2[4][0]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of first column for player 2
                    }

        // determine 2nd column
        if (card2[0][1] == card2[1][1])
            if (card2[1][1] == card2[2][1])
                if (card2[2][1] == card2[3][1])
                    if (card2[3][1] == card2[4][1]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of second column for player 2
                    }

        // determine 3rd column
        if (card2[0][2] == card2[1][2])
            if (card2[1][2] == card2[2][2])
                if (card2[2][2] == card2[3][2])
                    if (card2[3][2] == card2[4][2]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of third column for player 2
                    }

        // determine 4th column
        if (card2[0][3] == card2[1][3])
            if (card2[1][3] == card2[2][3])
                if (card2[2][3] == card2[3][3])
                    if (card2[3][3] == card2[4][3]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of fourth column for player 2
                    }

        // determine 5th column
        if (card2[0][4] == card2[1][4])
            if (card2[1][4] == card2[2][4])
                if (card2[2][4] == card2[3][4])
                    if (card2[3][4] == card2[4][4]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of fifth column for player 2
                    }

        // determine left diagonal
        if (card2[0][0] == card2[1][1])
            if (card2[1][1] == card2[2][2])
                if (card2[2][2] == card2[3][3])
                    if (card2[3][3] == card2[4][4]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of left diagonal for player 2
                    }

        // determine right diagonal
        if (card2[4][0] == card2[3][1])
            if (card2[3][1] == card2[0][0])
                if (card2[0][0] == card2[1][3])
                    if (card2[1][3] == card2[0][4]) {
                        System.out.printf("\n\tThe winner is player 2. Won horizontally 2nd row.\n");
                        winner = "X"; // Print result of right diagonal for player 2
                    }

        // no winner found
        if (winner == "N") {
            System.out.printf("\n\tNo Winner was found!\n");
            winner = "X"; // Print overall result of game
        }
    } // end while
}
