package com.springinaction.springidol;

/**
 * Created by Administrator on 2016/7/26.
 */
public class Instrumentalist implements Performer {

    private String song;

    public Instrumentalist() {
    }

    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }// 注入歌曲

    private Instrument instrument;

    // 注入乐器
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
