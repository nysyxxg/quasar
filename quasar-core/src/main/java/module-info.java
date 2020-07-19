/*
 * Quasar: lightweight threads and actors for the JVM.
 * Copyright (c) 2018, Parallel Universe Software Co. All rights reserved.
 * 
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *  
 *   or (per the licensee's choosing)
 *  
 * under the terms of the GNU Lesser General Public License version 3.0
 * as published by the Free Software Foundation.
 */
module co.paralleluniverse.quasar.core {
//    requires java.management;
//    requires java.instrument;
//    requires jdk.unsupported; // needed for ThreadAccess and ExtendedStackTraceHotSpot

    requires org.objectweb.asm;
    requires org.objectweb.asm.util;
    requires org.objectweb.asm.commons;
    requires com.google.common;
    requires static kryo;
    requires rt; // automatic module
    
    exports co.paralleluniverse.fibers;
    exports co.paralleluniverse.fibers.futures;
    exports co.paralleluniverse.fibers.io;
    exports co.paralleluniverse.fibers.instrument;
    exports co.paralleluniverse.remote;
    exports co.paralleluniverse.strands;
    exports co.paralleluniverse.strands.channels;
    exports co.paralleluniverse.strands.channels.transfer;
    exports co.paralleluniverse.strands.concurrent;
    exports co.paralleluniverse.strands.dataflow;
    
    exports co.paralleluniverse.common.util       to co.paralleluniverse.quasar.actors;
    exports co.paralleluniverse.common.monitoring to co.paralleluniverse.quasar.actors;
    exports co.paralleluniverse.common.reflection to co.paralleluniverse.quasar.actors;
    exports co.paralleluniverse.common.test       to co.paralleluniverse.quasar.actors;
    exports co.paralleluniverse.concurrent.util   to co.paralleluniverse.quasar.actors;
    exports co.paralleluniverse.io.serialization  to co.paralleluniverse.quasar.actors;
    exports co.paralleluniverse.strands.queues    to co.paralleluniverse.quasar.actors;
    
    uses co.paralleluniverse.fibers.instrument.SuspendableClassifier;
}
