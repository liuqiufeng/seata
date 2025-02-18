/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.seata.mockserver.processor;

import io.netty.channel.ChannelHandlerContext;
import org.apache.seata.core.protocol.RpcMessage;
import org.apache.seata.core.rpc.RemotingServer;
import org.apache.seata.core.rpc.TransactionMessageHandler;
import org.apache.seata.core.rpc.processor.RemotingProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Mock Remoting Processor
 **/
public class MockRemotingProcessor implements RemotingProcessor {

    protected static final Logger LOGGER = LoggerFactory.getLogger(MockRemotingProcessor.class);
    protected RemotingServer remotingServer;
    protected final TransactionMessageHandler handler;


    public MockRemotingProcessor(RemotingServer remotingServer, TransactionMessageHandler handler) {
        this.remotingServer = remotingServer;
        this.handler = handler;
    }

    @Override
    public void process(ChannelHandlerContext ctx, RpcMessage rpcMessage) throws Exception {
        Object message = rpcMessage.getBody();
        LOGGER.info("process message : " + message);
    }


}
