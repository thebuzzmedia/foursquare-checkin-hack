package com.thebuzzmedia.foursquare.hack.ui;

import com.thebuzzmedia.foursquare.hack.Base64;
import com.thebuzzmedia.foursquare.hack.Main;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;

/**
 * Main UI for the foursquare checkin hack. Created using NetBeans.
 * 
 * @author Riyad Kalla (software@thebuzzmedia.com)
 */
public class MainFrame extends javax.swing.JFrame {

    public static final String WAITING_STATUS_MESSAGE = "Waiting...";
    public static final String WORKING_STATUS_MESSAGE = "Working...";
    public static final String SUCCESS_STATUS_MESSAGE = "Successfully checked in!";
    public static final String ERROR_STATUS_MESSAGE = "An error occured while checking in.";
    public static final Color DEFAULT_STATUS_COLOR = new Color(143, 255, 143);
    public static final Color SUCCESS_STATUS_COLOR = Color.GREEN.brighter().brighter();
    public static final Color ERROR_STATUS_COLOR = new Color(255, 143, 143);

    public MainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        emailTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        venueTitleLabel = new javax.swing.JLabel();
        venueSeparator = new javax.swing.JSeparator();
        venuePanel = new javax.swing.JPanel();
        venueIDLabel = new javax.swing.JLabel();
        venueHelpLabel = new javax.swing.JLabel();
        venueIDTextField = new javax.swing.JTextField();
        latTextField = new javax.swing.JTextField();
        longHelpLabel = new javax.swing.JLabel();
        latLabel = new javax.swing.JLabel();
        longLabel = new javax.swing.JLabel();
        longTextField = new javax.swing.JTextField();
        latHelpLabel = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        rememberCheckBox = new javax.swing.JCheckBox();
        checkInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("foursquare Check-in Hack");
        setName("mainFrame"); // NOI18N
        setResizable(false);

        emailLabel.setText("Email");

        passwordLabel.setText("Password");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        venueTitleLabel.setText("Venue Information");

        venueIDLabel.setText("Venue ID");

        venueHelpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thebuzzmedia/foursquare/hack/resources/help-icon-16x16.png"))); // NOI18N
        venueHelpLabel.setToolTipText("Available from the URL of the venue you want to checkin to from FourSquare.com");

        venueIDTextField.setColumns(8);

        latTextField.setColumns(20);

        longHelpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thebuzzmedia/foursquare/hack/resources/help-icon-16x16.png"))); // NOI18N
        longHelpLabel.setToolTipText("Center the location you want on Google Maps, then check the \"link\" URL for the 'sll' value to get LAT/LONG (in that order)");

        latLabel.setText("Latitude");

        longLabel.setText("Longitude");

        longTextField.setColumns(20);

        latHelpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thebuzzmedia/foursquare/hack/resources/help-icon-16x16.png"))); // NOI18N
        latHelpLabel.setToolTipText("Center the location you want on Google Maps, then check the \"link\" URL for the 'sll' value to get LAT/LONG (in that order)");

        javax.swing.GroupLayout venuePanelLayout = new javax.swing.GroupLayout(venuePanel);
        venuePanel.setLayout(venuePanelLayout);
        venuePanelLayout.setHorizontalGroup(
            venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(venuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(longLabel)
                    .addComponent(venueIDLabel)
                    .addComponent(latLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(venuePanelLayout.createSequentialGroup()
                        .addComponent(venueIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(venueHelpLabel))
                    .addComponent(latTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(longTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(longHelpLabel)
                    .addComponent(latHelpLabel))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        venuePanelLayout.setVerticalGroup(
            venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(venuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(venuePanelLayout.createSequentialGroup()
                        .addGroup(venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(venueIDLabel)
                                .addComponent(venueIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(venueHelpLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(latLabel)
                            .addComponent(latTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(latHelpLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(venuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(longLabel)
                        .addComponent(longTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(longHelpLabel))
                .addContainerGap())
        );

        statusPanel.setBackground(new java.awt.Color(255, 255, 225));
        statusPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        statusLabel.setText(WAITING_STATUS_MESSAGE);
        statusPanel.add(statusLabel);

        rememberCheckBox.setText("Remember values");

        checkInButton.setText("Checkin!");
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(venueTitleLabel)
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(venueSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(venuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rememberCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(checkInButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(venueTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(venueSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(venuePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInButton)
                    .addComponent(rememberCheckBox))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-300)/2, 416, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void clearPrefs() {
        Preferences prefs = Preferences.userNodeForPackage(Main.class);

        if(prefs == null)
            return;

        try{
            prefs.remove(Main.EMAIL_PREF_KEY);
            prefs.remove(Main.VENUE_ID_PREF_KEY);
            prefs.remove(Main.LATITUDE_PREF_KEY);
            prefs.remove(Main.LONGITUDE_PREF_KEY);
        } catch(Exception e) {
            // no-op
        }
    }

    private void loadPrefs() {
        Preferences prefs = Preferences.userNodeForPackage(Main.class);

        if(prefs == null)
            return;

        try {
            emailTextField.setText(prefs.get(Main.EMAIL_PREF_KEY, ""));
            venueIDTextField.setText(prefs.get(Main.VENUE_ID_PREF_KEY, ""));
            latTextField.setText(prefs.get(Main.LATITUDE_PREF_KEY, ""));
            longTextField.setText(prefs.get(Main.LONGITUDE_PREF_KEY, ""));
        } catch(Exception e) {
            // no-op
        }
    }

    private void storePrefs() {
        Preferences prefs = Preferences.userNodeForPackage(Main.class);

        if(prefs == null)
            return;

        try {
            prefs.put(Main.EMAIL_PREF_KEY, emailTextField.getText());
            prefs.put(Main.VENUE_ID_PREF_KEY, venueIDTextField.getText());
            prefs.put(Main.LATITUDE_PREF_KEY, latTextField.getText());
            prefs.put(Main.LONGITUDE_PREF_KEY, longTextField.getText());

            prefs.flush();
        } catch(Exception e) {
            // no-op
        }
    }

    private void updateStatusDisplay(String message, Color background) {
        statusLabel.setText(message);
        statusPanel.setBackground(background);

        // If we are setting a terminal state, re-enable the button. I know, this is lame.
        if(background == SUCCESS_STATUS_COLOR || background == ERROR_STATUS_COLOR)
            checkInButton.setEnabled(true);
    }

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed
        // De-activate the checkin button until done
        checkInButton.setEnabled(false);

        updateStatusDisplay("Verifying Email and Password...", DEFAULT_STATUS_COLOR);

        // Validate the credentials
        String email = emailTextField.getText();
        String password = new String(passwordField.getPassword());

        if (email.length() == 0 || !email.contains("@")) {
            updateStatusDisplay("Email is invalid", ERROR_STATUS_COLOR);
            return;
        } else if (password.length() == 0) {
            updateStatusDisplay("Password is missing", ERROR_STATUS_COLOR);
            return;
        }

        updateStatusDisplay("Base64 Encoding Credentials...", DEFAULT_STATUS_COLOR);

        // Encode the credentials
//        String encodedAuth = Base64.encodeBase64URLSafeString((email + ':' + password).getBytes());
        // Removed the Commoncs Codec dependency and replaced it with an alternative found here:
        // http://iharder.sourceforge.net/current/java/base64/
        String encodedAuth = Base64.encodeBytes((email + ':' + password).getBytes());

        updateStatusDisplay("Validating Venue ID...", DEFAULT_STATUS_COLOR);

        // Validate the venue
        try {
            Integer.parseInt(venueIDTextField.getText());
        } catch (Exception e) {
            updateStatusDisplay("Venue ID is missing or invalid", ERROR_STATUS_COLOR);
            return;
        }

        updateStatusDisplay("Validating Lat/Long Coords...", DEFAULT_STATUS_COLOR);

        // Validate the lat/long
        double lat = 0;
        double lng = 0;

        try {
            lat = Double.parseDouble(latTextField.getText());
            lng = Double.parseDouble(longTextField.getText());
        } catch (Exception e) {
            updateStatusDisplay("Invalid Latitude or Longitude", ERROR_STATUS_COLOR);
            return;
        }

        // Muddle the lat/long coordinates just a bit to seem more natural
        lat = lat + (Math.random() * 0.0003);
        lng = lng + (Math.random() * 0.0003);

        updateStatusDisplay("Generating API query string...", DEFAULT_STATUS_COLOR);

        // Create the query string to be posted to the API
        String args = "vid=" + venueIDTextField.getText() + "&private=0&geolat=" + lat + "&geolong=" + lng;

        updateStatusDisplay("Processing Preferences...", DEFAULT_STATUS_COLOR);

        // If the values should be remembered, store them
        if (rememberCheckBox.isSelected())
            storePrefs();
        else
            clearPrefs();

        updateStatusDisplay("Connecting to 4sq API...", DEFAULT_STATUS_COLOR);

        try {
            // Create the connection to the API
            URLConnection connection = new URL(Main.API_URL).openConnection();

            // Make sure we POST
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);

            // Setup the POST arguments
            connection.setRequestProperty("Host", Main.HOSTNAME);
            connection.setRequestProperty("User-Agent", Main.USER_AGENT);
            connection.setRequestProperty("Content-Type", Main.CONTENT_TYPE);
            connection.setRequestProperty("Authorization", "Basic " + encodedAuth);
            connection.setRequestProperty("Content-Length", Integer.toString(args.length() + 2));

            // Write out our query string arguments with our POST
            DataOutputStream output = new DataOutputStream(connection.getOutputStream());
            output.writeBytes(args);
            output.flush();
            output.close();

            updateStatusDisplay("Data Sent!", DEFAULT_STATUS_COLOR);

            String line;
            StringBuilder response = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Cheap way to read back the contents of the reply
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            updateStatusDisplay("API Reply Read, processing...", DEFAULT_STATUS_COLOR);

            // Even lamer way of finding out if the checkin worked and updating the status
            if (response.toString().contains(Main.SUCCESSFUL_CHECKIN_DELIMITER)) {
                updateStatusDisplay(SUCCESS_STATUS_MESSAGE, SUCCESS_STATUS_COLOR);
            }
        } catch (Exception e) {
            updateStatusDisplay(ERROR_STATUS_MESSAGE, ERROR_STATUS_COLOR);

            // Catch ANYTHING. Likely indicates an error.
            JOptionPane.showMessageDialog(this,
                    "API Error Ocurred: " + e.getMessage());
            return;
        }

        // Safety catch if we haven't re-enabled the button yet and are leaving
        checkInButton.setEnabled(true);
    }//GEN-LAST:event_checkInButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkInButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel latHelpLabel;
    private javax.swing.JLabel latLabel;
    private javax.swing.JTextField latTextField;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel longHelpLabel;
    private javax.swing.JLabel longLabel;
    private javax.swing.JTextField longTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox rememberCheckBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel venueHelpLabel;
    private javax.swing.JLabel venueIDLabel;
    private javax.swing.JTextField venueIDTextField;
    private javax.swing.JPanel venuePanel;
    private javax.swing.JSeparator venueSeparator;
    private javax.swing.JLabel venueTitleLabel;
    // End of variables declaration//GEN-END:variables
}
