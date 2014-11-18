/*
 * Copyright 2005-2014 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.apache.activemq.tests.unit.jms.referenceable;

import org.junit.Test;

import org.apache.activemq.tests.util.UnitTestCase;

/**
 * @author <a href="mailto:jmesnil@redhat.com">Jeff Mesnil</a>
 *
 *
 */
public class ConnectionFactoryObjectFactoryTest extends UnitTestCase
{
   // Constants -----------------------------------------------------

   // Attributes ----------------------------------------------------

   // Static --------------------------------------------------------

   // Constructors --------------------------------------------------

   // Public --------------------------------------------------------

   @Test
   public void testDummy()
   {
   }

   // public void testReference() throws Exception
   // {
   // ActiveMQRAConnectionFactory cf =
   // new ActiveMQRAConnectionFactory(null, null, 123, 123, randomString(), 1, 1, 1, 1, 1, true, true, true);
   // Reference reference = cf.getReference();
   //
   // ConnectionFactoryObjectFactory factory = new ConnectionFactoryObjectFactory();
   //
   // Object object = factory.getObjectInstance(reference, null, null, null);
   // assertNotNull(object);
   // assertTrue(object instanceof ActiveMQRAConnectionFactory);
   // }

   // Package protected ---------------------------------------------

   // Protected -----------------------------------------------------

   // Private -------------------------------------------------------

   // Inner classes -------------------------------------------------
}