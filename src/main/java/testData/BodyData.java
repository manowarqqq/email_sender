package testData;

import java.util.ArrayList;
import java.util.List;

public class BodyData {

    public static List<String> getBodyData() {
        String body1 = "Test body";
        String body2 = "SPEC_CHARS!@#$%^&*()_+/*-";
        String body3 = "Minim cillum adipisicing irure occaecat eu esse quis nostrud aute. Minim labore mollit adipisicing fugiat. Dolor duis irure pariatur non pariatur. Minim quis ut Lorem tempor excepteur consequat ut et incididunt. Nostrud laboris qui adipisicing reprehenderit ex aliquip enim sint minim est Lorem nostrud nisi. Aliquip consequat laboris proident minim amet ad culpa eu quis non sint amet dolor. Aute id minim sit nulla nostrud.\n" +
                "\n" +
                "\n" +
                "Ipsum Lorem et aliqua esse deserunt pariatur commodo. Cupidatat velit sunt mollit irure cillum dolore exercitation proident officia. Aliquip anim anim enim consectetur Lorem nisi. Dolore fugiat aute officia enim cupidatat ea reprehenderit magna incididunt reprehenderit. Excepteur nisi incididunt ut veniam sunt nostrud velit cillum duis duis ullamco sint incididunt.\n" +
                "\n" +
                "Cillum veniam ad cillum aliqua. Dolore aliqua officia deserunt in elit irure consequat eiusmod magna. Exercitation Lorem occaecat officia aliqua aute. Est est elit occaecat anim nostrud laborum eiusmod irure in esse incididunt esse cillum.\n" +
                "\n" +
                "Tempor reprehenderit ex et qui mollit anim dolor pariatur sint est amet. Ullamco duis enim irure aute do officia. Irure exercitation irure ullamco ullamco mollit est irure ipsum cillum aliqua. In labore deserunt deserunt elit elit culpa nostrud. Pariatur occaecat ullamco do non aliquip tempor do proident excepteur. Laborum quis est duis velit eiusmod amet enim proident in non consequat.\n";
        String body4 = "453586\tThomas U. Banks\t829-00-2162\t25253\tRU\t25/5/1966   192.168.12.13   thomas@gmail.com\n" +
                "453587\tArthur E. Powell\t989-00-2795\t86867\tIsrael\t9/10/1966 10.100.12.15  e-powel@mail.ru\n" +
                "453588\tJerome A. Park\t254-26-5781\t52533\tIsrael\t24/1/1969      152.143.21.55    a_park@gmail.com\n" +
                "453589\tHoward G. Cummings\t697-22-4208\t18596\tIsrael\t19/10/1961   212.12.12.12    howard-g@outlook.com\n";

        List<String> bodyList = new ArrayList<>();
        bodyList.add(body1);
        bodyList.add(body2);
        bodyList.add(body3);
        bodyList.add(body4);
        return bodyList;
    }
}
