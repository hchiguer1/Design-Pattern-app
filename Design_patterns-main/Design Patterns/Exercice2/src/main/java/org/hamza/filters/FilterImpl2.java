package org.hamza.filters;

import java.util.Arrays;

public class FilterImpl2 implements ImageFilter {
    public int[] filter(int[] data) {

        return Arrays.stream(data)
                .map(val -> val + 2).toArray();
    }
}
