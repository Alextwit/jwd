package com.epam.jwd.firstTask.entity.observer;

import com.epam.jwd.firstTask.registar.CubeRegistar;

public interface CubeObserver {
    CubeRegistrar addRegistrar(CubeRegistrar registrar);
    CubeRegistrar removeRegistrar(CubeRegistrar registrar);
    void notifyRegistrar();
}
