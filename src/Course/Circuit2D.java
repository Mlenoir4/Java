package Course;

public class Circuit2D {
    int distanceParcourus;
    int distanceCircuit;

    public String[][] createCircuit(int x, int y) { //create map vierge
        int[][] tableau = new int[x][y];
        String[][] maping = new String[x][y+1];
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                if (i == 0 || i == tableau.length - 1 || j == 0 || j == tableau[i].length - 1) //bordure horizontal
                    maping[i][j] = "/";
                else if (j == 1 || j == 2 || j == 3 || j == 4 || j == tableau[i].length - 2 || j == tableau[i].length - 3 || j == tableau[i].length - 4 || j == tableau[i].length - 5 || i == 1 || i == tableau.length - 2)
                    maping[i][j] = " "; //bitume
                else
                    maping[i][j] = "/"; //bordure vertical
            }
            maping[i][maping[maping.length-1].length-1] = "\n";
        }
        return maping;
    }

    String[][] updatePosMap(String[][] map, int[][] positionBleu, int[][] positionVert, int[][] positionRouge, int[][] positionJaune) //update posVoiture sur la map
    {
        cleanMap(map);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == positionBleu.length - 1 & j == positionBleu[positionBleu.length - 1].length - 1) //position depart Bleu
                    map[i][j] = "b";
                else if (i == positionVert.length - 1 & j == positionVert[positionVert.length - 1].length - 1) //position depart Vert
                    map[i][j] = "v";
                else if (i == positionRouge.length - 1 & j == positionRouge[positionRouge.length - 1].length - 1) //position depart Rouge
                    map[i][j] = "r";
                else if (i == positionJaune.length - 1 & j == positionJaune[positionJaune.length - 1].length - 1) //position depart Jaune
                    map[i][j] = "j";
            }
        }
        return map;
    }

    private void cleanMap(String[][] map) { // delete v/s/b/j from map
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j].equals("b") || map[i][j].equals("v") || map[i][j].equals("r") || map[i][j].equals("j"))
                    map[i][j] = " ";
            }
        }
    }

    void afficherMap(String[][] map) { //print map
        for (String[] tab: map) {
            for (String s: tab) {
                System.out.print(s);
            }
        }
    }


}
