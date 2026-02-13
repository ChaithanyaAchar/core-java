class MicrophoneExecutor{
    public static void main(String[] args){
        boolean ref=Microphone.onOrOff();
        System.out.println("The Microphone is switched:"+ref);
	    ref=Speaker.onOrOff();
		System.out.println("The Microphone is switched:"+ref);
    }
}