(ns ogbe.fulcro.mui.icons.integration-instructions-outlined
  #?(:cljs (:require
            ["@mui/icons-material/IntegrationInstructionsOutlined" :default IntegrationInstructionsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-integration-instructions-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IntegrationInstructionsOutlined)))