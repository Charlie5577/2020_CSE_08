# 2020_CSE_08
Final Year Project - **WEEK 1**
Android application for visually impaired people.
 
Our proposed model will assist visually impaired to navigate independently without any human assistance. 
Goal of this project is that , the proposed system should be able to run in real-time on the mobile phone with high accuracy and with minimal size and resource usage.
The mobile application uses an android camera to capture and deliver sequence input images to the deep learning model, which perform object recognition and provide voice comments that help the visually impaired understand the objects and obstacles in the outdoor and indoor environment. 
Created a new Android project.
 Downloaded gradle files. 
 Supportive sdk setup.
 Access to camera.
 Explored the working of Tensorflow.
 
 THE FOLLOWING STEPS ARE TAKEN WHEN USING ANDROID CAMERA2 API

1. The android CameraManager class is used to manage all the camera activities in our android device
2. Each camera activitiy has a range of properties and settings that describe the device. It can be obtained through the camera characteristics.
3. To capture or stream images from a camera device, the application must first create a camera capture session
4. The camera capture needs a surface to output what has been captured or being previewed. A target Surface can be obtained from a variety of classes, including SurfaceView, SurfaceTexture.
5. The application then needs to construct a CaptureRequest, which defines all the capture parameters needed by a camera device to capture a single image.
6. Once the request has been set up, it can be handed to the active capture session either for a one-shot capture or for an endlessly repeating use
7. After processing a request, the camera device will produce a TotalCaptureResult object, which contains information about the state of the camera device at time of capture, and the final settings used.



