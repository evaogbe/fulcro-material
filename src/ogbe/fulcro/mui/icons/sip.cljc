(ns ogbe.fulcro.mui.icons.sip
  #?(:cljs (:require
            ["@mui/icons-material/Sip" :default Sip]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sip
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sip)))