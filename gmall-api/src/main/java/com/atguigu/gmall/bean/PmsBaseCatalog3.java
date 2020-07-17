package com.atguigu.gmall.bean;

import java.io.Serializable;

public class PmsBaseCatalog3 implements Serializable {

    String id;
    String name;
    String catalog2Id;

    public String getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(String catalog2Id) {
        this.catalog2Id = catalog2Id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
