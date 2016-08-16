package com.springinaction.springidol;

import java.util.Collection;

/**
 * Created by Du on 16/8/15.
 */
public class OneManBand implements Performer {

    public OneManBand() {

    }

    private Collection<Instrument> instruments;

    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    //  注入 instrument 集合
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
