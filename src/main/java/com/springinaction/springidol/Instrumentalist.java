package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/7/26.
 */
public class Instrumentalist implements Performer {

    private String song;

    public Instrumentalist() {
    }

    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument2.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }// 注入歌曲

    private Instrument instrument2;

    // 注入乐器

    public void setInstrument(Instrument instrument2) {
        this.instrument2 = instrument2;
    }

    @Autowired
    public void hereIsYourInstrument(Saxophone saxophone) {
        this.instrument2 = saxophone;
    }
}
