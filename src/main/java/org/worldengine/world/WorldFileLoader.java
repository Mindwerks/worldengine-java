package org.worldengine.world;

import com.google.protobuf.CodedInputStream;

import java.io.IOException;
import java.io.InputStream;

public final class WorldFileLoader {

    private WorldFileLoader(){

    }

    public static WorldFile.World fromInputStream(InputStream is) throws IOException {
        CodedInputStream codedInputStream = CodedInputStream.newInstance(is);
        codedInputStream.setSizeLimit(Integer.MAX_VALUE);
        WorldFile.World worldFile = WorldFile.World.parseFrom(codedInputStream);
        return worldFile;
    }

}
