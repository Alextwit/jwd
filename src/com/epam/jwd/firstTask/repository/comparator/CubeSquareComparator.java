package com.epam.jwd.firstTask.repository.comparator;

import com.epam.jwd.firstTask.model.Cube;

import java.util.Comparator;

public class CubeSquareComparator implements Comparator<Cube> {

    @Override
    public int compare(Cube o1, Cube o2) {
        return (int) (o1.getSquare() - o2.getSquare());
    }
}
