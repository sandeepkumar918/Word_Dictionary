package com.example.word_dictionary;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DictionaryPage {
    public AnchorPane root;
    DictionaryPage() throws Exception{
        root=FXMLLoader.load(getClass().getResource("DictionaryPage.fxml"));
    }
}
