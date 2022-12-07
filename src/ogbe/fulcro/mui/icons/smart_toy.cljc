(ns ogbe.fulcro.mui.icons.smart-toy
  #?(:cljs (:require
            ["@mui/icons-material/SmartToy" :default SmartToy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-toy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartToy)))