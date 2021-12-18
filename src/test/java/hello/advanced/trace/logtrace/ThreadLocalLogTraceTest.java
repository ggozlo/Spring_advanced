package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

class ThreadLocalLogTraceTest {

    ThreadLocalLogTrace trace =  new ThreadLocalLogTrace();


    @Test
    public void begin_end_level2() {

        TraceStatus hello1 = trace.begin("hello");
        TraceStatus hello2 = trace.begin("hello2");
        trace.end(hello2);
        trace.end(hello1);

    }

    @Test
    public void begin_exception_level2() {
        TraceStatus hello1 = trace.begin("hello");
        TraceStatus hello2 = trace.begin("hello2");
        trace.exception(hello1, new IllegalStateException());
        trace.exception(hello2, new IllegalStateException());

    }
}