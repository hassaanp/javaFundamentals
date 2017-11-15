package com.hassaanpasha;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.InputFormatException;
import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;

import java.io.File;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args){
        File source = new File("source.mp4");
        File target = new File("target.mp3");
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(128000));
        audio.setChannels(new Integer(2));
        audio.setSamplingRate(new Integer(44100));
        it.sauronsoftware.jave.EncodingAttributes attrs = new it.sauronsoftware.jave.EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);
        Encoder encoder = new Encoder();
        try {
            encoder.encode(source, target, attrs);
        } catch (IllegalArgumentException | it.sauronsoftware.jave.EncoderException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//}
