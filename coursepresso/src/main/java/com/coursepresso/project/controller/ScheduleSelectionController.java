package com.coursepresso.project.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javax.inject.Inject;

/**
 * FXML Controller class
 *
 * @author Caleb Miller
 */
public class ScheduleSelectionController implements Initializable {
  
  @FXML
  private Node root;
  @FXML
  private Label numberLabel;
  @FXML
  private TableView<?> scheduleTable;
  @FXML
  private TableColumn<?, ?> termColumn;
  @FXML
  private TableColumn<?, ?> statusColumn;
  @FXML
  private Button backButton;
  @FXML
  private Button submitButton;
  
  @Inject
  private MainController mainController;
  
  public Node getView() {
    return root;
  }

  /**
   * Initializes the controller class.
   * 
   * @param url
   * @param rb
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }
  
  @FXML
  private void backButtonClick() {
    mainController.showMenu();
  }
  
}