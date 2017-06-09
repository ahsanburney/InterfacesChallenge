package com.ahsanburney;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kulsum on 6/9/2017.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> readValues);

}
