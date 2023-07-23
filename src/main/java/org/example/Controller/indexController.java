package org.example.Controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Window;

public class indexController extends SelectorComposer<Component> {
    private static final long serialVersionUID =1L;
    @Listen("onClick =#orderBtn")
    public void showModal(Event e){
        Window window =(Window)Executions.createComponents("/window/dialog.zul",null,null);
        window.doModal();
    }
}
