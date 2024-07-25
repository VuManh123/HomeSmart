package com.example.project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private ImageView brandingImage;
    @FXML
    private Label notHaveAccount;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("img/FINTECH.png");
        Image branding = new Image(brandingFile.toURI().toString());
        brandingImage.setImage(branding);
    }

    @FXML
    private void handleNotHaveAccountClick(MouseEvent event) {
        try {
            Parent registerView = FXMLLoader.load(getClass().getResource("/com/example/project/register.fxml"));
            Scene registerScene = new Scene(registerView);

            // Lấy stage hiện tại (cửa sổ)
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

            // Đặt cảnh mới vào stage
            window.setScene(registerScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
