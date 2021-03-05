package david.horse.service.classes;

import org.springframework.stereotype.Service;
import david.horse.service.classes.*;


@Service
public class LeeAlg implements HorseService {
    @Override
    public int getCount(int width, int height, String start, String end) {
        Chessboard chessboard = new Chessboard(width, height);
        Horse horse = new Horse(start, chessboard);
        EndSquare endSquare = new EndSquare(end, chessboard);
        return CountSteps.count(horse, endSquare);
    }
}