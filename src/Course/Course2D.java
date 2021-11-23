    package Course;

    import java.util.ArrayList;

    public class Course2D {
        int nombreDeTour = 3;
        int temps;
        ArrayList<Voiture2D> voiture2DList;
        String[][] maping;

        void demarerLaCourse()
        {
            Circuit2D circuit2D = new Circuit2D();
            maping = circuit2D.createCircuit(13, 12); //13, 13
            circuit2D.afficherMap(circuit2D.updatePosMap(maping, new int[7][2],new int[7][3], new int[7][4], new int[7][5])); //Position initial voiture
            startCourse(circuit2D);
        }

        void startCourse(Circuit2D circuit2D)
        {
            int i = 0;
            while(i <= 5) //nombreDeTour
            {
                circuit2D.afficherMap(circuit2D.updatePosMap(maping, new int[7+i][2], new int[7-i][3], new int[7][4], new int[7][5])); //Current pos + x
                i++;
            }
        }
        void updateVoiture() //update toute les 10S -> update vitesse   //Update tout les s distanceParcouru des voitures -> si 100 -> updatePosMap This.voiture
        {
            int[][] positionBleu = new int[7][2];
            int[][] positionVert = new int[7][3];
            int[][] positionRouge = new int[7][4];
            int[][] positionJaune = new int[7][5];
        }



}
