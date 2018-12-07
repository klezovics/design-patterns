package com.klezovich.design_patterns.creational.abstractfactory.improved;

public class YellowThemeWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new YellowThemeScrollbar();
	}

	@Override
	public Window createWindow() {
		return new YellowThemeWindow();
	}

}
