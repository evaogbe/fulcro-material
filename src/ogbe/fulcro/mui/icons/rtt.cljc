(ns ogbe.fulcro.mui.icons.rtt
  #?(:cljs (:require
            ["@mui/icons-material/Rtt" :default Rtt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rtt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Rtt)))