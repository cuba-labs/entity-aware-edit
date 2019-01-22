package com.company.demo.web.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.demo.entity.Company;

@UiController("demo_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}