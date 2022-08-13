package ru.nebukina.ls4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger("TriangleTest");

    @ParameterizedTest
    @MethodSource("AandBandC")
    void AreaEqualsTest(Triangle triangle, double s){

        Assertions.assertEquals(triangle.areaTriangle(), s);
        logger.info("Тест прошел");
    }
    private static Stream<Arguments> AandBandC(){
        return Stream.of(
                Arguments.of(new Triangle(3,4,5),6),
                Arguments.of(new Triangle(2,4,5),3.79967103839266590791),
                Arguments.of(new Triangle(3,4,6),5.33268225192538543772)
        );
    }
    Triangle triangle = new Triangle(3,20,4);
    @Test
    void TriangleExceptionTest(){
        Assertions.assertThrows(TriangleException.class, ()->triangle.noTriangle());
        logger.error("Ошибка");
    }
}
