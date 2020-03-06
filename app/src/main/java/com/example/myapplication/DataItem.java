package com.example.myapplication;

//import com.gabrielittner.auto.value.cursor.ColumnName;
import com.google.auto.value.AutoValue;

import java.io.Serializable;

@AutoValue
public abstract class DataItem  implements Serializable {

    //@ColumnName("colume1")
    public abstract  String getDataName();
}
