package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static stack.ValidParentheses.isValid;

public class TestValidParantheses {
    @Test
    public void testIsValid(){
        assertTrue(isValid("()"));
    }

    @Test
    public void testIsValid2(){
        assertTrue(isValid("()[]{}"));
    }

    @Test
    public void testIsValid3(){
        assertFalse(isValid("(])"));
    }
}
