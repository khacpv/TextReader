package com.oicsoft.mlkit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.oicsoft.mlkit.camera.CameraSource;
import com.oicsoft.mlkit.camera.CameraSourcePreview;

public class CameraActivity extends AppCompatActivity {
    private static final String TAG = "CameraActivity";

    private static final String TEXT_DETECTION = "Text Detection";

    private static final int PERMISSION_REQUESTS = 1;

    private CameraSource cameraSource = null;
    private CameraSourcePreview preview;
    private GraphicOverlay graphicOverlay;

    private String selectedModel = TEXT_DETECTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        preview = findViewById(R.id.firePreview);
        if (preview == null) {
            Log.d(TAG, "Preview is null");
        }
        graphicOverlay = findViewById(R.id.fireTextOverlay);
        if (graphicOverlay == null) {
            Log.d(TAG, "graphicOverlay is null");
        }
    }
}
