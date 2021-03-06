/*
 * Copyright 2017 Intershop Communications AG.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intershop.gradle.wsdl.extension.data

import org.gradle.api.Named

/**
 * Container for WSDL property configuration.
 *
 * @constructor default constructor with configuration name.
 */
class WSDLProperty (private val propname: String) : Named {

    /**
     * Default methode for named objects.
     *
     * @return property name of this configuration
     */
    override fun getName() : String {
        return propname
    }

    /**
     * Value of the configured property.
     */
    var value: String = ""

}
