package com.jachs.kaptcha.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:/kaptcha.properties"},encoding = "UTF-8")
public class KaptchaBean {
	@Value("${ptcha.border}")
	private String border;
	@Value("${kaptcha.border.color}")
	private String color;
	@Value("${kaptcha.textproducer.font.color}")
	private String font_color;
	@Value("${kaptcha.image.width}")
	private String width;
	@Value("${kaptcha.image.height}")
	private String height;
	@Value("${kaptcha.textproducer.font.size}")
	private String font_size;
	@Value("${kaptcha.session.key}")
	private String key;
	@Value("${kaptcha.textproducer.char.length}")
	private String length;
	@Value("${kaptcha.textproducer.font.names}")
	private String names;
	
	public String getBorder() {
		return border;
	}
	public void setBorder(String border) {
		this.border = border;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFont_color() {
		return font_color;
	}
	public void setFont_color(String font_color) {
		this.font_color = font_color;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getFont_size() {
		return font_size;
	}
	public void setFont_size(String font_size) {
		this.font_size = font_size;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}


}