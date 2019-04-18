package com.tcs.designer.builder;

public abstract class Builder {
    public abstract void makeString(String str);
    public abstract void makeTitle(String title);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
