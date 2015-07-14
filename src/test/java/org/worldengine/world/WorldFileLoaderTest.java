package org.worldengine.world;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by federico on 14/07/15.
 */
public class WorldFileLoaderTest {

    @Test
    public void loadWorld() throws IOException {
        InputStream is = WorldFileLoaderTest.class.getClassLoader().getResourceAsStream("seed_1534.world");
        WorldFile.World worldFile = WorldFileLoader.fromInputStream(is);
        assertEquals("seed_1534", worldFile.getName());
    }

}
