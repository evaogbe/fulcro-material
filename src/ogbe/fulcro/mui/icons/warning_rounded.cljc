(ns ogbe.fulcro.mui.icons.warning-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WarningRounded" :default WarningRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-warning-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WarningRounded)))