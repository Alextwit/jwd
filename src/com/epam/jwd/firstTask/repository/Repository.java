package com.epam.jwd.firstTask.repository;

import com.epam.jwd.firstTask.entity.CubeEntity;
import com.epam.jwd.firstTask.entity.PointEntity;

import java.util.List;

public interface Repository {
    int add(CubeEntity cube);
    int delete(CubeEntity cube);
    CubeEntity update(CubeEntity changeCube, List<PointEntity> newUpperBase, List<PointEntity> newLowerBase);
    List<CubeEntity> getCubes();
    static Repository newInstance(List<CubeEntity> cubes){
        return new ListCubeRepository(cubes);
    }
}
