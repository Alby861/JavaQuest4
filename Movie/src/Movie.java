// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Movie {
    public static void main(String[] args) {
        String[] movies = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade"};
        String[][] actors = {
                {"Harry Ford","Karen Allen","Paul Freeman"},
                {"Harry Ford","Kate Capshaw", "Jonathan Ke Quan"},
                {"Harry Ford","Sean Connery", "Denholm Elliott"}
        };

        for (int i = 0; i < movies.length; i++) {

            System.out.println("In the movie: " + movies[i] +", the actors are: ");

            for (int j = 0; j < actors[i].length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(actors[i][j]);
            }
            System.out.println(".");
        }
    }
}