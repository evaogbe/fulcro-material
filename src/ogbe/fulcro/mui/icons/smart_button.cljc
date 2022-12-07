(ns ogbe.fulcro.mui.icons.smart-button
  #?(:cljs (:require
            ["@mui/icons-material/SmartButton" :default SmartButton]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-button
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartButton)))