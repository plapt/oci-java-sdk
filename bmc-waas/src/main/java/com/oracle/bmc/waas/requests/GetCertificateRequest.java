/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class GetCertificateRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the SSL certificate used in the WAAS policy. This number is generated when the certificate is added to the policy.
     */
    private String certificateId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetCertificateRequest o) {
            certificateId(o.getCertificateId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of GetCertificateRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetCertificateRequest
         */
        public GetCertificateRequest build() {
            GetCertificateRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
