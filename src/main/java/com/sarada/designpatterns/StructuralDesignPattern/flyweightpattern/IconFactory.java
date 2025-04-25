package com.sarada.designpatterns.StructuralDesignPattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory to manage creation and retrieval of flyweight objects
public class IconFactory {
    private Map<String, Icon> iconCache = new HashMap<>();

    public Icon getIcon(String key) {
        // Check if the icon already exists in the cache
        if (iconCache.containsKey(key)) {
            return iconCache.get(key);
        } else {
            // Create a new icon based on the key (type of icon)
            Icon icon;
            if (key.equals("file")) {
                icon = new FileIcon("document", loadImage("document.png"));
            } else if (key.equals("folder")) {
                icon = new FolderIcon("blue", loadImage("folder.png"));
            } else {
                throw new IllegalArgumentException("Unsupported icon type: " + key);
            }
            // Store the created icon in the cache
            iconCache.put(key, icon);
            return icon;
        }
    }

    // Simulated method to load image based on filename
    private Image loadImage(String filename) {
        // Load image from file system or resource
        // Here, returning a dummy Image object
        return new Image(filename);
    }
}