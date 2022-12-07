(ns ogbe.fulcro.mui.icons.smart-button-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SmartButtonRounded" :default SmartButtonRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-button-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartButtonRounded)))