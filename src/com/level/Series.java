package com.level;

public interface Series {
    int getNext();
    void reset();
    void setStart();
}

abstract class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }
    
    public void setStart( int x ) {
        start = x;
        val = x;
    }
}
