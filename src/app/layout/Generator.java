package app.layout;

import alert.Alert;
import core.CoreGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Generator extends JPanel {
    private final JTextField jTextField1 = new JTextField();
    private final JButton jButton1 = new JButton("Generate");
    private final JButton jButton2 = new JButton("Copy");
    private final JLabel jLabel1 = new JLabel("Strength: Very Strong - Time to crack: Very long time");
    private final JProgressBar jProgressBar1 = new JProgressBar();
    private final JLabel jLabel2 = new JLabel("Length: 12");
    private final JSlider jSlider1 = new JSlider();
    private final JCheckBox jCheckBox1 = new JCheckBox("LowerCase");
    private final JCheckBox jCheckBox2 = new JCheckBox("UpperCase");
    private final JCheckBox jCheckBox3 = new JCheckBox("Numbers");
    private final JCheckBox jCheckBox4 = new JCheckBox("Symbols");
    CoreGenerator coreGenerator = new CoreGenerator();

    public Generator() {
        initComponents();
        initEvents();
    }

    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JToolBar jToolBar1 = new JToolBar();
        JSeparator jSeparator1 = new JSeparator();
        JToolBar jToolBar2 = new JToolBar();
        Box.Filler filler1 = new Box.Filler(new Dimension(24, 0), new Dimension(24, 0), new Dimension(24, 32767));
        Box.Filler filler2 = new Box.Filler(new Dimension(24, 0), new Dimension(24, 0), new Dimension(24, 32767));
        Box.Filler filler3 = new Box.Filler(new Dimension(24, 0), new Dimension(24, 0), new Dimension(24, 32767));
        Box.Filler filler4 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));

        jToolBar1.setRollover(true);

        jTextField1.setFont(new Font("", Font.BOLD, 20));
        jToolBar1.add(jTextField1);

        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jLabel2.setFont(new Font("", Font.ITALIC, 13));

        jProgressBar1.setValue(100);
        jProgressBar1.setStringPainted(true);

        jLabel2.setFont(new Font("", Font.ITALIC, 13));

        jSlider1.setMajorTickSpacing(32);
        jSlider1.setMaximum(32);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(12);

        jToolBar2.setRollover(true);

        jCheckBox1.setSelected(true);
        jCheckBox1.setFocusable(false);
        jCheckBox1.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox1);
        jToolBar2.add(filler1);

        jCheckBox2.setSelected(true);
        jCheckBox2.setFocusable(false);
        jCheckBox2.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox2);
        jToolBar2.add(filler2);

        jCheckBox3.setSelected(true);
        jCheckBox3.setFocusable(false);
        jCheckBox3.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox3.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox3);
        jToolBar2.add(filler3);

        jCheckBox4.setFocusable(false);
        jCheckBox4.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox4.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox4);
        jToolBar2.add(filler4);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jSlider1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jToolBar1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jProgressBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jToolBar2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToolBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jProgressBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jSlider1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToolBar2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }

    private void initEvents() {
        createPassword();
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                textPassword();
            }
        });
        jButton1.addActionListener(e -> createPassword());
        jButton2.addActionListener(e -> {
            String text = jTextField1.getText();
            coreGenerator.copyToClipboard(text);
        });
        jSlider1.addChangeListener(e -> createPassword());
        jCheckBox1.addActionListener(e -> checkCheckBox());
        jCheckBox2.addActionListener(e -> checkCheckBox());
        jCheckBox3.addActionListener(e -> checkCheckBox());
        jCheckBox4.addActionListener(e -> checkCheckBox());
    }

    private void textPassword() {
        String password = jTextField1.getText();
        int length = password.length();
        int complexity = coreGenerator.getComplexity(password, length);
        String strength = coreGenerator.getStrength(complexity);

        jLabel1.setText(strength);
        jProgressBar1.setValue(complexity);
    }

    private void createPassword() {
        int length = jSlider1.getValue();
        boolean useLowerCase = jCheckBox1.isSelected();
        boolean useUpperCase = jCheckBox2.isSelected();
        boolean useNumbers = jCheckBox3.isSelected();
        boolean useSymbols = jCheckBox4.isSelected();

        String password = coreGenerator.generatePassword(length, useLowerCase, useUpperCase, useNumbers, useSymbols);
        int complexity = coreGenerator.getComplexity(password, length);
        String strength = coreGenerator.getStrength(complexity);
        jTextField1.setText(password);
        jLabel1.setText(strength);
        jProgressBar1.setValue(complexity);
        jLabel2.setText("Length: " + length);
    }

    private void setCheckBoxForeground(Color color) {
        jCheckBox1.setForeground(color);
        jCheckBox2.setForeground(color);
        jCheckBox3.setForeground(color);
        jCheckBox4.setForeground(color);
    }

    private void checkCheckBox() {
        boolean useLowerCase = jCheckBox1.isSelected();
        boolean useUpperCase = jCheckBox2.isSelected();
        boolean useNumbers = jCheckBox3.isSelected();
        boolean useSymbols = jCheckBox4.isSelected();
        boolean areSelected = useLowerCase || useUpperCase || useNumbers || useSymbols;

        setCheckBoxForeground(UIManager.getColor("JCheckBox.foreground"));
        if (!areSelected) {
            setCheckBoxForeground(Color.RED);
            new Alert("Please, select at least one option to generate a password.");
        }
    }
}
