import org.hyperskill.hstest.dynamic.DynamicTest;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testing.TestedProgram;

public class ZookeeperTest extends StageTest {
    @DynamicTest
    CheckResult test() {
        var testedProgram = new TestedProgram();
        var output = testedProgram.start().strip();

        String correctOutput = """
            I love animals!
            Let's check on the animals...
            The deer looks fine.
            The bat looks happy.
            The lion looks healthy.
            """;

        if (!output.equals(correctOutput.strip())) {
            return CheckResult.wrong("Your output should be like in the example!");
        }

        return CheckResult.correct();
    }
}