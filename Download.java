class DownloadPart extends Thread {

    private String partName;

    public DownloadPart(String partName) {
        this.partName = partName;
    }

    @Override
    public void run() {
        try {
            System.out.println(partName + " downloading...");
            Thread.sleep(2000); 
            System.out.println(partName + " completed.");
        } catch (InterruptedException e) {
            System.out.println(partName + " interrupted.");
        }
    }
}

public class Download {
    public static void main(String[] args) {

        
        DownloadPart part1 = new DownloadPart("Part 1");
        DownloadPart part2 = new DownloadPart("Part 2");

        
        part1.start();
        part2.start();

        try {
            
            part1.join();
            part2.join();
        } catch (InterruptedException e) {
            System.out.println("Download interrupted.");
        }

        System.out.println("File download completed.");
    }
}
