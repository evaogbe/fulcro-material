(ns ogbe.fulcro.mui.icons.smart-screen-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SmartScreenSharp" :default SmartScreenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-screen-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartScreenSharp)))