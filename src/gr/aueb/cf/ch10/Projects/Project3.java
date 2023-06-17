package gr.aueb.cf.ch10.Projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Project3 {

    public static void main(String[] args) throws IOException {
        int[][] characters = new int[256][2];
        int character = 0;
        int characterPosition;

        BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/project3-ch10.txt"));

        int row = 0;

        while ((character = bf.read()) != -1) {
            if (!(searchCharacter(characters, character))) {
                characters[row][0] = character;
                characters[row][1]++;
                row++;
            } else {
                characterPosition = searchPosition(characters, character);
                characters[characterPosition][1]++;
            }
        }

        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < characters[i].length; j++){
                if (j == 0) {
                    System.out.print((char)characters[i][j] + " ");
                } else {
                    System.out.print(characters[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean searchCharacter(int[][] characters, int character) {
        for (int i = 0; i < characters.length; i++) {
            if (character == characters[i][0]){
                return true;
            }
        }
        return false;
    }

    public static int searchPosition(int[][] characters, int character) {
        int position = 0;
        for (int i = 0; i < characters.length; i++) {
            if (character == characters[i][0]) {
                position = i;
                break;
            }
        }

        return position;
    }

}

