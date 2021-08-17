package com.epam.jwd.firstTask.repository;

import com.epam.jwd.firstTask.entity.CubeEntity;
import com.epam.jwd.firstTask.entity.PointEntity;

import java.util.ArrayList;
import java.util.List;

public class ListCubeRepository implements Repository {
    private final List<CubeEntity> cubes;

    ListCubeRepository(List<CubeEntity> cubes) {
        this.cubes = cubes;
    }

    @Override
    public int add(CubeEntity cube) {
        cubes.add(cube);
        return cubes.indexOf(cube);
    }

    @Override
    public int delete(CubeEntity cube) {
        final int deleteIndex = cubes.indexOf(cube);
        cubes.remove(cube);
        return deleteIndex;
    }

    @Override
    public CubeEntity update(CubeEntity changeCube, List<PointEntity> newUpperBase, List<PointEntity> newLowerBase) {
        CubeEntity modifiedCube = null;
        for (CubeEntity cube : cubes) {
            if(cube.equals(changeCube)) {
                cube.changeCubeParams(newUpperBase,newLowerBase);
                modifiedCube = cube;
            }
        }
        return modifiedCube;
    }

    @Override
    public CubeEntity update(CubeEntity changeCube, List<PointEntity> newUpperBase, List<PointEntity> newLowerBase) {
        return null;
    }
    }

    @Override
    public List<CubeEntity> query(CubeSpecificationFind findSpecification) {
        List<CubeEntity> requireCubes = new ArrayList<>();
        for (CubeEntity cube : cubes) {
            if(findSpecification.specified(cube)){
                requireCubes.add(cube);
            }
        }
        return requireCubes;
    }

    public List<CubeEntity> sort(CubeSpecificationSort sortSpecification) {
        sortSpecification.specified(cubes);
        return cubes;
    }

    @Override
    public List<CubeEntity> getCubes() {
        return cubes;
    }
}
}
