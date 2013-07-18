/*
 * Copyright 2013 Stormpath, Inc. and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.impl.account

import com.stormpath.sdk.impl.ds.InternalDataStore
import org.testng.annotations.Test

import static org.easymock.EasyMock.createStrictMock
import static org.testng.Assert.assertEquals
import static org.testng.Assert.assertTrue

/**
 * @author ecrisostomo
 * @since 0.8
 */
class DefaultEmailVerificationTokenTest {

    @Test
    void testAll() {

        def internalDataStore = createStrictMock(InternalDataStore)

        def resourceWithDS = new DefaultEmailVerificationToken(internalDataStore)
        def resourceWithProps = new DefaultEmailVerificationToken(internalDataStore, [href: "https://api.stormpath.com/v1/accounts/emailVerificationTokens/efwer23823ujweouidfj"])

        assertTrue(resourceWithDS instanceof DefaultEmailVerificationToken && resourceWithProps instanceof DefaultEmailVerificationToken)
        assertEquals(resourceWithProps.getPropertyDescriptors().size(), 0)

    }
}
