(ns ogbe.fulcro.mui.icons.monitor
  #?(:cljs (:require
            ["@mui/icons-material/Monitor" :default Monitor]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-monitor
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Monitor)))