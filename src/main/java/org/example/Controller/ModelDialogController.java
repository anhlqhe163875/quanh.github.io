package org.example.Controller;

import org.example.Model.ColumnParsedData;
import org.example.Model.Food;
import org.zkoss.chart.Charts;
import org.zkoss.chart.model.CategoryModel;
import org.zkoss.chart.model.DefaultCategoryModel;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Window;

import java.util.List;

public class ModelDialogController extends SelectorComposer<Component> {
    @Wire
    Window modelDialog;

    @Wire
    Charts chart;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        chart.getYAxis().setAllowDecimals(false);
        chart.getYAxis().getTitle().setText("Units");

        CategoryModel catemodel = new DefaultCategoryModel();
        for (Food food : ColumnParsedData.getFoods()) {
            List<Integer> units = food.getUnits();
            for (int i = 0; i < units.size(); ++i) {
                catemodel.setValue(getPeople().get(i), food.getName(), units.get(i));
            }
        }
        chart.setModel(catemodel);
    }
    public ListModel<Food> getFoods() {
        return new ListModelList<Food>(ColumnParsedData.getFoods(), true);
    }

    public List<String> getPeople() {
        return ColumnParsedData.getPeople();
    }

    @Listen("onClick = #closeBtn")
    public void showModal(Event event){
        modelDialog.detach();
    }
}
