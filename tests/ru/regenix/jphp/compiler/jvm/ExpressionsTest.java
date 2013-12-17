package ru.regenix.jphp.compiler.jvm;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import ru.regenix.jphp.runtime.memory.support.Memory;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExpressionsTest extends JvmCompilerCase {

    @Test
    public void testAssignAssign(){
        Memory memory = includeResource("expressions/assign_assign.php");
        Assert.assertEquals("success", memory.toString());
    }

    @Test
    public void testPlusMinusMulDiv(){
        Memory memory = includeResource("expressions/plus_minus_mul_div.php");
        Assert.assertEquals("success", memory.toString());
    }
}