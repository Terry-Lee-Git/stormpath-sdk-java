/*
 * Copyright 2016 Stormpath, Inc.
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
package com.stormpath.sdk.impl.provider.saml;

import com.stormpath.sdk.impl.ds.InternalDataStore;
import com.stormpath.sdk.impl.provider.AbstractProvider;
import com.stormpath.sdk.impl.provider.IdentityProviderType;
import com.stormpath.sdk.impl.resource.Property;
import com.stormpath.sdk.provider.saml.StormpathProvider;

import java.util.Map;

/**
 * This DefaultProvider represents Stormpath as a Provider. For example, the provider of a Stormpath-owned directory is
 * "stormpath".
 *
 * @since 1.2.2
 */
public class DefaultStormpathProvider extends AbstractProvider implements StormpathProvider {

    private static final Map<String, Property> PROPERTY_DESCRIPTORS = createPropertyDescriptorMap(PROVIDER_ID, CREATED_AT, MODIFIED_AT);

    public DefaultStormpathProvider(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultStormpathProvider(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return PROPERTY_DESCRIPTORS;
    }

    @Override
    protected String getConcreteProviderId() {
        return IdentityProviderType.STORMPATH.getNameKey();
    }
}
