/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author ThunderKnight
 */
public class MainScreen extends javax.swing.JFrame {

    private DefaultMutableTreeNode selectedNode;
    
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        publicPlanetsTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        discoveredPlanetsTree = new javax.swing.JTree();
        jSeparator1 = new javax.swing.JSeparator();
        planet1Name = new javax.swing.JTextField();
        planet2Name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        scientistsComboBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Public Planets");
        publicPlanetsTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(publicPlanetsTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Public", jPanel1);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Discovered");
        discoveredPlanetsTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(discoveredPlanetsTree);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Discovered ", jPanel2);

        planet1Name.setEditable(false);
        planet1Name.setText("Planet 1");
        planet1Name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        planet2Name.setEditable(false);
        planet2Name.setText("Planet 2");
        planet2Name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Collision");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        scientistsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        scientistsComboBox.setBorder(null);
        scientistsComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                scientistsComboBoxItemStateChanged(evt);
            }
        });

        jLabel1.setText("Scientists");

        jLabel2.setText("Name:");

        nameInput.setBorder(null);

        jButton2.setText("Add Scientist");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Add Scientists");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Planets");

        jButton3.setText("Exit");
        jButton3.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(planet2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(planet1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(scientistsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(nameInput)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel1))
                                .addGap(0, 158, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(planet1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(planet2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(scientistsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Database Database = Main.getDatabase();
        String name = nameInput.getText();
        Scientist newScientist = new Scientist(name);
        Database.addScientist(newScientist);
        renderScientists();
        JOptionPane.showMessageDialog(this,"Scientist added");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void scientistsComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_scientistsComboBoxItemStateChanged
        try {
            Database Database = Main.getDatabase();
            String name = scientistsComboBox.getSelectedItem().toString();
            if(Database.getScientistByName(name) != null){
                Scientist scientist = Database.getScientistByName(name);
                renderScientistPlanets(scientist);
            }
        } catch(NullPointerException e){
            
        }
    }//GEN-LAST:event_scientistsComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Database Database = Main.getDatabase();
        String name1 = planet1Name.getText();
        String name2 = planet2Name.getText();
        
        String name3 = scientistsComboBox.getSelectedItem().toString();
        
        if( Database.getPlanetByName(name1) != null && Database.getPlanetByName(name2) != null ){
            
            Planet planet1 = Database.getPlanetByName(name1);
            Planet planet2 = Database.getPlanetByName(name2);
            
            if(!planet1.getName().equals( planet2.getName() )){
                Planet resultantPlanet = planet1.collision(planet2);                
                if(resultantPlanet != null){
                    
                    jProgressBar1.setValue(  );
                    
                    if(Database.getScientistByName(name3) != null){
                        Scientist selectedscientist = Database.getScientistByName(name3);
                        selectedscientist.addPlanet(resultantPlanet);
                        Database.saveScientists();
                        Database.loadScientists();
                        DefaultTreeModel model = (DefaultTreeModel) discoveredPlanetsTree.getModel();
                        model.reload();

                        JOptionPane.showMessageDialog(this, "Created " + resultantPlanet.getName() + " planet and added to " + selectedscientist.getName() + " scientist");
                    }else{
                        JOptionPane.showMessageDialog(this, "You must select a scientist");
                    }   
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Planet not generated in this collision");
                }
            }else{
                JOptionPane.showMessageDialog(this, "The two planets must be different");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "You must select two planets");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    public int getDistance(Planet planet1, Planet planet2){
        
    }
    
    public void renderScientists(){
        Database Database = Main.getDatabase();
        ArrayList<Scientist> scientists = Database.getScientistsList();
        
        if(scientists.size() > 0){
            scientistsComboBox.removeAllItems();
            for (Scientist scientist : scientists) {
                scientistsComboBox.addItem(scientist.getName());
            }
        }
    }
    
    public void renderPublicPlanets(){
        DefaultMutableTreeNode publicPlanetsRoot =  (DefaultMutableTreeNode) publicPlanetsTree.getModel().getRoot();
        publicPlanetsRoot.removeAllChildren();
        Database Database = Main.getDatabase();
        ArrayList<Planet> publicPlanets = Database.getPublicPlanets();
        for (Planet publicPlanet : publicPlanets) {
            DefaultMutableTreeNode newPlanet = new  DefaultMutableTreeNode(publicPlanet.getName());
            publicPlanetsRoot.add(newPlanet);
        }
    }
    
    public void renderScientistPlanets(Scientist scientist){
        DefaultTreeModel model = (DefaultTreeModel) discoveredPlanetsTree.getModel();
        DefaultMutableTreeNode discoveredPlanetsRoot =  (DefaultMutableTreeNode) model.getRoot();
        discoveredPlanetsRoot.removeAllChildren();
        
        ArrayList<Planet> discoveredPlanets = scientist.getDiscoveredPlanets();
        
        for (Planet discoveredPlanet : discoveredPlanets) {
            DefaultMutableTreeNode newPlanet = new  DefaultMutableTreeNode(discoveredPlanet.getName());
            discoveredPlanetsRoot.add(newPlanet);
        }
        model.reload();
    }
    
    public JPopupMenu getPopUpMenu() {
        JPopupMenu menu = new JPopupMenu();
        JMenuItem item = new JMenuItem("Add Planet 1");
        item.addActionListener(addPlanet1());
        menu.add(item);

        JMenuItem item2 = new JMenuItem("Add Planet 2");
        item2.addActionListener(addPlanet2());
        menu.add(item2);
        
        return menu;
    }
    
    public ActionListener addPlanet1() {
        Database Database = Main.getDatabase();
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(selectedNode != null){
                    String name = selectedNode.toString();
                    if( Database.getPlanetByName(name) != null ){
                        planet1Name.setText(name);
                    }
                }
            }
        };
    }
    
    public ActionListener addPlanet2() {
        Database Database = Main.getDatabase(); 
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                    if(selectedNode != null){
                    String name = selectedNode.toString();
                    if( Database.getPlanetByName(name) != null ){
                        planet2Name.setText(name);
                    }
                }
            }
        };
    }
    
    public MouseListener addMouseListenerTree1() {
        return new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent arg0) {
                if(arg0.getButton() == MouseEvent.BUTTON3){
                    TreePath pathForLocation = publicPlanetsTree.getPathForLocation(arg0.getPoint().x, arg0.getPoint().y);
                    if(pathForLocation != null){
                        selectedNode = (DefaultMutableTreeNode) pathForLocation.getLastPathComponent();
                    } else{
                        selectedNode = null;
                    }

                }
                super.mousePressed(arg0);
            }
        };
    }
    
    public MouseListener AddMouseListenerTree2() {
        return new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent arg0) {
                if(arg0.getButton() == MouseEvent.BUTTON3){
                    TreePath pathForLocation = discoveredPlanetsTree.getPathForLocation(arg0.getPoint().x, arg0.getPoint().y);
                    if(pathForLocation != null){
                        selectedNode = (DefaultMutableTreeNode) pathForLocation.getLastPathComponent();
                    } else{
                        selectedNode = null;
                    }
                }
                super.mousePressed(arg0);
            }
        };
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    public JTree getDiscoveredPlanetsTree() {
        return discoveredPlanetsTree;
    }

    public void setDiscoveredPlanetsTree(JTree discoveredPlanetsTree) {
        this.discoveredPlanetsTree = discoveredPlanetsTree;
    }

    public JTree getPublicPlanetsTree() {
        return publicPlanetsTree;
    }

    public void setPublicPlanetsTree(JTree publicPlanetsTree) {
        this.publicPlanetsTree = publicPlanetsTree;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree discoveredPlanetsTree;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextField planet1Name;
    private javax.swing.JTextField planet2Name;
    private javax.swing.JTree publicPlanetsTree;
    private javax.swing.JComboBox<String> scientistsComboBox;
    // End of variables declaration//GEN-END:variables
}
