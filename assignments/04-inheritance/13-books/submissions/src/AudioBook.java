public class AudioBook extends Book{
    
    private double fileSizeInMB;
    private int playLengthInMinutes;
    private String narrator;


    public AudioBook(String title, String outhor, int year, double fileSizeInMB,int playLengthInMinutes,String narrator){

        super(title, outhor, year);
        this.fileSizeInMB = fileSizeInMB;
        this.playLengthInMinutes = playLengthInMinutes;
        this.narrator = narrator;

    }

    @Override
    public String toString(){

        return super.toString() + String.format("Tamanho do arquivo(MB): %.0f%nDuração(MIN): %d%nNarrador: %s", this.fileSizeInMB, this.playLengthInMinutes,this.narrator);
    }

}
