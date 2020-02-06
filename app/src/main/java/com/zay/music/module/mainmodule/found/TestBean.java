package com.zay.music.module.mainmodule.found;

import androidx.databinding.ObservableField;

public class TestBean {
    public final ObservableField<String> name = new ObservableField<>();
    private void setName(String name) {
        this.name.set(name);
    }
    public ObservableField<String> getName() {
        return name;
    }
}
