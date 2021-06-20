package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoadWebSkeletonTest{

    @Test
    void createFolder() {
        String test = "test";
        String actual = LoadWebSkeleton.createFolder(test);
        String expected = "Created src/main/java/ex43/website/test";
        assertEquals(expected, actual);
    }
}
