/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ProcessIncubatingAttributes {

  /**
   * The command used to launch the process (i.e. the command name). On Linux based systems, can be
   * set to the zeroth string in {@code proc/[pid]/cmdline}. On Windows, can be set to the first
   * parameter extracted from {@code GetCommandLineW}.
   */
  public static final AttributeKey<String> PROCESS_COMMAND = stringKey("process.command");

  /**
   * All the command arguments (including the command/executable itself) as received by the process.
   * On Linux-based systems (and some other Unixoid systems supporting procfs), can be set according
   * to the list of null-delimited strings extracted from {@code proc/[pid]/cmdline}. For libc-based
   * executables, this would be the full argv vector passed to {@code main}.
   */
  public static final AttributeKey<List<String>> PROCESS_COMMAND_ARGS =
      stringArrayKey("process.command_args");

  /**
   * The full command used to launch the process as a single string representing the full command.
   * On Windows, can be set to the result of {@code GetCommandLineW}. Do not set this if you have to
   * assemble it just for monitoring; use {@code process.command_args} instead.
   */
  public static final AttributeKey<String> PROCESS_COMMAND_LINE = stringKey("process.command_line");

  /** Specifies whether the context switches for this data point were voluntary or involuntary. */
  public static final AttributeKey<String> PROCESS_CONTEXT_SWITCH_TYPE =
      stringKey("process.context_switch_type");

  /**
   * The CPU state for this data point. A process SHOULD be characterized <em>either</em> by data
   * points with no {@code state} labels, <em>or only</em> data points with {@code state} labels.
   */
  public static final AttributeKey<String> PROCESS_CPU_STATE = stringKey("process.cpu.state");

  /**
   * The name of the process executable. On Linux based systems, can be set to the {@code Name} in
   * {@code proc/[pid]/status}. On Windows, can be set to the base name of {@code
   * GetProcessImageFileNameW}.
   */
  public static final AttributeKey<String> PROCESS_EXECUTABLE_NAME =
      stringKey("process.executable.name");

  /**
   * The full path to the process executable. On Linux based systems, can be set to the target of
   * {@code proc/[pid]/exe}. On Windows, can be set to the result of {@code
   * GetProcessImageFileNameW}.
   */
  public static final AttributeKey<String> PROCESS_EXECUTABLE_PATH =
      stringKey("process.executable.path");

  /** The username of the user that owns the process. */
  public static final AttributeKey<String> PROCESS_OWNER = stringKey("process.owner");

  /**
   * The type of page fault for this data point. Type {@code major} is for major/hard page faults,
   * and {@code minor} is for minor/soft page faults.
   */
  public static final AttributeKey<String> PROCESS_PAGING_FAULT_TYPE =
      stringKey("process.paging.fault_type");

  /** Parent Process identifier (PPID). */
  public static final AttributeKey<Long> PROCESS_PARENT_PID = longKey("process.parent_pid");

  /** Process identifier (PID). */
  public static final AttributeKey<Long> PROCESS_PID = longKey("process.pid");

  /**
   * An additional description about the runtime of the process, for example a specific vendor
   * customization of the runtime environment.
   */
  public static final AttributeKey<String> PROCESS_RUNTIME_DESCRIPTION =
      stringKey("process.runtime.description");

  /**
   * The name of the runtime of this process. For compiled native binaries, this SHOULD be the name
   * of the compiler.
   */
  public static final AttributeKey<String> PROCESS_RUNTIME_NAME = stringKey("process.runtime.name");

  /**
   * The version of the runtime of this process, as returned by the runtime without modification.
   */
  public static final AttributeKey<String> PROCESS_RUNTIME_VERSION =
      stringKey("process.runtime.version");

  // Enum definitions
  /** Values for {@link #PROCESS_CONTEXT_SWITCH_TYPE}. */
  public static final class ProcessContextSwitchTypeValues {
    /** voluntary. */
    public static final String VOLUNTARY = "voluntary";

    /** involuntary. */
    public static final String INVOLUNTARY = "involuntary";

    private ProcessContextSwitchTypeValues() {}
  }

  /** Values for {@link #PROCESS_CPU_STATE}. */
  public static final class ProcessCpuStateValues {
    /** system. */
    public static final String SYSTEM = "system";

    /** user. */
    public static final String USER = "user";

    /** wait. */
    public static final String WAIT = "wait";

    private ProcessCpuStateValues() {}
  }

  /** Values for {@link #PROCESS_PAGING_FAULT_TYPE}. */
  public static final class ProcessPagingFaultTypeValues {
    /** major. */
    public static final String MAJOR = "major";

    /** minor. */
    public static final String MINOR = "minor";

    private ProcessPagingFaultTypeValues() {}
  }

  private ProcessIncubatingAttributes() {}
}
