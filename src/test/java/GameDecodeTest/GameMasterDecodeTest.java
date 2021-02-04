package GameDecodeTest;

import POGOProtos.Rpc.*;
import com.google.protobuf.util.*;
import org.junit.*;

import java.io.*;

public class GameMasterDecodeTest {
	//0.199.0 binary
	@Test
	public void TestFirmwareGameMasterDecode() throws Exception {
		try (InputStream is = getClass().getResourceAsStream("/v2_GAME_MASTER")) {
			DownloadGmTemplatesResponseProto response = DownloadGmTemplatesResponseProto.parseFrom(is);
		    JsonFormat.Printer printer = JsonFormat.printer();
			try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("target/test-classes/v2_GAME_MASTER.json")))
			{
				printer.appendTo(response, writer);
			}
		}
	}
}
