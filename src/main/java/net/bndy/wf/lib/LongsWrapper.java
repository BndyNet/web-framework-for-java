package net.bndy.wf.lib;

import java.io.Serializable;
import java.util.List;

public class LongsWrapper implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Long> values;

    public List<Long> getValues() {
        return values;
    }

    public void setValues(List<Long> values) {
        this.values = values;
    }
}
