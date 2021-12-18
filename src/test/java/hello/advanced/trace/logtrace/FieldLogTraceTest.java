package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldLogTraceTest {

    FieldLogTrace trace =  new FieldLogTrace();


    @Test
    public void begin_end_level2() {

        TraceStatus hello1 = trace.begin("hello");
        TraceStatus hello2 = trace.begin("hello2");
        trace.end(hello2);
        trace.end(hello1);

    }
}