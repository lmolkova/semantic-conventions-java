/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_22_0;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class NetworkAttributes {

  /** Local address of the network connection - IP address or Unix domain socket name. */
  public static final AttributeKey<String> NETWORK_LOCAL_ADDRESS =
      stringKey("network.local.address");

  /** Local port number of the network connection. */
  public static final AttributeKey<Long> NETWORK_LOCAL_PORT = longKey("network.local.port");

  /** Peer address of the network connection - IP address or Unix domain socket name. */
  public static final AttributeKey<String> NETWORK_PEER_ADDRESS = stringKey("network.peer.address");

  /** Peer port number of the network connection. */
  public static final AttributeKey<Long> NETWORK_PEER_PORT = longKey("network.peer.port");

  /**
   * <a href="https://osi-model.com/application-layer/">OSI application layer</a> or non-OSI
   * equivalent.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_PROTOCOL_NAME =
      stringKey("network.protocol.name");

  /**
   * Version of the protocol specified in {@code network.protocol.name}.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>{@code network.protocol.version} refers to the version of the protocol used and might be
   *       different from the protocol client's version. If the HTTP client used has a version of
   *       {@code 0.27.2}, but sends HTTP version {@code 1.1}, this attribute should be set to
   *       {@code 1.1}.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_PROTOCOL_VERSION =
      stringKey("network.protocol.version");

  /**
   * <a href="https://osi-model.com/transport-layer/">OSI transport layer</a> or <a
   * href="https://en.wikipedia.org/wiki/Inter-process_communication">inter-process communication
   * method</a>.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   *   <li>Consider always setting the transport when setting a port number, since a port number is
   *       ambiguous without knowing the transport, for example different processes could be
   *       listening on TCP port 12345 and UDP port 12345.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_TRANSPORT = stringKey("network.transport");

  /**
   * <a href="https://osi-model.com/network-layer/">OSI network layer</a> or non-OSI equivalent.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_TYPE = stringKey("network.type");

  /** The ISO 3166-1 alpha-2 2-character country code associated with the mobile carrier network. */
  public static final AttributeKey<String> NETWORK_CARRIER_ICC = stringKey("network.carrier.icc");

  /** The mobile carrier country code. */
  public static final AttributeKey<String> NETWORK_CARRIER_MCC = stringKey("network.carrier.mcc");

  /** The mobile carrier network code. */
  public static final AttributeKey<String> NETWORK_CARRIER_MNC = stringKey("network.carrier.mnc");

  /** The name of the mobile carrier. */
  public static final AttributeKey<String> NETWORK_CARRIER_NAME = stringKey("network.carrier.name");

  /**
   * This describes more details regarding the connection.type. It may be the type of cell
   * technology connection, but it could be used for describing details about a wifi connection.
   */
  public static final AttributeKey<String> NETWORK_CONNECTION_SUBTYPE =
      stringKey("network.connection.subtype");

  /** The internet connection type. */
  public static final AttributeKey<String> NETWORK_CONNECTION_TYPE =
      stringKey("network.connection.type");

  // Enum definitions
  public static final class NetworkTransportValues {
    /** TCP. */
    public static final String TCP = "tcp";

    /** UDP. */
    public static final String UDP = "udp";

    /** Named or anonymous pipe. See note below. */
    public static final String PIPE = "pipe";

    /** Unix domain socket. */
    public static final String UNIX = "unix";

    private NetworkTransportValues() {}
  }

  public static final class NetworkTypeValues {
    /** IPv4. */
    public static final String IPV4 = "ipv4";

    /** IPv6. */
    public static final String IPV6 = "ipv6";

    private NetworkTypeValues() {}
  }

  public static final class NetworkConnectionSubtypeValues {
    /** GPRS. */
    public static final String GPRS = "gprs";

    /** EDGE. */
    public static final String EDGE = "edge";

    /** UMTS. */
    public static final String UMTS = "umts";

    /** CDMA. */
    public static final String CDMA = "cdma";

    /** EVDO Rel. 0. */
    public static final String EVDO_0 = "evdo_0";

    /** EVDO Rev. A. */
    public static final String EVDO_A = "evdo_a";

    /** CDMA2000 1XRTT. */
    public static final String CDMA2000_1XRTT = "cdma2000_1xrtt";

    /** HSDPA. */
    public static final String HSDPA = "hsdpa";

    /** HSUPA. */
    public static final String HSUPA = "hsupa";

    /** HSPA. */
    public static final String HSPA = "hspa";

    /** IDEN. */
    public static final String IDEN = "iden";

    /** EVDO Rev. B. */
    public static final String EVDO_B = "evdo_b";

    /** LTE. */
    public static final String LTE = "lte";

    /** EHRPD. */
    public static final String EHRPD = "ehrpd";

    /** HSPAP. */
    public static final String HSPAP = "hspap";

    /** GSM. */
    public static final String GSM = "gsm";

    /** TD-SCDMA. */
    public static final String TD_SCDMA = "td_scdma";

    /** IWLAN. */
    public static final String IWLAN = "iwlan";

    /** 5G NR (New Radio). */
    public static final String NR = "nr";

    /** 5G NRNSA (New Radio Non-Standalone). */
    public static final String NRNSA = "nrnsa";

    /** LTE CA. */
    public static final String LTE_CA = "lte_ca";

    private NetworkConnectionSubtypeValues() {}
  }

  public static final class NetworkConnectionTypeValues {
    /** wifi. */
    public static final String WIFI = "wifi";

    /** wired. */
    public static final String WIRED = "wired";

    /** cell. */
    public static final String CELL = "cell";

    /** unavailable. */
    public static final String UNAVAILABLE = "unavailable";

    /** unknown. */
    public static final String UNKNOWN = "unknown";

    private NetworkConnectionTypeValues() {}
  }

  private NetworkAttributes() {}
}
