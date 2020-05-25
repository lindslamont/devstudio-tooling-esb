package org.wso2.developerstudio.eclipse.gmf.esb.presentation.desc.parser;

import java.util.ArrayList;

public class AttributeValue extends Value {

    String name;
    String displayName;
    AttributeValueType type;
    String defaultValue;
    boolean required;
    String helpTip;
    Connection allowedConnectionTypes;
    String validation;
    String defaultType; //????
    //String default; ????
    ArrayList<EnableCondition> enableCondition;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AttributeValueType getType() {
        return type;
    }

    public void setType(AttributeValueType type) {
        this.type = type;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getHelpTip() {
        return helpTip;
    }

    public void setHelpTip(String helpTip) {
        this.helpTip = helpTip;
    }
    
    public Connection getAllowedConnectionTypes() {
        return allowedConnectionTypes;
    }

    public void setAllowedConnectionTypes(Connection allowedConnectionTypes) {
        this.allowedConnectionTypes = allowedConnectionTypes;
    }

}
