package org.example.app.controller;

import org.example.app.model.AppModel;
import org.example.app.util.Constants;
import org.example.app.view.AppView;

public class AppController {

    private final AppModel model = new AppModel();
    private final AppView view = new AppView();

    public void runApp(){
        String choice = getChoice();
        switch (choice){
            case "0" -> {
                sendExitMessage();
                return;
            }
            case "1" -> {
                try{
                    long seconds = Long.parseLong(getSeconds());
                    view.getOutput(
                            model.convertSecondInFormat(
                                    seconds, Constants.HOUR_MINUTE_SECOND_FORMAT
                            )
                    );
                }catch (NumberFormatException e){
                    sendErrorMessage("You have entered invalid data!");
                }
            }
            default -> sendErrorMessage("You have chosen a non-existent option!");
        }
        runApp();
    }

    private String getChoice(){
        view.getMenu();
        return view.getData();
    }

    private String getSeconds(){
        view.getOutput("Enter seconds: ");
        return view.getData();
    }

    private void sendExitMessage(){
        view.getOutput("Exit...");
    }

    private void sendErrorMessage(String message){
        view.getOutput(message);
    }

}
