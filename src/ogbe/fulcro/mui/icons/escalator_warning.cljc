(ns ogbe.fulcro.mui.icons.escalator-warning
  #?(:cljs (:require
            ["@mui/icons-material/EscalatorWarning" :default EscalatorWarning]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-escalator-warning
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EscalatorWarning)))