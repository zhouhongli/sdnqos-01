/*
 * Copyright © 2018 yes and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.sdnqos.cli.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.opendaylight.sdnqos.cli.api.QoSCliCommands;

public class QoSCliCommandsImpl implements QoSCliCommands {

    private static final Logger LOG = LoggerFactory.getLogger(QoSCliCommandsImpl.class);
    private final DataBroker dataBroker;

    public QoSCliCommandsImpl(final DataBroker db) {
        this.dataBroker = db;
        LOG.info("QoSCliCommandImpl initialized");
    }

    @Override
    public Object testCommand(Object testArgument) {
        return "This is a test implementation of test-command";
    }
}