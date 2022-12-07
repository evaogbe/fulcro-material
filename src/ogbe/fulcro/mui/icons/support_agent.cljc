(ns ogbe.fulcro.mui.icons.support-agent
  #?(:cljs (:require
            ["@mui/icons-material/SupportAgent" :default SupportAgent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-support-agent
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SupportAgent)))