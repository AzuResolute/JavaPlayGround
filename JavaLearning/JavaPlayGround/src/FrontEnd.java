public class FrontEnd {
    private static String webpage;
    public static void main(String[] args) {
        webpage += "<HTML>\n";
        webpage += "<HEAD>\n";
        webpage += "</HEAD>\n";
        webpage += "<BODY>\n";
        webpage += "<TABLE>\n";
        String s =  dummyGetDataByWeek("2020-1-30");
        String[] fields = s.split(",");
        assert fields.length == 5;
        //        webpage += "<TR>\n";
        //        webpage += "<TD>\n";
        //        webpage += fields[0];
        //        webpage += "</TD>\n";
        //        webpage += "<TD>\n";
        //        webpage += fields[1];
        //        webpage += "</TD>\n";
        //        webpage += "<TD>\n";
        //        webpage += fields[2];
        //        webpage += "</TD>\n";
        //        webpage += "</TR>\n";
        webpage += printRow(fields);
        webpage += "</TABLE>\n";
        webpage += "</BODY>\n";
        webpage += "</HTML>\n";
        System.out.println(webpage);
        System.exit(0);
    }
    private static String printRow(String[] data) {
        String row =   "<tr>\n";
                row += "    <td>"+ data[0] +"</td>\n";
                row += "    <td>"+ data[1] +"</td>\n";
                row += "    <td>"+ data[2] +"</td>\n";
                row += "    <td>"+ data[3] +"</td>\n";
                row += "    <td>"+ data[4] +"</td>\n";
                row += "<tr>\n";
        return row;
    }
    private static String dummyGetDataByWeek(String s) {
        return "100.1234,200.1234,300.1234,400.1234,500";
    }
}