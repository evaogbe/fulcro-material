(ns ogbe.fulcro.mui.icons.warning-amber
  #?(:cljs (:require
            ["@mui/icons-material/WarningAmber" :default WarningAmber]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-warning-amber
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WarningAmber)))