(ns ogbe.fulcro.mui.icons.smart-button-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SmartButtonSharp" :default SmartButtonSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-button-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartButtonSharp)))