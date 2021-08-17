package com.epam.jwd.firstTask.entity;

import com.epam.jwd.firstTask.entity.observer.CubeObserver;
import com.epam.jwd.firstTask.registar.CubeRegistar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CubeEntity implements CubeObserver {
    private static final int FOURTH_NODE_INDEX = 3;
    private static final int FIRST_NODE_INDEX = 0;
    private final List<PointEntity> nodesOfUpperBase = new ArrayList<>();
    private final List<PointEntity> nodesOfLowerBase = new ArrayList<>();
    private Double edgeLength;
    private final List<CubeRegistar> registrars;

    CubeEntity(List<PointEntity> nodesOfUpperBase, List<PointEntity> nodesOfLowerBase) {
        registrars = null;
        setParams(nodesOfUpperBase,nodesOfLowerBase);
    }

    public static CubeEntity of(List<PointEntity> nodesOfUpperBase, List<PointEntity> nodesOfLowerBase) {
        return new CubeEntity(nodesOfUpperBase, nodesOfLowerBase);
    }

    @Override
    public CubeRegistar addRegistrar(CubeRegistar registrar) {
        registrars.add(registrar);
        return registrar;
    }

    @Override
    public CubeRegistar removeRegistrar(CubeRegistar registrar) {
        registrars.add(registrar);
        return registrar;
    }

    @Override
    public CubeRegistrar addRegistrar(CubeRegistrar registrar) {
        return null;
    }

    @Override
    public CubeRegistrar removeRegistrar(CubeRegistrar registrar) {
        return null;
    }

    @Override
    public void notifyRegistrar() {

    }

    public Double getEdgeLength() {
        return edgeLength;
    }

    public List<PointEntity> getNodesOfUpperBase() {
        return nodesOfUpperBase;
    }

    public List<PointEntity> getNodesOfLowerBase() {
        return nodesOfLowerBase;
    }

    public List<CubeRegistar> getRegistrars() {
        return registrars;
    }

    public void changeCubeParams(List<PointEntity> nodesOfUpperBase, List<PointEntity> nodesOfLowerBase){
        setParams(nodesOfUpperBase,nodesOfLowerBase);
        notifyRegistrar();
    }

    private void setParams(List<PointEntity> nodesOfUpperBase, List<PointEntity> nodesOfLowerBase){
        this.nodesOfLowerBase.addAll(nodesOfLowerBase);
        this.nodesOfUpperBase.addAll(nodesOfUpperBase);
        this.edgeLength = nodesOfUpperBase.get(FOURTH_NODE_INDEX).getX()
                - nodesOfUpperBase.get(FIRST_NODE_INDEX).getX();
    }

    @Override
    public String toString() {
        return "CubeEntity{" + "\n" +
                "nodesOfUpperBase=" + nodesOfUpperBase + "\n" +
                ",nodesOfLowerBase=" + nodesOfLowerBase + "\n" +
                ",edgeLength=" + edgeLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CubeEntity that = (CubeEntity) o;
        return Double.compare(that.edgeLength, edgeLength) == 0 &&
                Objects.equals(nodesOfUpperBase, that.nodesOfUpperBase) &&
                Objects.equals(nodesOfLowerBase, that.nodesOfLowerBase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodesOfUpperBase, nodesOfLowerBase, edgeLength);
    }
}
