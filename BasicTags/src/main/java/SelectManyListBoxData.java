import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "selectManyListBox", eager = true)
@SessionScoped
public class SelectManyListBoxData implements Serializable {
	private static final long serialVersionUID = 1L;
	public String[] data = { "1", "2", "3" };

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}
}
