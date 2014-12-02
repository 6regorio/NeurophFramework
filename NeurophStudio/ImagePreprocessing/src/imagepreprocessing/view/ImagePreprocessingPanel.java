package imagepreprocessing.view;

import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import org.neuroph.imgrec.filter.ImageFilter;
import org.neuroph.imgrec.filter.ImageFilterChain;
import org.neuroph.imgrec.filter.impl.AdaptiveThresholdBinarizeFilter;
import org.neuroph.imgrec.filter.impl.DCTgrayscale;
import org.neuroph.imgrec.filter.impl.DenoiseDCTFilter;
import org.neuroph.imgrec.filter.impl.Dilation;
import org.neuroph.imgrec.filter.impl.EdgeDetection;
import org.neuroph.imgrec.filter.impl.EraseBlackBorderFilter;
import org.neuroph.imgrec.filter.impl.GaussianBluring;
import org.neuroph.imgrec.filter.impl.GaussianNoise;
import org.neuroph.imgrec.filter.impl.GrayscaleFilter;
import org.neuroph.imgrec.filter.impl.HistogramEqualizationFilter;
import org.neuroph.imgrec.filter.impl.MaskSegmentationFilter;
import org.neuroph.imgrec.filter.impl.MeanFilter;
import org.neuroph.imgrec.filter.impl.MedianFilter;
import org.neuroph.imgrec.filter.impl.OtsuBinarizeFilter;
import org.neuroph.imgrec.filter.impl.SobelEdgeDetection;
import org.neuroph.imgrec.filter.impl.UnsharpMaskingFilter;

/**
 * Panel for creating filter chain
 *
 * @author Sanja
 */
public class ImagePreprocessingPanel extends javax.swing.JPanel {

    //models fo jList
    DefaultListModel allFiltersLM;
    DefaultListModel selectedFiltersLM;

    public DefaultListModel getSelectedFiltersLM() {
        return selectedFiltersLM;
    }
    HashMap<String, JPanel> parametersPanels;

    /**
     * Creates new form ImagePreprocessingPanel
     */
    public ImagePreprocessingPanel() {
        parametersPanels = new HashMap<>();
        initComponents();
        setLists();
        hideParameterPanels();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        filtersList = new javax.swing.JList();
        rightButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedFiltersList = new javax.swing.JList();
        leftButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(filtersList);

        rightButton.setText(">>");
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        selectedFiltersList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedFiltersListMouseClicked(evt);
            }
        });
        selectedFiltersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selectedFiltersListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(selectedFiltersList);

        leftButton.setText("<<");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Choose filters");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Filters:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Selected filters:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rightButton)
                            .addComponent(leftButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(rightButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(leftButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Move filter from all filters to selected filters
     *
     * @param evt
     */
    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        List<ImageFilter> selected = filtersList.getSelectedValuesList();
        for (ImageFilter imageFilter : selected) {
//            allFiltersLM.removeElement(imageFilter);
            selectedFiltersLM.addElement(imageFilter);
        }

    }//GEN-LAST:event_rightButtonActionPerformed
    /**
     * Move filter from selected filters to all filters
     *
     * @param evt
     */
    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        List<ImageFilter> selected = selectedFiltersList.getSelectedValuesList();
        for (ImageFilter imageFilter : selected) {
//            allFiltersLM.addElement(imageFilter);
            selectedFiltersLM.removeElement(imageFilter);
        }
    }//GEN-LAST:event_leftButtonActionPerformed

    private void selectedFiltersListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedFiltersListMouseClicked

    }//GEN-LAST:event_selectedFiltersListMouseClicked

    private void selectedFiltersListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selectedFiltersListValueChanged
//        ImageFilter selected = (ImageFilter) selectedFiltersList.getSelectedValue();
//        hideParameterPanels();
//        try {
//            if (selected != null) {
//                JPanel panel = getPanel(selected);
//                panel.setVisible(true);
//
//            }
//
//        } catch (Exception e) {
//        }


    }//GEN-LAST:event_selectedFiltersListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList filtersList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton leftButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JList selectedFiltersList;
    // End of variables declaration//GEN-END:variables

    /**
     * Set models and add all filters to allFiltersLM
     */
    private void setLists() {

        selectedFiltersLM = new DefaultListModel();
        selectedFiltersList.setModel(selectedFiltersLM);

        allFiltersLM = new DefaultListModel();
        addAllFilters();
        addAllParametersPanels();
        filtersList.setModel(allFiltersLM);

    }

    private void addAllFilters() {
        allFiltersLM.addElement(new AdaptiveThresholdBinarizeFilter());
        allFiltersLM.addElement(new EraseBlackBorderFilter());
        allFiltersLM.addElement(new GrayscaleFilter());
        allFiltersLM.addElement(new HistogramEqualizationFilter());
        allFiltersLM.addElement(new MaskSegmentationFilter());
        allFiltersLM.addElement(new MedianFilter());
        allFiltersLM.addElement(new OtsuBinarizeFilter());
        allFiltersLM.addElement(new EdgeDetection());
        allFiltersLM.addElement(new DCTgrayscale());
        allFiltersLM.addElement(new DenoiseDCTFilter());
        allFiltersLM.addElement(new GaussianBluring());
        allFiltersLM.addElement(new GaussianNoise());
        allFiltersLM.addElement(new MeanFilter());
        allFiltersLM.addElement(new UnsharpMaskingFilter());
        allFiltersLM.addElement(new Dilation());
        allFiltersLM.addElement(new SobelEdgeDetection());
    }

    private void addAllParametersPanels() {
        // these should be dialogs not panels
      //  parametersPanels.put(MedianFilter.class.getName() , new MedianPanel());
       // parametersPanels.put(AdaptiveThresholdBinarizeFilter.class.getName() , new AdaptiveTresholdBinarizePanel());

    }

    /**
     * Creates filter chain
     *
     * @return ImageFilterChain
     */
    public ImageFilterChain getImageFilterChain() {
        ImageFilterChain chain = new ImageFilterChain();
        for (Object imageFilter : selectedFiltersLM.toArray()) {
            chain.addFilter((ImageFilter) imageFilter);
        }
        return chain;
    }
    /**
     * Adds filters from given imageFilterCain to list of selectedFilters
     * @param ifc 
     */
    public void addFilters(ImageFilterChain ifc){
        selectedFiltersLM.clear();
        for (ImageFilter imageFilter : ifc.getFilters()) {
            selectedFiltersLM.addElement(imageFilter);
        }
    }


    private void hideParameterPanels() {
        for (JPanel jPanel : parametersPanels.values()) {
            jPanel.setVisible(false);
        }
    }

    private JPanel getPanel(ImageFilter imageFilter) {
//        for (JPanel jPanel : parametersPanels) {
//            if (jPanel.getClass().equals(panel.getClass())) {
//                return jPanel;
//            }
//        }
        for (String key : parametersPanels.keySet()) {
            if (key.equalsIgnoreCase(imageFilter.getClass().getName()))
                return parametersPanels.get(key);
        }        
        
        return null;
    }



}