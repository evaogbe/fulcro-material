(ns ogbe.fulcro.mui.icons.fitbit-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FitbitSharp" :default FitbitSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fitbit-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FitbitSharp)))