(ns ogbe.fulcro.mui.icons.smart-display-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SmartDisplayRounded" :default SmartDisplayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-display-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartDisplayRounded)))