(ns ogbe.fulcro.mui.icons.calculate-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CalculateSharp" :default CalculateSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calculate-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CalculateSharp)))