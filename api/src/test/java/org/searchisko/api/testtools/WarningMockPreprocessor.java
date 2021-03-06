/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 */
package org.searchisko.api.testtools;

import java.util.Map;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.SettingsException;
import org.jboss.elasticsearch.tools.content.PreprocessChainContext;
import org.jboss.elasticsearch.tools.content.StructuredContentPreprocessorBase;

/**
 * Mock preprocessor which generates warning if data are null.
 * 
 * @author Vlastimil Elias (velias at redhat dot com)
 */
public class WarningMockPreprocessor extends StructuredContentPreprocessorBase {

	public boolean warnAlways = false;

	public boolean addValue = false;

	public Client getClient() {
		return client;
	}

	@Override
	public Map<String, Object> preprocessData(Map<String, Object> data, PreprocessChainContext chainContext) {
		if (addValue) {
			data.put("key", "value");
		}
		if (data == null || warnAlways)
			addDataWarning(chainContext, "warning message because null data");
		return data;
	}

	@Override
	public void init(Map<String, Object> settings) throws SettingsException {
	}

}
