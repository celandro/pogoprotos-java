package GameDecodeTest;

import POGOProtos.Rpc.*;
import com.google.protobuf.util.*;
import org.junit.*;

import java.io.*;

public class AssetsDigestDecodeTest {
	//0.187.1 binary
	@Test
	public void TestAssetsDigestDecode() throws Exception {
		try (InputStream is = getClass().getResourceAsStream("/ASSET_DIGEST"))
        {
			AssetDigestOutProto response = AssetDigestOutProto.parseFrom(is);
			JsonFormat.Printer printer = JsonFormat.printer();
			try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("target/test-classes/ASSET_DIGEST.json")))
            {
				printer.appendTo(response, writer);
			}
		}
	}
}
