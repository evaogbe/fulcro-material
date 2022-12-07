(ns ogbe.fulcro.mui.icons.smartphone-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SmartphoneSharp" :default SmartphoneSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smartphone-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartphoneSharp)))