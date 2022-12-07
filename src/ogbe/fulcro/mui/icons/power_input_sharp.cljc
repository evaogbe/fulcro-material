(ns ogbe.fulcro.mui.icons.power-input-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PowerInputSharp" :default PowerInputSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-power-input-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PowerInputSharp)))