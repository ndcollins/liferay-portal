/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.controlpanel.webcontent.wctemplatestructure.addwctemplatestructurefieldtext;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class ViewWCTemplateStructureFieldTextTest extends BaseTestCase {
	public void testViewWCTemplateStructureFieldText()
		throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.clickAt("//div[@id='dockbar']",
			RuntimeVariables.replace("Dockbar"));
		selenium.waitForElementPresent(
			"//script[contains(@src,'/aui/aui-editable/aui-editable-min.js')]");
		assertEquals(RuntimeVariables.replace("Go to"),
			selenium.getText("//li[@id='_145_mySites']/a/span"));
		selenium.mouseOver("//li[@id='_145_mySites']/a/span");
		selenium.waitForVisible("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Web Content",
			RuntimeVariables.replace("Web Content"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Manage"),
			selenium.getText("//span[@title='Manage']/ul/li/strong/a"));
		selenium.clickAt("//span[@title='Manage']/ul/li/strong/a",
			RuntimeVariables.replace("Manage"));
		selenium.waitForVisible(
			"//div[@class='lfr-menu-list unstyled']/ul/li/a[contains(.,'Structures')]");
		assertEquals(RuntimeVariables.replace("Structures"),
			selenium.getText(
				"//div[@class='lfr-menu-list unstyled']/ul/li/a[contains(.,'Structures')]"));
		selenium.clickAt("//div[@class='lfr-menu-list unstyled']/ul/li/a[contains(.,'Structures')]",
			RuntimeVariables.replace("Structures"));
		selenium.waitForVisible("//iframe[contains(@src,'Structures')]");
		selenium.selectFrame("//iframe[contains(@src,'Structures')]");
		selenium.waitForElementPresent(
			"//script[contains(@src,'/liferay/store.js')]");
		selenium.waitForVisible("//input[@name='_166_keywords']");
		selenium.type("//input[@name='_166_keywords']",
			RuntimeVariables.replace("WC Structure Text Name"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible(
			"//tr[contains(.,'WC Structure Text Name')]/td[3]/a");
		assertEquals(RuntimeVariables.replace("WC Structure Text Name"),
			selenium.getText(
				"//tr[contains(.,'WC Structure Text Name')]/td[3]/a"));
		assertEquals(RuntimeVariables.replace("Actions"),
			selenium.getText(
				"//tr[contains(.,'WC Structure Text Name')]/td[6]/span[@title='Actions']/ul/li/strong/a"));
		selenium.clickAt("//tr[contains(.,'WC Structure Text Name')]/td[6]/span[@title='Actions']/ul/li/strong/a",
			RuntimeVariables.replace("Actions"));
		selenium.waitForVisible(
			"//div[@class='lfr-menu-list unstyled']/ul/li/a[contains(.,'Manage Templates')]");
		assertEquals(RuntimeVariables.replace("Manage Templates"),
			selenium.getText(
				"//div[@class='lfr-menu-list unstyled']/ul/li/a[contains(.,'Manage Templates')]"));
		selenium.clickAt("//div[@class='lfr-menu-list unstyled']/ul/li/a[contains(.,'Manage Templates')]",
			RuntimeVariables.replace("Manage Templates"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//input[@name='_166_keywords']");
		selenium.type("//input[@name='_166_keywords']",
			RuntimeVariables.replace("WC Template Structure Text Name"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible(
			"//tr[contains(.,'WC Template Structure Text Name')]/td[3]/a");
		assertEquals(RuntimeVariables.replace("WC Template Structure Text Name"),
			selenium.getText(
				"//tr[contains(.,'WC Template Structure Text Name')]/td[3]/a"));
		selenium.clickAt("//tr[contains(.,'WC Template Structure Text Name')]/td[3]/a",
			RuntimeVariables.replace("WC Template Structure Text Name"));
		selenium.waitForPageToLoad("30000");
		Thread.sleep(1000);
		selenium.waitForVisible("//h1[@class='header-title']/span");
		assertEquals(RuntimeVariables.replace(
				"WC Template Structure Text Name (WC Structure Text Name)"),
			selenium.getText("//h1[@class='header-title']/span"));
		assertEquals("WC Template Structure Text Name",
			selenium.getValue("//input[@id='_166_name_en_US']"));
		assertEquals("WC Template Structure Text Description",
			selenium.getValue("//textarea[@id='_166_description_en_US']"));
		selenium.select("//select[@id='_166_editorType']",
			RuntimeVariables.replace("value=rich"));
		assertEquals(RuntimeVariables.replace("<p>$text.getData()</p>##"),
			selenium.getText(
				"//div[@class='ace_layer ace_text-layer']/div/div[contains(.,'text.getData')]"));
		selenium.selectFrame("relative=top");
	}
}