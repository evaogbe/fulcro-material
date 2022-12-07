(ns ogbe.fulcro.mui.icons.power-off-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PowerOffSharp" :default PowerOffSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-power-off-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PowerOffSharp)))