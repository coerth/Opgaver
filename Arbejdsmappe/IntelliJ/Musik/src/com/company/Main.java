package com.company;

//import javax.sound.midi.Instrument;

import com.company.model.*;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Percussion p = new Drum();
        Drum d = new Drum();

        Instrument ins = new Drum();
        Instrument ins2 = new Piano();
        Instrument ins3 = new Trumpet();
//
//        ins.update();
//        ins2.update();
//        ins3.update();
        useInstruments(ins2);

    }

    private static void useInstruments(Instrument ins){
        if (ins instanceof Drum) {
            Drum instrument = (Drum) ins;
            instrument.changeStick();
        } else if (ins instanceof Piano) {
            Piano instrument = (Piano) ins;
           String s = instrument.holdTone();
            System.out.println(s.toUpperCase(Locale.ROOT));
        }
    }
}
