package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblMessage;

    // Tài khoản và mật khẩu mẫu
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "admin";

    public void handleLogin(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            // Đăng nhập thành công, chuyển sang giao diện chính
            lblMessage.setText("Đăng nhập thành công!");
            lblMessage.setStyle("-fx-text-fill: green;");
            
            try {
                // Tải giao diện chính
                FXMLLoader loader = new FXMLLoader(getClass().getResource("form/MainFunction_Class.fxml"));
                Parent mainSceneParent = loader.load();
                Scene mainScene = new Scene(mainSceneParent);
                
                // Lấy Stage hiện tại từ sự kiện
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(mainScene);
                window.centerOnScreen();
                
            } catch (IOException e) {
                lblMessage.setText("Lỗi: Không thể tải giao diện chính.");
                lblMessage.setStyle("-fx-text-fill: red;");
            }
        } else {
            // Đăng nhập thất bại
            lblMessage.setText("Tên đăng nhập hoặc mật khẩu không đúng!");
            lblMessage.setStyle("-fx-text-fill: red;");
        }
        lblMessage.setVisible(true);
    }
}