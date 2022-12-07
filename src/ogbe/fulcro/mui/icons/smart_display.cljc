(ns ogbe.fulcro.mui.icons.smart-display
  #?(:cljs (:require
            ["@mui/icons-material/SmartDisplay" :default SmartDisplay]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-display
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartDisplay)))