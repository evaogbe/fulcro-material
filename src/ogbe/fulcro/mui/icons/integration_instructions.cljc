(ns ogbe.fulcro.mui.icons.integration-instructions
  #?(:cljs (:require
            ["@mui/icons-material/IntegrationInstructions" :default IntegrationInstructions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-integration-instructions
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IntegrationInstructions)))