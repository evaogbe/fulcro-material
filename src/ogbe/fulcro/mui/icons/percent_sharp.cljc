(ns ogbe.fulcro.mui.icons.percent-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PercentSharp" :default PercentSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-percent-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PercentSharp)))