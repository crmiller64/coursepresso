package com.coursepresso.project.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javax.inject.Inject;

/**
 * FXML Controller class
 *
 * @author steev_000
 */
public class MenuController implements Initializable {

  @FXML
  private Node root;
  @FXML
  private Button searchCoursesButton;
  @FXML
  private Button newCourseButton;
  @FXML
  private Button displayConflictsButton;
  @FXML
  private Button newScheduleButton;
  
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
  private void newCourseButtonClick(ActionEvent event) {
    mainController.showNewCourseSection();
  }
  
  @FXML
  private void displayConflictsButtonClick(ActionEvent event) {
    mainController.showScheduleSelection();
  }
  
}
