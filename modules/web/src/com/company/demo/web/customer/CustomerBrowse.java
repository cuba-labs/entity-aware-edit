package com.company.demo.web.customer;

import com.company.demo.entity.Company;
import com.company.demo.entity.Individual;
import com.company.demo.web.company.CompanyEdit;
import com.company.demo.web.individual.IndividualEdit;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.demo.entity.Customer;

import javax.inject.Inject;

@UiController("demo_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
    @Inject
    protected ScreenBuilders screenBuilders;
    @Inject
    protected Table<Customer> customersTable;
    @Inject
    protected Dialogs dialogs;
    @Inject
    protected Metadata metadata;

    @Subscribe("customersTable.create")
    protected void onCustomersTableCreate(Action.ActionPerformedEvent event) {
        dialogs.createOptionDialog()
                .withCaption("Question")
                .withMessage("What kind of customer do you want to create?")
                .withActions(
                        new BaseAction("createCompany")
                                .withCaption("Company")
                                .withHandler(e ->
                                        createCustomer(CompanyEdit.class, Company.class)
                                ),
                        new BaseAction("createIndividual")
                                .withCaption("Individual")
                                .withHandler(e ->
                                        createCustomer(IndividualEdit.class, Individual.class)
                                ),
                        new DialogAction(DialogAction.Type.CANCEL)
                )
                .show();
    }

    @SuppressWarnings("unchecked")
    private <T extends Screen & EditorScreen> void createCustomer(Class<T> screenClass, Class entityClass) {
        screenBuilders.editor(customersTable)
                .withScreenClass(screenClass)
                .newEntity((Customer) metadata.create(entityClass))
                .build()
                .show();
    }
}