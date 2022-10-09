package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Once your CashRegister has been activated you can use it to create Tabs. A Tab is a template for
 * a payment. In contrast to requests a Tab is not pointed towards a specific user. Any user can pay
 * the Tab as long as it is made visible by you. The creation of a Tab happens with
 * /tab-usage-single or /tab-usage-multiple. A TabUsageSingle is a Tab that can be paid once. A
 * TabUsageMultiple is a Tab that can be paid multiple times by different users.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tab {

  @JsonProperty("TabUsageSingle")
  private TabUsageSingle tabUsageSingle;

  /** */
  @JsonProperty("TabUsageMultiple")
  private TabUsageMultiple tabUsageMultiple;
}
