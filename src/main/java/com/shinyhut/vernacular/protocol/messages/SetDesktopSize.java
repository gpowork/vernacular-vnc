package com.shinyhut.vernacular.protocol.messages;

import com.shinyhut.vernacular.protocol.desktop.ExtendedDesktopConfiguration;
import com.shinyhut.vernacular.protocol.desktop.Screen;

import java.io.*;

public class SetDesktopSize implements Encodable {

    private ExtendedDesktopConfiguration edc;
    private int width;
    private int height;


    public SetDesktopSize(ExtendedDesktopConfiguration extendedDesktopConfiguration, int width, int height) {
        this.edc = extendedDesktopConfiguration;
        this.width = width;
        this.height = height;
    }

    @Override
    public void encode(OutputStream out) throws IOException {
        DataOutput dataOutput = new DataOutputStream(out);
        dataOutput.write(251);
        dataOutput.writeByte(0x00); //padding
        dataOutput.writeShort(width);
        dataOutput.writeShort(height);
        dataOutput.write(edc.getNumberOfScreens());
        dataOutput.writeByte(0x00); //padding
        for(int i = 0; i < edc.getNumberOfScreens(); ++i) {
            Screen s = edc.getScreens()[i];
            dataOutput.writeInt(s.getId());
            dataOutput.writeShort(0);
            dataOutput.writeShort(0);
            dataOutput.writeShort(width);
            dataOutput.writeShort(height);
            dataOutput.writeInt(0);
        }
    }
}
