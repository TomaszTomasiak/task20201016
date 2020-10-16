package com.horus_task;

public interface IMyStructure {

    INode findByCode(String code);

    INode findByRenderer(String renderer);

    int count();
}
