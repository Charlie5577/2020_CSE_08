private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        LOGGER.d("onCreate " + this);
        super.onCreate(null);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_camera);

        if (hasPermission()) {
            setFragment();
        } else {
            requestPermission();
        }

        this.textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    LOGGER.i("onCreate", "TextToSpeech is initialised");
                } else {
                    LOGGER.e("onCreate", "Cannot initialise text to speech!");
                }
            }
        });

    }

private List<Classifier.Recognition> currentRecognitions;
protected void toSpeech(List<Classifier.Recognition> recognitions) {
if (recognitions.isEmpty() || textToSpeech.isSpeaking()) {
currentRecognitions = Collections.emptyList();
return;
}
if (currentRecognitions != null) {
if (currentRecognitions.equals(recognitions)) {
return;
}
final Set<Classifier.Recognition> intersection = new HashSet<>(recognitions);
intersection.retainAll(currentRecognitions);
if (intersection.equals(recognitions)) {
return;
}
}
currentRecognitions = recognitions;
speak();
}
private void speak() {
final double letStart = 0;
final double previewArea = previewWidth * previewHeight;
StringBuilder stringBuilder = new StringBuilder();
for (int i = 0; i < currentRecognitions.size(); i++) {
Classifier.Recognition recognition = currentRecognitions.get(i);
stringBuilder.append(recognition.getTitle());
float start = recognition.getLocation().top;
float end = recognition.getLocation().bottom;
double objArea = recognition.getLocation().width() * recognition.getLocation().height();
}
stringBuilder.append(" detected.");
textToSpeech.speak(stringBuilder.toString(), TextToSpeech.QUEUE_FLUSH, null);
}
}
