// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/FetchAllNewsResponse.proto

package POGOProtos.Networking.Responses;

public interface FetchAllNewsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.FetchAllNewsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.FetchAllNewsResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.FetchAllNewsResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.FetchAllNewsResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.News.CurrentNews current_news = 2;</code>
   * @return Whether the currentNews field is set.
   */
  boolean hasCurrentNews();
  /**
   * <code>.POGOProtos.Data.News.CurrentNews current_news = 2;</code>
   * @return The currentNews.
   */
  POGOProtos.Data.News.CurrentNews getCurrentNews();
  /**
   * <code>.POGOProtos.Data.News.CurrentNews current_news = 2;</code>
   */
  POGOProtos.Data.News.CurrentNewsOrBuilder getCurrentNewsOrBuilder();
}
