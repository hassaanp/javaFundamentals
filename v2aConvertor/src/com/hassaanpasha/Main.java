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
        File source = new File("https://r7---sn-2uja-pnc6.googlevideo.com/videoplayback?requiressl=yes&ei=yJ0MWrOJOsmNWID9t6gJ&itag=247&keepalive=yes&sparams=aitags%2Cclen%2Cdur%2Cei%2Cgir%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Ckeepalive%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpl%2Crequiressl%2Csource%2Cexpire&pl=17&initcwndbps=98750&ipbits=0&key=yt6&mime=video%2Fwebm&aitags=133%2C134%2C135%2C136%2C160%2C242%2C243%2C244%2C247%2C278&expire=1510797865&lmt=1449644631240370&beids=%5B9466593%5D&clen=21294438&source=youtube&ms=au&ip=39.32.241.7&mv=m&mt=1510776112&dur=226.601&id=o-ALxsKn2cbZefSZ6evMkZFz33Y7EY1Bt9Oo_2G1B75vpF&mn=sn-2uja-pnc6&mm=31&gir=yes&signature=0D959F9E620065DA7DCF251AEB2C381CF570007B.E0BB302D8EDC6BF9C7513DC77E5319127947DBF1&ratebypass=yes");
        File target = new File("/home/hassaan/IdeaProjects/v2aConvertor/src/target1.mp3");
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
