package login3;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class VistaLogin extends JPanel {

    private MigLayout migLayout;
    private JTextField JTextFieldUsuario;
    private JPasswordField JPasswordFieldContraseña;
    private JCheckBox CheckboxRecordar;
    private JButton JButtonEntrar;

    public VistaLogin() {
        init();
    }

    private void init() {
        migLayout = new MigLayout("fill,insets 20", "[center]", "[center]");
        setLayout(migLayout);
        JTextFieldUsuario = new JTextField();
        JPasswordFieldContraseña = new JPasswordField();
        CheckboxRecordar = new JCheckBox("Recordar Usuario");
        JButtonEntrar = new JButton("Entrar");
        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:darken(@background,3%); "
                + "[dark]background:lighten(@background,3%);");

        JPasswordFieldContraseña.putClientProperty(FlatClientProperties.STYLE, "" + "showRevealButton:true");

        JTextFieldUsuario.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su nombre");
        JPasswordFieldContraseña.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese su contraseña");
                
        JLabel JLabel1 = new JLabel("Bienvenidos");
        JLabel1.putClientProperty(FlatClientProperties.STYLE, "" + "font:bold +10");
        JLabel JLabel2 = new JLabel("Por favor ingrese secion para poder continuar");
        JLabel2.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground,30%); "
                + "[dark]background:darken(@foreground,30%);");

        panel.add(JLabel1);
        panel.add(JLabel2);
        panel.add(new JLabel("Nombre"), "gapy 8");
        panel.add(JTextFieldUsuario);
        panel.add(new JLabel("Contraseña"), "gapy 8");
        panel.add(JPasswordFieldContraseña);
        panel.add(CheckboxRecordar, "grow 0");
        panel.add(JButtonEntrar, "gapy 10");
        add(panel);
    }

}
