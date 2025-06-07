import com.sun.source.tree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeOneZeroTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }


}