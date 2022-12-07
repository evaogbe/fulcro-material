(ns ogbe.fulcro.mui.icons.power-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PowerSharp" :default PowerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-power-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PowerSharp)))