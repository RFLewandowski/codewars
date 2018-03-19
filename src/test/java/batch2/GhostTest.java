package batch2;

import batch2.Ghost;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GhostTest {
    private List<String> ghostsColors;

    @Before
    public void setUp() throws Exception {
        ghostsColors = new ArrayList();
        for (int i = 0; i < 100; i++) {
            ghostsColors.add((new Ghost()).getColor());
        }
    }

    @Test
    public void ShouldSometimesMakeWhiteGhost() throws Exception {
        assertTrue(ghostsColors.contains("white"));
    }

    @Test
    public void ShouldSometimesMakeYellowGhost() throws Exception {
        assertTrue(ghostsColors.contains("yellow"));
    }

    @Test
    public void ShouldSometimesMakePurpleGhost() throws Exception {
        assertTrue(ghostsColors.contains("purple"));
    }

    @Test
    public void ShouldSometimesMakeRedGhost() throws Exception {
        assertTrue(ghostsColors.contains("red"));
    }
}