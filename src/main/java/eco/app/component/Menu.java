/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package eco.app.component;

import eco.app.myswing.ScrollBarCustom;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import static eco.app.helper.SaveData.*;

/**
 *
 * @author Lenovo
 */
public class Menu extends javax.swing.JPanel {

    private List<MenuItem> menuItems = new ArrayList<>();

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();

        scrollPanel.getViewport().setOpaque(false);
        scrollPanel.setViewportBorder(null);

        pnContainerMenu.setLayout(new MigLayout("fillx, insets 0", "0[]0", "[]0[]"));
        init();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public MenuItem getMenuItem(int index) {
        return menuItems.get(index);
    }

    private void init() {

        scrollPanel.setVerticalScrollBar(new ScrollBarCustom());
        authorization();

    }

    // Authorization for menu item
    public void authorization() {

        for (MenuItem item : menuItems) {
            if (item.isOnlyAdmin()) {
                item.setEnabled(false);
            }
        }

    }

    public void addMenuItem(MenuItem item) {

        menuItems.add(item);
        pnContainerMenu.add(item, "wrap");

    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g.create();

        // Paint Background;
        GradientPaint gp = new GradientPaint(0, 0, BG_MENU_L, getWidth(), 0, BG_MENU_R);
        g2.setPaint(gp);
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.dispose();

        super.paint(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();
        pnContainerMenu = new javax.swing.JPanel();
        profile1 = new eco.app.component.Profile();

        setForeground(new java.awt.Color(102, 255, 102));
        setOpaque(false);

        scrollPanel.setBackground(new java.awt.Color(204, 204, 255));
        scrollPanel.setBorder(null);
        scrollPanel.setOpaque(false);

        pnContainerMenu.setOpaque(false);

        javax.swing.GroupLayout pnContainerMenuLayout = new javax.swing.GroupLayout(pnContainerMenu);
        pnContainerMenu.setLayout(pnContainerMenuLayout);
        pnContainerMenuLayout.setHorizontalGroup(
                pnContainerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 206, Short.MAX_VALUE));
        pnContainerMenuLayout.setVerticalGroup(
                pnContainerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 232, Short.MAX_VALUE));

        scrollPanel.setViewportView(pnContainerMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(scrollPanel, javax.swing.GroupLayout.Alignment.TRAILING));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPanel)
                                .addContainerGap()));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnContainerMenu;
    private eco.app.component.Profile profile1;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables

}