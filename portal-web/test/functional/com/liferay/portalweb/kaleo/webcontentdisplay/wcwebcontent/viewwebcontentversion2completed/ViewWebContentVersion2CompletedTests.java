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

package com.liferay.portalweb.kaleo.webcontentdisplay.wcwebcontent.viewwebcontentversion2completed;

import com.liferay.portalweb.kaleo.webcontentdisplay.wcwebcontent.viewwebcontentassignedtome.AddWCWebContentWCDTest;
import com.liferay.portalweb.kaleo.webcontentdisplay.wcwebcontent.viewwebcontentassignedtome.AssignToMeWebContentActionsTest;
import com.liferay.portalweb.kaleo.webcontentdisplay.wcwebcontent.viewwebcontentassignedtome.TearDownWorkflowConfigurationTest;
import com.liferay.portalweb.kaleo.webcontentdisplay.wcwebcontent.viewwebcontentversion2assignedtome.ApproveWebContentActionsTest;
import com.liferay.portalweb.kaleo.webcontentdisplay.wcwebcontent.viewwebcontentversion2assignedtome.AssignToMeWebContentVersion2ActionsTest;
import com.liferay.portalweb.kaleo.webcontentdisplay.wcwebcontent.viewwebcontentversion2assignedtome.EditWebContentCompletedActionsTest;
import com.liferay.portalweb.portal.BaseTestSuite;
import com.liferay.portalweb.portal.controlpanel.users.user.signin.SignInTest;
import com.liferay.portalweb.portal.controlpanel.users.user.signin.SignOutTest;
import com.liferay.portalweb.portal.controlpanel.webcontent.wcwebcontent.addwcwebcontent.TearDownWCWebContentTest;
import com.liferay.portalweb.portal.util.TearDownPageTest;
import com.liferay.portalweb.portlet.webcontentdisplay.portlet.addportletwcd.AddPageWCDTest;
import com.liferay.portalweb.portlet.webcontentdisplay.portlet.addportletwcd.AddPortletWCDTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class ViewWebContentVersion2CompletedTests extends BaseTestSuite {
	public static Test suite() {
		TestSuite testSuite = new TestSuite();
		testSuite.addTestSuite(ConfigureWebContentSingleApproverTest.class);
		testSuite.addTestSuite(AddPageWCDTest.class);
		testSuite.addTestSuite(AddPortletWCDTest.class);
		testSuite.addTestSuite(AddWCWebContentWCDTest.class);
		testSuite.addTestSuite(AssignToMeWebContentActionsTest.class);
		testSuite.addTestSuite(ApproveWebContentActionsTest.class);
		testSuite.addTestSuite(EditWebContentCompletedActionsTest.class);
		testSuite.addTestSuite(AssignToMeWebContentVersion2ActionsTest.class);
		testSuite.addTestSuite(ApproveWebContentVersion2ActionsTest.class);
		testSuite.addTestSuite(ViewWebContentVersion2CompletedTest.class);
		testSuite.addTestSuite(SignOutTest.class);
		testSuite.addTestSuite(Guest_ViewWebContentVersion2CompletedTest.class);
		testSuite.addTestSuite(SignInTest.class);
		testSuite.addTestSuite(TearDownPageTest.class);
		testSuite.addTestSuite(TearDownWCWebContentTest.class);
		testSuite.addTestSuite(TearDownWorkflowConfigurationTest.class);

		return testSuite;
	}
}