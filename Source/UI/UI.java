package UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class UI extends javax.swing.JFrame {

    public UI() {
        initComponents();
        File iconFile = new File("icon.png");
        if(iconFile.exists()){
            iconImage = kit.createImage("icon.png");
            setIconImage(iconImage);
        }else{
            try{
                URL icon  = new URL("https://dl.dropboxusercontent.com/u/83568390/icon.png");
                iconImage = kit.createImage(icon);
                setIconImage(iconImage);
            }catch(MalformedURLException es){}
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genius Computer");
        setMinimumSize(new java.awt.Dimension(250, 320));
        setResizable(false);

        jButton1.setText(translator.getString("exitButton"));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Español", "Français"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton3.setText(translator.getString("creditsButton"));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(translator.getString("reviewButton"));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(translator.getString("changelogButton"));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(translator.getString("playButton"));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("V3.15.5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("English")){
            language = new Locale("en","EN");
            translator = ResourceBundle.getBundle("MessagesBundle",language);
            jButton1.setText(translator.getString("exitButton"));
            jButton3.setText(translator.getString("creditsButton"));
            jButton4.setText(translator.getString("reviewButton"));
            jButton5.setText(translator.getString("changelogButton"));
            jButton6.setText(translator.getString("playButton"));
        }else if (jComboBox1.getSelectedItem().equals("Español")){
            language = new Locale("es","ES");
            translator = ResourceBundle.getBundle("MessagesBundle",language);
            jButton1.setText(translator.getString("exitButton"));
            jButton3.setText(translator.getString("creditsButton"));
            jButton4.setText(translator.getString("reviewButton"));
            jButton5.setText(translator.getString("changelogButton"));
            jButton6.setText(translator.getString("playButton"));
        }else if (jComboBox1.getSelectedItem().equals("Français")){
            language = new Locale("fr","FR");
            translator = ResourceBundle.getBundle("MessagesBundle",language);
            jButton1.setText(translator.getString("exitButton"));
            jButton3.setText(translator.getString("creditsButton"));
            jButton4.setText(translator.getString("reviewButton"));
            jButton5.setText(translator.getString("changelogButton"));
            jButton6.setText(translator.getString("playButton"));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       JOptionPane.showMessageDialog(null, translator.getString("credits"),translator.getString("creditsButton"), JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        createGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFrame reviewFrame = new JFrame (translator.getString("reviewButton"));
                reviewFrame.setPreferredSize(new Dimension(500,200));
                reviewFrame.setDefaultCloseOperation (WindowConstants.DO_NOTHING_ON_CLOSE);
                createReviewMenu(reviewFrame);
                reviewFrame.pack();
                reviewFrame.setVisible (true);
                reviewFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(null, translator.getString("changelog"), translator.getString("changelogButton") , JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    private void createReviewMenu(JFrame reviewFrame){
        JRadioButton one = new JRadioButton("1");
        JRadioButton two = new JRadioButton("2");
        JRadioButton three = new JRadioButton("3");
        JRadioButton four = new JRadioButton("4");
        JRadioButton five = new JRadioButton("5");
        JRadioButton six = new JRadioButton("6");
        JRadioButton seven = new JRadioButton("7");
        JRadioButton eight = new JRadioButton("8");
        JRadioButton nine = new JRadioButton("9");
        JRadioButton ten = new JRadioButton("10");
        ButtonGroup points = new ButtonGroup();
        points.add(one);
        points.add(two);
        points.add(three);
        points.add(four);
        points.add(five);
        points.add(six);
        points.add(seven);
        points.add(eight);
        points.add(nine);
        points.add(ten);
        JPanel pointsPanel = new JPanel();
        pointsPanel.add(one);
        pointsPanel.add(two);
        pointsPanel.add(three);
        pointsPanel.add(four);
        pointsPanel.add(five);
        pointsPanel.add(six);
        pointsPanel.add(seven);
        pointsPanel.add(eight);
        pointsPanel.add(nine);
        pointsPanel.add(ten);
        reviewFrame.setIconImage(iconImage);
        reviewFrame.setResizable(false);
        reviewFrame.setLayout(new GridLayout(4,1));
        JButton exitButton = new JButton(translator.getString("done"));
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("reviews.ser",true);
                    if(getSelectedButton(points).equals("1")){
                        writer.write(1 + " ");   
                    }else if(getSelectedButton(points).equals("2")){
                        writer.write(2 + " ");
                    }else if(getSelectedButton(points).equals("3")){
                        writer.write(3 + " ");
                    }else if(getSelectedButton(points).equals("4")){
                        writer.write(4 + " ");
                    }else if(getSelectedButton(points).equals("5")){
                        writer.write(5 + " ");
                    }else if(getSelectedButton(points).equals("6")){
                        writer.write(6 + " ");
                    }else if(getSelectedButton(points).equals("7")){
                        writer.write(7 + " ");
                    }else  if(getSelectedButton(points).equals("8")){
                        writer.write(8 + " ");
                    }else if(getSelectedButton(points).equals("9")){
                        writer.write(9 + " ");
                    }else if(getSelectedButton(points).equals("10")){
                        writer.write(10 + " ");
                    }
                    writer.close();
                } catch (IOException | NullPointerException ex) {
                    ex.getStackTrace();
                }
                reviewFrame.dispose();
            }
        });
        reviewFrame.getContentPane().add(new JLabel(translator.getString("review")));
        reviewFrame.getContentPane().add(pointsPanel);
        reviewFrame.getContentPane().add(new JLabel(currentStatus()));
        reviewFrame.getContentPane().add(exitButton);
    }
    
        String getSelectedButton(ButtonGroup buttonGroup1){  
        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
    public String currentStatus() {
        reviewsMade.clear();
        try{
            File AXE = new File("reviews.ser");
            Scanner fileReader = new Scanner(AXE);
            while(fileReader.hasNext()){
                reviewsMade.add(fileReader.nextInt());
            }                
            fileReader.close();
        }catch(FileNotFoundException e){
             e.getStackTrace();
        }
        if(reviewsMade.isEmpty()){
            return translator.getString("current1") + 0 + translator.getString("current2") + "0  " + translator.getString("current3");
        }
        int total=0;
        for(int base : reviewsMade){
            total+=base;
        }
        double average=((double)total/reviewsMade.size());
        return translator.getString("current1") + round(average) + translator.getString("current2") + reviewsMade.size() + " " + translator.getString("current3");
    }
    
    public static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    private void createGame(){
        this.getContentPane().removeAll();
        AnimatedLabel scroll= new AnimatedLabel(translator,translator.getString("introduction"));
        JPanel aproval = new JPanel();
        aproval.setLayout(new GridLayout(2,3));
        aproval.add(new JLabel());
        aproval.add(new JLabel());
        aproval.add(new JLabel());
        aproval.add(new JLabel());
        JButton ok = new JButton("OK");
        aproval.add(ok);
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                randomNumber = createRandomNumber();
                while(randomNumber==-1){
                    randomNumber = createRandomNumber();
                }
                if(randomNumber!=-2){
                    createAction();
                }

            }
        });
        aproval.add(new JLabel());
        gamePanel.add(scroll);
        gamePanel.add(aproval);
        this.setContentPane(gamePanel);
        this.setLayout(new GridLayout(2,1));
        this.validate();
    }
    
    private void createAction(){
        this.getContentPane().removeAll();
        String story = translator.getString("promise") + maxGuesses + " " + translator.getString("question") 
                     + translator.getString("instructions");
        AnimatedLabel scroll= new AnimatedLabel(translator,story);
        JPanel aproval = new JPanel();
        aproval.setLayout(new GridLayout(2,3));
        aproval.add(new JLabel());
        aproval.add(new JLabel());
        aproval.add(new JLabel());
        JButton ok = new JButton("OK");
        aproval.add(ok);
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int yesno = JOptionPane.YES_NO_OPTION;
                while(lowerLimit!=upperLimit){
                    if(lowerLimit<upperLimit){
                        int dialogResult = JOptionPane.showConfirmDialog(null, translator.getString("greater") + average(upperLimit,lowerLimit), translator.getString("title") , yesno);    
                        if(dialogResult == 0) {
                            lowerLimit=average(lowerLimit,upperLimit)+1;
                        }else{
                            upperLimit=average(lowerLimit,upperLimit);
                        }
                        result=upperLimit;
                    }else if(upperLimit<lowerLimit){
                        int dialogResult = JOptionPane.showConfirmDialog(null, translator.getString("greater") + average(upperLimit,lowerLimit), translator.getString("title") , yesno);    
                        if(dialogResult == 0) {
                            upperLimit=average(lowerLimit,upperLimit)+1;
                        }else{
                            lowerLimit=average(lowerLimit,upperLimit);
                        }
                        result=lowerLimit;
                    }

                }
                JOptionPane.showMessageDialog(null, translator.getString("answer") + result,":)", JOptionPane.PLAIN_MESSAGE);
            }
        });
        aproval.add(new JLabel());
        JButton menu = new JButton("Menu");
        aproval.add(menu);
        menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                initComponents();
            }
        });
        gamePanel.removeAll();
        gamePanel.add(scroll);
        gamePanel.add(aproval);
        this.setContentPane(gamePanel);
        this.setLayout(new GridLayout(2,1));
        this.validate();
    }
    
    private boolean verifyNumber(String answer){
         if (answer.matches("[0-9]+")){
            if(answer.length()<=10){
                Long beforeIt = Long.parseLong(answer);
                if(beforeIt<=2147483647 || beforeIt>1){
                    return true;
                }
            }
        }
        return false;
    }
    
    private static int howManyTimes(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
    private int createRandomNumber(){
        int limit,answer=-1;
        try{
            String reponse1= JOptionPane.showInputDialog(translator.getString("range1"));
            if(reponse1 == null){
                return -2;
            }else if(verifyNumber(reponse1)){
                lowerLimit=Integer.parseInt(reponse1);
            }else{
                while(!verifyNumber(reponse1)){
                    reponse1= JOptionPane.showInputDialog(translator.getString("range1"));
                    if(reponse1 == null){
                        return -2;
                    }
                }
            lowerLimit = Integer.parseInt(reponse1);
            }
            String reponse2= JOptionPane.showInputDialog(translator.getString("range2"));     
            if(reponse2 == null){
                return -2;
            }else if(verifyNumber(reponse2)){
                upperLimit=Integer.parseInt(reponse2);
            }else{
                while(!verifyNumber(reponse2) ){
                    reponse2= JOptionPane.showInputDialog(translator.getString("range2"));
                    if(reponse2 == null){
                        return -2;
                    }
                }
            upperLimit = Integer.parseInt(reponse2);
            }
            if(upperLimit>lowerLimit){
                limit = upperLimit - lowerLimit;
                maxGuesses = howManyTimes(limit);
                answer =  (new Random().nextInt(limit)) + lowerLimit;
            }else if(lowerLimit>upperLimit){
                limit = lowerLimit - upperLimit;
                maxGuesses = howManyTimes(limit);
                answer = (new Random().nextInt(limit)) + upperLimit;
            }
        }catch(NullPointerException X){}
        return answer;
    }
    
    private int average(int firstNumber, int secondNumber){
        return (firstNumber+secondNumber)/2;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private Locale language = new Locale ("en","EN");
    private ResourceBundle translator = ResourceBundle.getBundle("MessagesBundle", language);
    private ArrayList<Integer> reviewsMade = new ArrayList<Integer>();
    private Toolkit kit = Toolkit.getDefaultToolkit();
    private Image iconImage;
    private JPanel gamePanel = new JPanel();
    private int maxGuesses,upperLimit,lowerLimit,randomNumber,result=0;
}
