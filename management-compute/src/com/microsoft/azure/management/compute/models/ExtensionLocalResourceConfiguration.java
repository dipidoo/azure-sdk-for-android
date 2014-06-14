/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.compute.models;

/**
* Declared local resources used inside guest VM by the extension. Optional.
*/
public class ExtensionLocalResourceConfiguration {
    private String name;
    
    /**
    * Required. Required. Description of a local resource entry.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. Required. Description of a local resource entry.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private Integer sizeInMB;
    
    /**
    * Optional. Optional. Size (in MB) of the local resource entry.
    * @return The SizeInMB value.
    */
    public Integer getSizeInMB() {
        return this.sizeInMB;
    }
    
    /**
    * Optional. Optional. Size (in MB) of the local resource entry.
    * @param sizeInMBValue The SizeInMB value.
    */
    public void setSizeInMB(final Integer sizeInMBValue) {
        this.sizeInMB = sizeInMBValue;
    }
    
    /**
    * Initializes a new instance of the ExtensionLocalResourceConfiguration
    * class.
    *
    */
    public ExtensionLocalResourceConfiguration() {
    }
    
    /**
    * Initializes a new instance of the ExtensionLocalResourceConfiguration
    * class with required arguments.
    *
    */
    public ExtensionLocalResourceConfiguration(String name) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        this.setName(name);
    }
}
