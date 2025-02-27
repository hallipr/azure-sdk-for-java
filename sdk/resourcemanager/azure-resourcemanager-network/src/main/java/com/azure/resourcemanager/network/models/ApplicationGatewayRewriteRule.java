// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Rewrite rule of an application gateway. */
@Fluent
public final class ApplicationGatewayRewriteRule {
    /*
     * Name of the rewrite rule that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Rule Sequence of the rewrite rule that determines the order of execution
     * of a particular rule in a RewriteRuleSet.
     */
    @JsonProperty(value = "ruleSequence")
    private Integer ruleSequence;

    /*
     * Conditions based on which the action set execution will be evaluated.
     */
    @JsonProperty(value = "conditions")
    private List<ApplicationGatewayRewriteRuleCondition> conditions;

    /*
     * Set of actions to be done as part of the rewrite Rule.
     */
    @JsonProperty(value = "actionSet")
    private ApplicationGatewayRewriteRuleActionSet actionSet;

    /**
     * Get the name property: Name of the rewrite rule that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the rewrite rule that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayRewriteRule object itself.
     */
    public ApplicationGatewayRewriteRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ruleSequence property: Rule Sequence of the rewrite rule that determines the order of execution of a
     * particular rule in a RewriteRuleSet.
     *
     * @return the ruleSequence value.
     */
    public Integer ruleSequence() {
        return this.ruleSequence;
    }

    /**
     * Set the ruleSequence property: Rule Sequence of the rewrite rule that determines the order of execution of a
     * particular rule in a RewriteRuleSet.
     *
     * @param ruleSequence the ruleSequence value to set.
     * @return the ApplicationGatewayRewriteRule object itself.
     */
    public ApplicationGatewayRewriteRule withRuleSequence(Integer ruleSequence) {
        this.ruleSequence = ruleSequence;
        return this;
    }

    /**
     * Get the conditions property: Conditions based on which the action set execution will be evaluated.
     *
     * @return the conditions value.
     */
    public List<ApplicationGatewayRewriteRuleCondition> conditions() {
        return this.conditions;
    }

    /**
     * Set the conditions property: Conditions based on which the action set execution will be evaluated.
     *
     * @param conditions the conditions value to set.
     * @return the ApplicationGatewayRewriteRule object itself.
     */
    public ApplicationGatewayRewriteRule withConditions(List<ApplicationGatewayRewriteRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get the actionSet property: Set of actions to be done as part of the rewrite Rule.
     *
     * @return the actionSet value.
     */
    public ApplicationGatewayRewriteRuleActionSet actionSet() {
        return this.actionSet;
    }

    /**
     * Set the actionSet property: Set of actions to be done as part of the rewrite Rule.
     *
     * @param actionSet the actionSet value to set.
     * @return the ApplicationGatewayRewriteRule object itself.
     */
    public ApplicationGatewayRewriteRule withActionSet(ApplicationGatewayRewriteRuleActionSet actionSet) {
        this.actionSet = actionSet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (conditions() != null) {
            conditions().forEach(e -> e.validate());
        }
        if (actionSet() != null) {
            actionSet().validate();
        }
    }
}
