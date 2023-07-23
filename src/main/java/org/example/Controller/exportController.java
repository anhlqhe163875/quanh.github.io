package org.example.Controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Window;

public class exportController extends SelectorComposer<Component> {

    @Listen("onClick =#btnexprot")
    public void showModal(Event e){
        Window window =(Window) Executions.createComponents("/exp-raw/component/dialogExport.zul",null,null);
        window.doModal();
    }
}
