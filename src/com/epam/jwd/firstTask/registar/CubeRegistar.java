package com.epam.jwd.firstTask.registar;

import com.epam.jwd.firstTask.entity.CubeEntity;
import com.epam.jwd.firstTask.model.Cube;
import com.epam.jwd.firstTask.registar.context.CubeContext;

public class CubeRegistar {

    private final static Cube sec = new Cube();
    private final CubeContext context;

    CubeRegistar(int volume, Integer volumeRatio, int area){
        context = CubeContext.of(volume,volumeRatio,area);
    }

    public static CubeRegistar of(int volume, Integer volumeRatio, int area){
        return new CubeRegistar(volume,volumeRatio,area);
    }

    public CubeContext getContext() {
        return context;
    }

    public void update(CubeEntity cube) {
        double volume = 0;
        double area = 0;
        context.setArea(area);
        context.setVolume(volume);
    }
}
