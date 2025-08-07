package com.wipro.task;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestStringConcate.class,
    TestSort.class,
    TestCheckPresence.class
})
public class AllTests {
    // This class remains empty. It is used only as a holder for the above annotations
}