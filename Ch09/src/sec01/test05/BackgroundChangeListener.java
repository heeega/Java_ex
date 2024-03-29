package sec01.test05;

import sec01.test05.CheckBox.OnSelectListener;

public class BackgroundChangeListener implements OnSelectListener {

	@Override
	public void onSelect() {
		System.out.println("배경색을 변경합니다.");
		
	}

}
