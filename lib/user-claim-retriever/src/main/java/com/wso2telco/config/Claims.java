/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Claims.
 */
@XmlRootElement(name="Claims")
@XmlAccessorType(XmlAccessType.FIELD)
public class Claims {

    /** The claim values. */
    @XmlElement(name = "ClaimValue")
    private List<String> claimValues;


    /**
     * Gets the claim values.
     *
     * @return the claim values
     */
    public List<String> getClaimValues() {
        return claimValues;
    }

    /**
     * Sets the claim values.
     *
     * @param claimValues the new claim values
     */
    public void setClaimValues(List<String> claimValues) {
        this.claimValues = claimValues;
    }
}
