package com.company.demo.web.individual;

import com.haulmont.cuba.gui.screen.*;
import com.company.demo.entity.Individual;

@UiController("demo_Individual.edit")
@UiDescriptor("individual-edit.xml")
@EditedEntityContainer("individualDc")
@LoadDataBeforeShow
public class IndividualEdit extends StandardEditor<Individual> {
}