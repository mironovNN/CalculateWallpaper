public class CalculateService {
    public int  calculateService(double lengthRoom, double widthRoom, double heightRoom) {

        double lengthRollWallpaper = 10;
        double widthRoll = 1.06;
        double heightCorrection = 0.1;

        if (lengthRoom <= 0){
            return 0;
        }
        if (widthRoom <= 0){
            return 0;
        }
        if (heightRoom <= 0){
            return 0;
        }

        int numberFullPiecesInRoll = (int) Math.floor(lengthRollWallpaper / (heightRoom + heightCorrection));
        int numberPiecesForRoom = (int) Math.ceil(((lengthRoom + widthRoom) * 2) / widthRoll);
        int numberRollWallpaper = (int) Math.ceil(numberPiecesForRoom / numberFullPiecesInRoll);

        return numberRollWallpaper;
    }
}
